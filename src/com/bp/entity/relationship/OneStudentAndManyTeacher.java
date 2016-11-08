package com.bp.entity.relationship;

import java.util.List;

import com.bp.entity.Student;
import com.bp.entity.Teacher;

public class OneStudentAndManyTeacher {
	
	public Student student;
	public List<Teacher> teachers;
	public OneStudentAndManyTeacher() {
		super();
	}
	public OneStudentAndManyTeacher(Student student, List<Teacher> teachers) {
		super();
		this.student = student;
		this.teachers = teachers;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	@Override
	public String toString() {
		return "OneStudentAndManyTeacher [student=" + student + ", teachers="
				+ teachers + "]";
	}
	
	

}
