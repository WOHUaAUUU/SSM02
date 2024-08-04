package com.ssy.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

@RestController
@RequestMapping("/html/file")
public class FileUploadController {

    //    @PostMapping("/upload")
//    public String upload(String name, MultipartFile headPicture){
//        System.out.println(name);
//        System.out.println("文件表单名："+headPicture.getName());
//        System.out.println("文件原名："+headPicture.getOriginalFilename());
//        System.out.println("文件的大小："+headPicture.getSize());
//        return "upload success";
//    }
    @Autowired
    private ServletContext servletContext;
    private ResourceLoader resourceLoader;

    public FileUploadController(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @PostMapping("/upload")
    public String fileUpload(String name, MultipartFile headPicture, MultipartFile backgroundPicture) throws IOException {
        System.out.println("name:" + name);
        String realPath = servletContext.getRealPath("/images");
        headPicture.transferTo(new java.io.File(realPath + File.separator + headPicture.getOriginalFilename()));
        backgroundPicture.transferTo(new java.io.File(realPath + File.separator + backgroundPicture.getOriginalFilename()));
        return "upload ok";
    }

    @GetMapping("/download")
    public ResponseEntity<byte[]> download(HttpServletRequest request, String headPicture) throws IOException {
        String parameter = request.getParameter(headPicture);
        System.out.println("前端传递的文件名:"+parameter);
        if (headPicture == null) {
            System.out.println("文件名为空");
            return null;
        }

        // 获取图片文件的路径
        String realPath = servletContext.getRealPath("/images");
        // 拼接图片文件的完整路径
        String imgPath = realPath+File.separator + headPicture;

        // 通过文件路径获取文件输入流
        FileInputStream fileInputStream = new FileInputStream(imgPath);
        // 创建字节数组，用于存储图片文件的内容
        byte[] bytes = new byte[fileInputStream.available()];
        // 将图片文件的内容读取到字节数组中
        fileInputStream.read(bytes);

        // 创建HttpHeaders对象，用于设置响应头
        HttpHeaders httpHeaders = new HttpHeaders();
        // 设置响应头的content-disposition，使浏览器能够下载文件
        httpHeaders.add("content-disposition", "attachment;filename=" + URLEncoder.encode(headPicture, "UTF-8"));
        // 创建ResponseEntity对象，用于返回响应
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, httpHeaders, HttpStatus.OK);
        // 返回响应
        return responseEntity;
    }

    @GetMapping("/download2")
    public ResponseEntity<byte[]> download2( String fileName) throws IOException {
        Resource resource = resourceLoader.getResource("classpath:images/" + fileName);
        InputStream inputStream = resource.getInputStream();
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("content-disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
        return new ResponseEntity<>(bytes, httpHeaders, HttpStatus.OK);
    }
}
