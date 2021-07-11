package com.example.fileupload.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.fileupload.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;



@RestController
public class FileUploadRestController {
	
	ObjectMapper objectMapper=new ObjectMapper();

	@RequestMapping(value="/upload", method=RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<Object> uploadFile(@RequestParam("file") MultipartFile file ) throws IOException {
		File convertFile = new File("C:\\Document&Media\\"+file.getOriginalFilename());
		convertFile.createNewFile();
		FileOutputStream fout = new FileOutputStream(convertFile);
		fout.write(file.getBytes());
		fout.close();
		return new ResponseEntity<>("File is uploaded successfully", HttpStatus.OK);
	}
	
	@RequestMapping(value="/details", method=RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<Object> details(@RequestParam("file") MultipartFile file,@RequestParam("jsondata") String jsondata ) throws IOException {
		File convertFile = new File("C:\\Document&Media\\"+file.getOriginalFilename());
		convertFile.createNewFile();
		FileOutputStream fout = new FileOutputStream(convertFile);
		fout.write(file.getBytes());
		fout.close();
		
		User user = objectMapper.readValue(jsondata,User.class);
		System.out.println(user.getEmployeeID());
		System.out.println(user.getName());
		System.out.println(user.getRole());
		return new ResponseEntity<>("all data uploaded  successfully!!", HttpStatus.OK);
	}

}
