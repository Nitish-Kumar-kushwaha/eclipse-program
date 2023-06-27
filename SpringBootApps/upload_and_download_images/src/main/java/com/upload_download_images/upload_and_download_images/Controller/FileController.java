package com.upload_download_images.upload_and_download_images.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.upload_download_images.upload_and_download_images.model.FileInfo;
import com.upload_download_images.upload_and_download_images.service.FileService;

@RestController
@RequestMapping("/v1/api")
public class FileController {
    

    @Autowired
    FileService fs;

    @PostMapping(value = "/fload")
    public ResponseEntity<String> UploadFile(@RequestParam MultipartFile file) {
        try {
            String res = fs.FileUpload(file);
            if (res.equals("Success")) {
                return new ResponseEntity<String>("FileUploaded", HttpStatus.OK);
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
        return new ResponseEntity<String>("File Error ........", HttpStatus.NOT_FOUND);
    }
    

   @GetMapping(value = "/files/{id}")
    public ResponseEntity<byte[]> GetFileDownload(@PathVariable("id") String id) {
        FileInfo finfo = fs.GetAFile(id);
        if (finfo != null) {
            return ResponseEntity
                .ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + finfo.getFilename() + "\"")
                .body(finfo.getFiledata());
        }
        // Handle the case when finfo is null
        return new ResponseEntity("File NotFound ....", HttpStatus.NOT_FOUND);
}

}
