package com.bp.test;


import org.junit.Test;

import com.bp.util.MybatisUtil;

public class StudentTeacherTest {

	@Test
	public void selectStudentTeacher(){
		System.out.println(MybatisUtil.getSqlSession().selectList("com.bp.test.getStudentAndTeacher", 2));
	}
	
	@Test
	public void selectStudentTeacher2(){
		System.out.println(MybatisUtil.getSqlSession().selectList("com.bp.test.getStudentAndTeacher2", 2));
	}
}
