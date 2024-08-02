package com.ssy.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/file")
public class FileUploadController {

    @PostMapping("/upload")
    public String upload(String name, MultipartFile headPicture){
        System.out.println(name);
        System.out.println("文件表单名："+headPicture.getName());
        System.out.println("文件原名："+headPicture.getOriginalFilename());
        System.out.println("文件的大小："+headPicture.getSize());

        return "upload success";
    }
}
