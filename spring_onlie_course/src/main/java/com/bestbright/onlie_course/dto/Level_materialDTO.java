package com.bestbright.onlie_course.dto;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;



public class Level_materialDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long Level_material_id;
	private String Level_material_name;

	private String videoPath;
	private String pdfPath;
	private MultipartFile pdf;
	private MultipartFile video;
	private Long level_id;
	
	
	public Long getLevel_material_id() {
		return Level_material_id;
	}
	public void setLevel_material_id(Long level_material_id) {
		Level_material_id = level_material_id;
	}
	
	
	public String getVideoPath() {
		return videoPath;
	}
	public void setVideoPath(String videoPath) {
		this.videoPath = videoPath;
	}
	public String getPdfPath() {
		return pdfPath;
	}
	public void setPdfPath(String pdfPath) {
		this.pdfPath = pdfPath;
	}

	public MultipartFile getPdf() {
		return pdf;
	}
	public void setPdf(MultipartFile pdf) {
		this.pdf = pdf;
	}
	public MultipartFile getVideo() {
		return video;
	}
	public void setVideo(MultipartFile video) {
		this.video = video;
	}
	
	
	public Long getLevel_id() {
		return level_id;
	}
	public void setLevel_id(Long level_id) {
		this.level_id = level_id;
	}
	public String getLevel_material_name() {
		return Level_material_name;
	}
	public void setLevel_material_name(String level_material_name) {
		Level_material_name = level_material_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	} 
	
}