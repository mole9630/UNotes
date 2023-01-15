package com.itheima.reggie.filter;

import com.alibaba.fastjson.JSON;
import com.itheima.reggie.common.BaseContext;
import com.itheima.reggie.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.AntPathMatcher;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 检查用户是否登录的过滤器
 */
@WebFilter(filterName = "loginCheckFilter", urlPatterns = "/*")
@Slf4j
public class LoginCheckFilter implements Filter {
    // 路径匹配器, 支持通配符
    public static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
//        log.info("LoginCheckFilter拦截到请求: {}", request.getRequestURI()); //debug

        // 1.获取本次请求的URI
        String requestURI = request.getRequestURI();
        // 设置不需要处理拦截的请求路径
        String[] urls = new String[] {
            "/employee/login",
            "/employee/logout",
            "/backend/**",
            "/frontend/**"
        };

        // 2.判断本次请求是否需要处理
        boolean check = check(requestURI, urls);

        // 3.如果不需要处理，则直接放行
        if (check) {
//            log.info("本次请求{}无需拦截处理", requestURI); //debug
            filterChain.doFilter(request, response);
            return;
        }

        // 4.判断登录状态，如果已登录，则直接放行
        if (request.getSession().getAttribute("employee") != null) {
//            log.info("用户已登录, 用户id为: {}", request.getSession().getAttribute("employee")); //debug
            // 将用户id保存到ThreadLocal中
            Long empId = (Long) request.getSession().getAttribute("employee");
            BaseContext.setCurrentId(empId);
            filterChain.doFilter(request, response);
            return;
        }

        // 5.如果未登录则返回未登录结果, 通过输出流向客户端响应数据
//        log.info("用户未登录-{}", requestURI); //debug
        response.getWriter().write(JSON.toJSONString(R.error("NOTLOGIN")));
        return;
    }

    /**
     * 路径匹配, 检查本次请求是否可以放行
     * @param requestURI 本次请求的URI
     * @param urls 不需要处理的请求路径
     * @return true:可以放行, false:不可以放行
     */
    public boolean check(String requestURI, String[] urls) {
        for (String url : urls) {
            if (PATH_MATCHER.match(url, requestURI)) {
                return true;
            }
        }
        return false;
    }
}
