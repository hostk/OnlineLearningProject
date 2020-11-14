package com.bestbright.onlie_course.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import java.util.List;

import javax.servlet.ServletContext;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestbright.onlie_course.dto.Level_materialDTO;

import com.bestbright.onlie_course.model.Level;
import com.bestbright.onlie_course.model.Level_material;
import com.bestbright.onlie_course.repository.LevelMaterialRepository;
import com.bestbright.onlie_course.repository.LevelRepository;


@Service
public class Level_materialService implements Level_materialInterface {
	@Autowired
	ServletContext serveletContext;
	@Autowired
	private LevelMaterialRepository levelMaterialRepository;
	
	@Autowired
	private LevelRepository levelRepository;
	
	public String UPLOAD_DIRECTORY="/images/";
	@Override
	public void saveLevelmaterial(Level_materialDTO levelmaterialdto) throws Exception {
		// TODO Auto-generated method stub
		if(levelmaterialdto!=null) {
			String path=serveletContext.getRealPath(UPLOAD_DIRECTORY);
			String video=levelmaterialdto.getVideo().getOriginalFilename();
			String pdf=levelmaterialdto.getPdf().getOriginalFilename();
			System.out.println(path+""+pdf);
			System.out.println(path+""+video);
			try {
				byte[] bPdf=levelmaterialdto.getPdf().getBytes();
				byte[] bVideo=levelmaterialdto.getVideo().getBytes();
				BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream(new File(path+File.separator+pdf)));
				out.write(bPdf);
				
				out=new BufferedOutputStream(new FileOutputStream(new File(path+File.separator+video)));
				out.write(bVideo);
				out.flush();
				out.close();
			}catch(Exception e){
				throw e;
			}
		Level level = levelRepository.findById(levelmaterialdto.getLevel_id()).get();
		Level_material levelmaterial=new Level_material();
		levelmaterial.setName(levelmaterialdto.getLevel_material_name());
		levelmaterial.setPdfPath(pdf);
		levelmaterial.setVedioPath(video);
			
			levelmaterial.setLevel(level);
			levelMaterialRepository.save(levelmaterial);
		}
	}
	@Override
	public List<Level_material> getLevelmaterialByLevel(Long level_id) {
		// TODO Auto-generated method stub
		return levelMaterialRepository.getLevelmaterialByLevel(level_id);
	}
	@Override
	public Level_material getLevelMaterialVideo(String type) {
		// TODO Auto-generated method stub
		return levelMaterialRepository.getLevelmaterialVedio(type);
	}
	@Override
	public Level_material getLevelMaterialPdf(String type) {
		// TODO Auto-generated method stub
		return levelMaterialRepository.getLevelmaterialPdf(type);
	}
	

}