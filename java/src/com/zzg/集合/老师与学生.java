package com.zzg.集合;

import java.util.ArrayList;
import java.util.List;

public class 老师与学生 {

	/**
	 * 查询一共有多少个老师
	 * 
	 * 查询一共有多少个学生
	 * 
	 * 13班有多少学生。他们分别是谁。
	 * */
	public static void main(String[] args) {
		// 查询多少个老师
		int teacherCount = teacherList.size();
		System.out.println("一共有老师数量：" + teacherCount);
		
		// 查询一共有多少个学生
		int studentCount = studentList.size();
		System.out.println("一共有学生数量：" + studentCount);
		
		// 查询13班有多少个学生
		int gradeStu13 = 0;// 班级13 计数器
		
		for (Student stu : studentList) {// 循环所有的学生数据
			
			int grade = stu.getGrade();// 获取当前学生的班级
			
			if (grade == 13) {
				gradeStu13++;
				System.out.println("我是13班的，我叫：" + stu.getName());
			}
		}
		
		System.out.println("13班共有：" + gradeStu13);
	}
	
	private static List<Teacher> teacherList = new ArrayList<Teacher>();
	private static List<Student> studentList = new ArrayList<Student>();
	
	/**
	 * 初始化一些老师的数据
	 * */
	private static void initTeacher() {
		Teacher t1 = new Teacher("王力宏", 1);
		Teacher t2 = new Teacher("李谷一", 2);
		Teacher t3 = new Teacher("周杰伦", 3);
		Teacher t4 = new Teacher("汪涵", 4);
		Teacher t5 = new Teacher("火山", 5);
		
		teacherList.add(t1);
		teacherList.add(t2);
		teacherList.add(t3);
		teacherList.add(t4);
		teacherList.add(t5);
	}
	
	/**
	 * 初始化学生数据
	 * */
	private static void initStudent() {
		Student s1 = new Student("阿大", 10);
		Student s2 = new Student("阿2", 10);
		Student s3 = new Student("阿3", 10);
		Student s4 = new Student("阿4", 10);
		Student s5 = new Student("阿5", 10);
		Student s6 = new Student("阿6", 10);
		Student s7 = new Student("阿7", 10);
		Student s8 = new Student("阿8", 10);
		Student s9 = new Student("阿9", 10);
		Student s10 = new Student("阿10", 10);
		Student s11 = new Student("阿11", 10);
		Student s12 = new Student("阿12", 10);
		Student s13 = new Student("阿13", 10);
		Student s14 = new Student("阿14", 10);
		Student s15 = new Student("阿15", 10);
		Student s16 = new Student("阿16", 13);
		Student s17 = new Student("阿17", 13);
		Student s18 = new Student("阿18", 13);
		Student s19 = new Student("阿19", 13);
		Student s20 = new Student("阿20", 13);
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		studentList.add(s7);
		studentList.add(s8);
		studentList.add(s9);
		studentList.add(s10);
		studentList.add(s11);
		studentList.add(s12);
		studentList.add(s13);
		studentList.add(s14);
		studentList.add(s15);
		studentList.add(s16);
		studentList.add(s17);
		studentList.add(s18);
		studentList.add(s19);
		studentList.add(s20);
	}
	
	static {
		initTeacher();
		initStudent();
	}
	
}

/**
 * 学生类
 * */
class Student {

	private String name;// 名字
	private int grade;// 班级

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}

/**
 * 老师类
 * */
class Teacher {
	
	private String name;// 名字
	private int id;// 老师的编号
	
	public Teacher(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}