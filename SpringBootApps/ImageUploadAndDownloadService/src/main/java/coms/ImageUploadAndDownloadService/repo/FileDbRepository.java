package coms.ImageUploadAndDownloadService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.ImageUploadAndDownloadService.model.FileDB;

@Repository
public interface FileDbRepository extends JpaRepository<FileDB, String> {
	
}
