package com.ezen.cms.dao;

import java.util.List;

import com.ezen.cms.model.CourseMaster;

public interface CourseMasterDao {
	public List<CourseMaster> listCourseMaster();
	public void addCourseMaster(CourseMaster c);
	public void updateCourseMaster(int course);
	public CourseMaster getupdatebyid(int course_id);
	public void upCourseMaster(CourseMaster ct);
	
}