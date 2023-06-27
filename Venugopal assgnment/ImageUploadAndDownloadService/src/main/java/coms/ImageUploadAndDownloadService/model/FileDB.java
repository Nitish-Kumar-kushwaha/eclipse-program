package coms.ImageUploadAndDownloadService.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
/*
 * to Store binary data in db:  Blob, Clob
 * 
 * Create table Files(id string primary key, 
 * name varchar(20), type varchar(20), data blob);
 */

@Entity
@Table(name="filesinfo")
public class FileDB {
	 	@Id
	 	@GeneratedValue(generator = "uuid")
	 	@GenericGenerator(name = "uuid", strategy = "uuid2")
	  private String fileid;

	  private String filename;

	  private String filetype;

	  @Lob  // this annotation specifies that  datatype of data variable in db is "Blob"
	  private byte[] filedata;

	public String getFileid() {
		return fileid;
	}

	public void setFileid(String fileid) {
		this.fileid = fileid;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFiletype() {
		return filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public byte[] getFiledata() {
		return filedata;
	}

	public void setFiledata(byte[] filedata) {
		this.filedata = filedata;
	}

	
	public FileDB() {
		super();
	}

	public FileDB(String filename, String filetype, byte[] filedata) {
		super();
		this.filename = filename;
		this.filetype = filetype;
		this.filedata = filedata;
	}
	  
	  
}
