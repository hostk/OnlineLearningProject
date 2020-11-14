package com.bestbright.onlie_course.dto;

import java.io.Serializable;
import java.util.List;

public class ResultDTO implements Serializable {

	private List<QuestionanswerDTO> resultList;

	public List<QuestionanswerDTO> getResultList() {
		return resultList;
	}

	public void setResultList(List<QuestionanswerDTO> resultList) {
		this.resultList = resultList;
	}
	
}
