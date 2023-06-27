package com.upload_download_images.upload_and_download_images.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upload_download_images.upload_and_download_images.model.FileInfo;

@Repository
public interface FileRepo extends JpaRepository<FileInfo, String> {
    
}
