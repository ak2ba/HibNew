package com.hib.dao;

import java.util.ArrayList;

import com.hib.entity.StudentDemo;

public interface HibernateDAO 
{
	void insertStudent(StudentDemo s);
	ArrayList<StudentDemo> fetchAll();
	StudentDemo fetchOne(int sid);
	public void delete(int i);
	void updateStudent(String string, int i);
}
