package com.bestbright.onlie_course.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
@Service
public class FileService {
	public String uploadDir="/images/";
	 
    public void uploadFile(MultipartFile file) throws Exception
    {
        try {
            Path copyLocation = Paths.get(uploadDir + File.separator + StringUtils.cleanPath(file.getOriginalFilename()));
            Files.copy(file.getInputStream(),copyLocation, StandardCopyOption.REPLACE_EXISTING);
 
        } catch (IOException e) {
            e.printStackTrace();
            throw new Exception("File Not Found");
        }
    }
}
