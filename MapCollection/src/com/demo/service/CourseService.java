package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.beans.Course;

public interface CourseService {

	boolean addnewcourse();

	boolean deleteByName(String cname);

	boolean modifyByName(String cname, int capacity, int duration);

	

	boolean displayByName(String cname);



	

	List<Course> FindByDuration(int duration1);

	List<Course> SortedByDuration();



	Map<String, Course> sortByName();

	Map<String, Course> getAll();

	
	



}
