package com.hib.main;

import java.util.ArrayList;
import java.util.List;

import com.hib.daoimpl.HibernateDAOImpl;
import com.hib.entity.StudentDemo;
import com.hib.entity.StudentDetails;
import com.hib.entity.Subject;

public class Main 
{
	private static HibernateDAOImpl hdaoi;

	public static void main(String[] args) 
	{		
		hdaoi = new HibernateDAOImpl();
		
		Subject sb1 = new Subject("HTML", 10);
		Subject sb2 = new Subject("CSS", 20);
		Subject sb3 = new Subject("Javascript", 30);
		Subject sb4 = new Subject("Hibernate", 20);
		Subject sb5 = new Subject("Spring", 30);
		
		List<Subject> set1 = new ArrayList<Subject>();
		set1.add(sb1);
		set1.add(sb2);
		set1.add(sb3);
		
		List<Subject> set2 = new ArrayList<Subject>();
		set2.add(sb3);
		set2.add(sb4);
		set2.add(sb5);

		StudentDemo sd = new StudentDemo("Gambir", "gambir@gmail.com", "MG Road", 245212);
		StudentDetails sds = new StudentDetails("23233434", "Kolkata", "WB");
		sd.setStudentDetails(sds);
		sds.setStudent(sd);
		sd.setSubjects(set1);
		sb1.setStudent(sd);
		sb2.setStudent(sd);
		sb3.setStudent(sd);
		
		
//		StudentDemo sd1 = new StudentDemo("Prathik", "prathik@gmail.com", "BTM", 560076);
//		StudentDetails sds1 = new StudentDetails("456453343", "Patna", "OD");
//		sd1.setStudentDetails(sds1);
//		sds1.setStudent(sd1);
//		sd1.setSubjects(set2);
//		sb3.setStudent(sd1);
//		sb4.setStudent(sd1);
//		sb5.setStudent(sd1);
		
//		hdaoi.insertStudent(sd1);
		hdaoi.insertStudent(sd);
		
		System.out.println("Success");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ArrayList<StudentDemo> sList = hdaoi.fetchAll();
//		
//		Iterator itr = sList.iterator();
//		
//		while(itr.hasNext())
//		{
//			StudentDemo s = (StudentDemo) itr.next();
//			
//			System.out.println(s);
//		}
//		StudentDemo sd = new StudentDemo("Virat", "virat@gmail.com", "MG Road", 181818);
//		StudentDetails sds = new StudentDetails("42156341", "Delhi", "Delhi");
//		hdaoi.insertStudentDeatils(sds);
		
//		hdaoi.updateStudentWithSD("sachin@yahoo.com", "Pune", 102);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		hdaoi.updateStudent("rohit45@gmail.com",2);
//		hdaoi.delete(52);
//		System.out.println(hdaoi.fetchOne(2));
//		ArrayList<StudentDemo> sList = hdaoi.fetchAll();
//		
//		for(StudentDemo s : sList)
//		{
//			System.out.println(s);
//		}
		
//		Student stu = new Student("Sachin","sachin@gmail.com","Mumbai",510082);
//		hdaoi.insertStudent(stu);
	}	
}












