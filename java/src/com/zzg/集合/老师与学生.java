package com.zzg.����;

import java.util.ArrayList;
import java.util.List;

public class ��ʦ��ѧ�� {

	/**
	 * ��ѯһ���ж��ٸ���ʦ
	 * 
	 * ��ѯһ���ж��ٸ�ѧ��
	 * 
	 * 13���ж���ѧ�������Ƿֱ���˭��
	 * */
	public static void main(String[] args) {
		// ��ѯ���ٸ���ʦ
		int teacherCount = teacherList.size();
		System.out.println("һ������ʦ������" + teacherCount);
		
		// ��ѯһ���ж��ٸ�ѧ��
		int studentCount = studentList.size();
		System.out.println("һ����ѧ��������" + studentCount);
		
		// ��ѯ13���ж��ٸ�ѧ��
		int gradeStu13 = 0;// �༶13 ������
		
		for (Student stu : studentList) {// ѭ�����е�ѧ������
			
			int grade = stu.getGrade();// ��ȡ��ǰѧ���İ༶
			
			if (grade == 13) {
				gradeStu13++;
				System.out.println("����13��ģ��ҽУ�" + stu.getName());
			}
		}
		
		System.out.println("13�๲�У�" + gradeStu13);
	}
	
	private static List<Teacher> teacherList = new ArrayList<Teacher>();
	private static List<Student> studentList = new ArrayList<Student>();
	
	/**
	 * ��ʼ��һЩ��ʦ������
	 * */
	private static void initTeacher() {
		Teacher t1 = new Teacher("������", 1);
		Teacher t2 = new Teacher("���һ", 2);
		Teacher t3 = new Teacher("�ܽ���", 3);
		Teacher t4 = new Teacher("����", 4);
		Teacher t5 = new Teacher("��ɽ", 5);
		
		teacherList.add(t1);
		teacherList.add(t2);
		teacherList.add(t3);
		teacherList.add(t4);
		teacherList.add(t5);
	}
	
	/**
	 * ��ʼ��ѧ������
	 * */
	private static void initStudent() {
		Student s1 = new Student("����", 10);
		Student s2 = new Student("��2", 10);
		Student s3 = new Student("��3", 10);
		Student s4 = new Student("��4", 10);
		Student s5 = new Student("��5", 10);
		Student s6 = new Student("��6", 10);
		Student s7 = new Student("��7", 10);
		Student s8 = new Student("��8", 10);
		Student s9 = new Student("��9", 10);
		Student s10 = new Student("��10", 10);
		Student s11 = new Student("��11", 10);
		Student s12 = new Student("��12", 10);
		Student s13 = new Student("��13", 10);
		Student s14 = new Student("��14", 10);
		Student s15 = new Student("��15", 10);
		Student s16 = new Student("��16", 13);
		Student s17 = new Student("��17", 13);
		Student s18 = new Student("��18", 13);
		Student s19 = new Student("��19", 13);
		Student s20 = new Student("��20", 13);
		
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
 * ѧ����
 * */
class Student {

	private String name;// ����
	private int grade;// �༶

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
 * ��ʦ��
 * */
class Teacher {
	
	private String name;// ����
	private int id;// ��ʦ�ı��
	
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