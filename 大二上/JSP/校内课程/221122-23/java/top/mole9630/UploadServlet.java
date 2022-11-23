package top.mole9630;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.List;
import java.util.UUID;

@WebServlet(name = "UploadServlet", value = "/UploadServlet")
public class UploadServlet extends HttpServlet {
    public static final long serialVersionUID = 1l;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            DiskFileItemFactory factory = new DiskFileItemFactory();
            File file = new File("c:\\TempFolder");
            if (! file.exists()) {
                file.mkdirs();
            }
            factory.setRepository(file);
            ServletFileUpload fileUpload = new ServletFileUpload(factory);
            fileUpload.setHeaderEncoding("utf-8");
            List<FileItem> fileitems = fileUpload.parseRequest(request);
            PrintWriter writer = response.getWriter();
            for (FileItem fileItem :
                    fileitems) {
                if (fileItem.isFormField()) {
                    String fileName = fileItem.getFieldName();
                    if ("username".equals(fileName)) {
                        if (! fileItem.getString().equals("")) {
                            String value = fileItem.getString("utf-8");
                            writer.println("上传者:" + value + "<br>");
                        }
                    }
                } else {
                    String filename = fileItem.getName();
                    if (filename != null && ! "".equals(filename)) {
                        writer.println("上传的文件名:" + filename + "<br>");
                        filename = filename.substring(filename.lastIndexOf("\\")+1);
                        filename = UUID.randomUUID()  + "_" + filename;
                        writer.println("上传存储的文件名:" + filename + "<br>");
                        String webPath = "/update/";
                        String filePath = getServletContext().getRealPath(webPath + filename);
                        File fileSave = new File(filePath);
                        fileSave.getParentFile().mkdirs();
                        file.createNewFile();
                        InputStream inputStream = fileItem.getInputStream();
                        FileOutputStream fileOutputStream = new FileOutputStream(fileSave);
                        byte[] buff = new byte[1024];
                        int len;
                        while ((len = inputStream.read(buff)) >0) {
                            fileOutputStream.write(buff, 0, len);
                        }
                        // 关闭流
                        inputStream.close();
                        fileOutputStream.close();

                        // 读写完成,删除临时文件
                        fileItem.delete();
                        writer.println("文件上传成功!");
                    }
                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
    }
}
