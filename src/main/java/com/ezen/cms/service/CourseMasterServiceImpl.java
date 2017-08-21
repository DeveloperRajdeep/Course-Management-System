package com.ezen.cms.service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;

import com.ezen.cms.dao.CourseMasterDao;
import com.ezen.cms.model.CourseMaster;

public class CourseMasterServiceImpl implements CourseMasterService {
	
	/**
	 * @uml.property  name="coursemasDao"
	 * @uml.associationEnd  
	 */
	private CourseMasterDao coursemasDao;
	/**
	 * @param coursemasDao
	 * @uml.property  name="coursemasDao"
	 */
	public void setCoursemasDao(CourseMasterDao coursemasDao) {
		this.coursemasDao = coursemasDao;
	}

	@Override
	@Transactional
	public List<CourseMaster> listCourseMaster() {
		// TODO Auto-generated method stub
		return this.coursemasDao.listCourseMaster();
	}
	
	@Override
	@Transactional
	public void addCourseMaster(CourseMaster ct) {
		// TODO Auto-generated method stub
		this.coursemasDao.addCourseMaster(ct);

	}

	@Override
	@Transactional
	public void updateCourseMaster(int course_id) {
		// TODO Auto-generated method stub
		this.coursemasDao.updateCourseMaster(course_id);

	}

	@Override
	@Transactional
	public CourseMaster getupdatebyid(int course_id) {
		// TODO Auto-generated method stub
		return this.coursemasDao.getupdatebyid(course_id);
	}

	@Override
	@Transactional
	public void upCourseMaster(CourseMaster ct) {
		// TODO Auto-generated method stub
		this.coursemasDao.upCourseMaster(ct);
	}

}
