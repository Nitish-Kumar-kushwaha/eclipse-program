package coms.ImageUploadAndDownloadService.service;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import coms.ImageUploadAndDownloadService.model.FileDB;
import coms.ImageUploadAndDownloadService.repo.FileDbRepository;

@Service
public class FileStorageService {
		@Autowired
		private FileDbRepository fileDBRepository;
		
	public FileDB store(MultipartFile file) throws IOException {
		// C://abc/abc.txt
	    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
	    FileDB fileDb = new FileDB(fileName, file.getContentType(), file.getBytes());

	    return fileDBRepository.save(fileDb);
	  }

	 public Stream<FileDB> getAllFiles() {
		    return fileDBRepository.findAll().stream();
		  }
	 
	  public FileDB getFile(String id) {
	    return fileDBRepository.findById(id).get();
	  }
	  
	 
}
