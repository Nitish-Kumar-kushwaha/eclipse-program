package coms.ImageUploadAndDownloadService.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import coms.ImageUploadAndDownloadService.model.FileDB;
import coms.ImageUploadAndDownloadService.model.ResponseFile;
import coms.ImageUploadAndDownloadService.service.FileStorageService;

@RestController
public class FileDBController {
		@Autowired
		private FileStorageService storageService;

			@PostMapping("/upload")
			public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
		    String message = "";
		    try {
		      storageService.store(file);

		      message = "Uploaded the file successfully: " + file.getOriginalFilename();
		      return ResponseEntity.status(HttpStatus.OK).body(message);
		    } catch (Exception e) {
		      message = "Could not upload the file: " + file.getOriginalFilename() + "!";
		      return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(message);
		    }
		  }
			
			@GetMapping("/files")
			  public ResponseEntity<List<ResponseFile>> getListFiles() 
			  {
			    List<ResponseFile> files = storageService.getAllFiles().map(dbFile -> {
			      String fileDownloadUri = ServletUriComponentsBuilder
			          .fromCurrentContextPath()  // servername : http://localhost:9090
			          .path("/files/")		// getmapping text
			          .path(dbFile.getFileid())  // id value from db
			          .toUriString();
			      			// http://localhost:9090/files/0a902f45-fd40-4960-aff9-d52008956177
			      return new ResponseFile(
			          dbFile.getFilename(),
			          fileDownloadUri,
			          dbFile.getFiletype(),
			          dbFile.getFiledata().length);
			    }).collect(Collectors.toList());

			    return ResponseEntity.status(HttpStatus.OK).body(files);
			  }
				// downloading the file.
			  @GetMapping("/files/{id}")
			  public ResponseEntity<byte[]> getFile(@PathVariable String id) {
			    FileDB fileDB = storageService.getFile(id);

			    return ResponseEntity.ok()
			        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileDB.getFilename() + "\"")
			        .body(fileDB.getFiledata());
			  }
}
