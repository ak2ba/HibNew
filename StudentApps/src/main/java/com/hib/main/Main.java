package com.hib.main;

import java.util.ArrayList;
import java.util.List;

import com.hib.daoimpl.HibernateDAOImpl;
import com.hib.entity.Project;
import com.hib.entity.StudentDemo;
import com.hib.entity.StudentDetails;
import com.hib.entity.Subject;

public class Main 
{
	private static HibernateDAOImpl hdaoi;

	public static void main(String[] args) 
	{		
		hdaoi = new HibernateDAOImpl();
		
		
		StudentDemo s = hdaoi.fetchOne(402);
		
		System.out.println("\n\n\n\n\n\n\n\nStudent Data");
		System.out.println(s.getSid()+" "+s.getSname()+"  "+s.getEmail()+"  "+s.getAddress()+" "+s.getPincode());
		
		System.out.println("\n\n\nStudent Details");
		System.out.println(s.getStudentDetails());
		
		System.out.println("\n\n\nEnrolled Subjects");
		for(Subject subs : s.getSubjects())
		{
			System.out.println(subs);
		}
		
		
		System.out.println("\n\n\nProjects Exp");
		for(Project p : s.getProjectList())
		{
			System.out.println(p.getPid()+"  "+p.getPname()+"  "+p.getNoOfHours()+"  "+p.getMarks());
		}
		
		
//		
//		Subject sb1 = new Subject("Maths", 10);
//		Subject sb2 = new Subject("Science", 20);
//		Subject sb3 = new Subject("Social", 30);
//		Subject sb4 = new Subject("Logic Building", 20);
//		
//		Project p1 = new Project("LMS",30,60);
//		Project p2 = new Project("Frontend",40,70);
//		Project p3 = new Project("Drive portal",30,40);
//		
//		ArrayList<Project> plist = new ArrayList<Project>();
//		plist.add(p1);
//		plist.add(p2);
//		plist.add(p3);
//		
//		List<Subject> set1 = new ArrayList<Subject>();
//		set1.add(sb1);
//		set1.add(sb2);
//		set1.add(sb3);
//		
//		List<Subject> set2 = new ArrayList<Subject>();
//		set2.add(sb3);
//		set2.add(sb4);
//
//		StudentDemo sd = new StudentDemo("Gautham", "gautham@gmail.com", "MG Road", 232132);
//		StudentDetails sds = new StudentDetails("345435234", "Kolkata", "WB");
//		sd.setStudentDetails(sds);
//		sds.setStudent(sd);
//		sd.setSubjects(set1);
//		sb1.setStudent(sd);
//		sb2.setStudent(sd);
//		sb3.setStudent(sd);
//		sd.setProjectList(plist);
//		
//		
//		
//		StudentDemo sd1 = new StudentDemo("Saif", "saif@gmail.com", "BTM", 560076);
//		StudentDetails sds1 = new StudentDetails("544656545", "Banglore", "KA");
//		sd1.setStudentDetails(sds1);
//		sds1.setStudent(sd1);
//		sd1.setSubjects(set2);
//		sb3.setStudent(sd1);
//		sb4.setStudent(sd1);
//		
////		
//		hdaoi.insertStudent(sd);
//		System.out.println("Success1");
//		hdaoi.insertStudent(sd1);
//		System.out.println("Success2");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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












