package com.itheima.reggie.controller;

import com.itheima.reggie.common.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

/**
 * 文件上传和下载
 */
@RestController
@RequestMapping("/common")
public class CommonController {
    @Value("${reggie.path}")
    private String basePath;

    @PostMapping("/upload")
    public R<String> update(MultipartFile file) { // 变量名file必须和input标签name一致
        // file是一个临时文件, 需要转存到指定位置, 否则本次请求完成后临时文件会删除
        // 处理文件名
        String originalFilename = file.getOriginalFilename(); // 获取原始文件名
        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
        // 使用UUID重新生成文件名, 避免文件名重复被覆盖
        String fileName = UUID.randomUUID().toString() + suffix;

        // 生成文件夹
        File dir = new File(basePath);
        // 判断目录是否存在
        if (!dir.exists()) {
            // 不存在则创建
            dir.mkdirs();
        }
        try {
            // 将临时文件转存到指定位置
            file.transferTo(new File(basePath + fileName));
        } catch (IOException e) {
            e.getMessage();
        }
        return R.success(fileName);
    }

    @GetMapping("/download")
    public void download(String name, HttpServletResponse response) {
        try {
            // 输入流-通过输入流读取文件内容
            FileInputStream fileInputStream = new FileInputStream(new File(basePath + name));

            // 输出流-通过输出流将文件内容写出到浏览器
            ServletOutputStream outputStream = response.getOutputStream();

            response.setContentType("image/jpeg"); // 设置响应头, 告诉浏览器文件类型

            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = fileInputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len); // 写入bytes数组的0到len位置的内容
                outputStream.flush(); // 刷新缓冲区
            }

            // 关闭输入输出流
            outputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
