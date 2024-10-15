package com.demo.dao;

import java.util.List;
import java.util.Map;

import com.demo.beans.Course;

public interface CourseDao {

	boolean save(Course c);

	boolean deleteByName(String cname);

	boolean modifyByName(String cname, int capacity, int duration);

	

	boolean displayByName(String cname);

	List<Course> FindByDuration(int duration1);

	List<Course> sortByDuration();

	Map<String, Course> sortByName();

	Map<String, Course> getAll();



}
