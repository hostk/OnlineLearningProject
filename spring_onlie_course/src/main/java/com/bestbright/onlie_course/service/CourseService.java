package com.bestbright.onlie_course.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestbright.onlie_course.dto.CourseDTO;
import com.bestbright.onlie_course.model.Course;

import com.bestbright.onlie_course.repository.CourseRepository;

@Service
public class CourseService implements CourseInterface {
	@Autowired
	ServletContext serveletContext;
	@Autowired
	private CourseRepository courseRepository;
	
	public String UPLOAD_DIRECTORY="/images/";
	
	@Override
	public void saveCourse(CourseDTO coursedto) throws Exception {
		// TODO Auto-generated method stub
		if(coursedto!=null) {
			Course cour=new Course();
			String path=serveletContext.getRealPath(UPLOAD_DIRECTORY);
			String filename=coursedto.getFile().getOriginalFilename();
			
			System.out.println(path+""+filename);
			try {
				byte[] bytes=coursedto.getFile().getBytes();
				BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream(new File(path+File.separator+filename)));
				out.write(bytes);
				out.flush();
				out.close();
			}catch(Exception e){
				throw e;
			}
			cour.setCourse_name(coursedto.getCourse_name());
			cour.setCourse_description(coursedto.getCourse_description());
			cour.setPhotopath(filename);
			courseRepository.save(cour);
	}
	}
	@Override
	public Course getcourseById(Long id) {
		// TODO Auto-generated method stub
		return courseRepository.findById(id).get();
	}
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(id);
	}
	
	
}
	