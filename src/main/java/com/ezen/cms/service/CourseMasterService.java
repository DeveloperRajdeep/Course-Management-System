package com.ezen.cms.service;

import java.util.List;

import com.ezen.cms.model.CourseMaster;

public interface CourseMasterService {
	public List<CourseMaster> listCourseMaster();
	public void addCourseMaster(CourseMaster ct);
	public void updateCourseMaster(int course);
	public CourseMaster getupdatebyid(int course_id);
	public void upCourseMaster(CourseMaster ct);
	
}
