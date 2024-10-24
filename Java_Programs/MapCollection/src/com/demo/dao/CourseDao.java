package com.demo.dao;

import java.util.List;
import java.util.Map;

import com.demo.beans.Course;
import com.demo.exception.CourseNotFound;
import com.demo.exception.NoCourseDuration;

public interface CourseDao {

	boolean save(Course c);

	boolean deleteByName(String cname);

	boolean modifyByName(String cname, int capacity, int duration)throws CourseNotFound;

	

	boolean displayByName(String cname);

	List<Course> FindByDuration(int duration1)throws NoCourseDuration;

	List<Course> sortByDuration();

	Map<String, Course> sortByName();

	Map<String, Course> getAll();



}
