package com.itheima.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.reggie.common.R;
import com.itheima.reggie.entity.Employee;
import com.itheima.reggie.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    /**
     * 员工登录
     * @param request 请求
     * @param employee 员工信息
     * @return
     */
    @PostMapping("/login")
    public R<Employee> login(HttpServletRequest request, @RequestBody Employee employee) {
        // 1.将页面提交的密码password进行md5加密处理
        String password = employee.getPassword();
        password = DigestUtils.md5DigestAsHex(password.getBytes());

        // 2.根据页面提交的用户名username查询数据库
        LambdaQueryWrapper<Employee> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Employee::getUsername, employee.getUsername());
        Employee emp = employeeService.getOne(queryWrapper);

        // 3.如果没有查询到则返回登录失败结果
        if (emp == null) {
            return R.error("用户名错误, 请重新输入");
        }

        // 4.密码比对, 如果不一致则返回登录失败结果
        if (!emp.getPassword().equals(password)) {
            return R.error("密码错误, 请重新输入");
        }

        // 5.查看员工状态, 如果为已禁用状态, 则返回员工已禁用结果
        if (emp.getStatus() == 0) {
            return R.error("员工已被禁用, 请联系管理员");
        }

        // 6.登录成功, 将员Iid存入Session并返回登录成功结果
        request.getSession().setAttribute("employee", emp.getId());
        return R.success(emp);
    }

    /**
     * 员工退出登录
     * @param request 请求
     * @return 退出登录结果
     */
    @PostMapping("/logout")
    public R<String> logout(HttpServletRequest request) {
        // 1.清理Session中保存的当前登录的员工id
        request.getSession().removeAttribute("employee");
        return R.success("退出成功");
    }

    @PostMapping
    public R<String> save(HttpServletRequest request, @RequestBody Employee employee) {
//        log.info("新增员工的信息: {}", employee); //debug
        // 设置初始密码为:123456, 但需md5加密处理
        employee.setPassword(DigestUtils.md5DigestAsHex("123456".getBytes()));
        employee.setCreateTime(LocalDateTime.now()); // 设置创建时间
        employee.setUpdateTime(LocalDateTime.now()); // 设置更新时间
        // 获得当前登录用户的id
        Long empId = (Long) request.getSession().getAttribute("employee");
        employee.setCreateUser(empId); // 设置创建人
        employee.setUpdateUser(empId); // 设置更新人
        employeeService.save(employee);
        return R.success("员工添加成功");
    }

    /**
     * 分页查询员工信息
     * @param page 当前页数
     * @param pageSize 每页显示的记录数
     * @param name 员工姓名(条件查询)
     * @return 员工信息
     */
    @GetMapping("/page")
    public R<Page> page(int page, int pageSize, String name) {
//        log.info("page = {}, pageSize = {}, name = {}", page, pageSize, name); // debug
        // 1.构造分页构造器
        Page pageInfo = new Page<>(page, pageSize);

        // 2.构造条件构造器
        LambdaQueryWrapper<Employee> queryWrapper = new LambdaQueryWrapper<Employee>();
        // 判断是否有条件查询
        queryWrapper.like(StringUtils.isNotEmpty(name), Employee::getName, name);
        // 添加排序条件
        queryWrapper.orderByDesc(Employee::getUpdateTime);

        // 3.执行程序
        employeeService.page(pageInfo, queryWrapper);

        return R.success(pageInfo);
    }

    @PutMapping
    public R<String> update(HttpServletRequest request ,@RequestBody Employee employee) {
//        log.info(employee.toString()); //debug
        Long empId = (Long) request.getSession().getAttribute("employee");
        employee.setUpdateTime(LocalDateTime.now()); // 设置更新时间
        employee.setUpdateUser(empId); // 设置更新人
        employeeService.updateById(employee);
        return R.success("员工账号状态修改成功");
    }
}
