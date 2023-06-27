package com.upload_download_images.upload_and_download_images.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.upload_download_images.upload_and_download_images.model.FileInfo;

public interface FileService {
    public String FileUpload(MultipartFile file);

    public List<FileInfo> showAll();

    public FileInfo GetAFile(String fileid);

}
