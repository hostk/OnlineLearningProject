package com.bestbright.onlie_course.service;

import java.util.List;

import com.bestbright.onlie_course.dto.Level_materialDTO;
import com.bestbright.onlie_course.model.Level_material;

public interface Level_materialInterface {
void saveLevelmaterial(Level_materialDTO level_materialdto) throws Exception;

public List<Level_material> getLevelmaterialByLevel(Long level_id);

public Level_material getLevelMaterialVideo(String type);
public Level_material getLevelMaterialPdf(String type);

}