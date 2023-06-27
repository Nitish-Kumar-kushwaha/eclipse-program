package com.upload_download_images.upload_and_download_images.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.upload_download_images.upload_and_download_images.Repo.FileRepo;
import com.upload_download_images.upload_and_download_images.model.FileInfo;

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    FileRepo fr;

    @Override
    public String FileUpload(MultipartFile file) {

        FileInfo finfo = null;

        try {
            String fname = file.getOriginalFilename();
            System.out.println(fname);
            String ftype = file.getContentType();
            System.out.println(ftype);
            byte[] fdata = file.getBytes();

            finfo = new FileInfo(fdata, fname, ftype);

            FileInfo f = fr.save(finfo);
            if (f != null) {
                return "Success";
            }
        } catch (Exception e) {
            return e.getMessage();
        }

        return "Error";
    }

    @Override
    public List<FileInfo> showAll() {
        return fr.findAll();
    }

    @Override
    public FileInfo GetAFile(String fileid) {

        Optional<FileInfo> fis = fr.findById(fileid);

        if (fis.isPresent()) {
            return fis.get();
        }
        return null;
    }

}
