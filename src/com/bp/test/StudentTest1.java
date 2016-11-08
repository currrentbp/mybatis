package com.bp.test;

import org.junit.Test;

import com.bp.entity.Student;
import com.bp.util.MybatisUtil;

public class StudentTest1 {

	@Test
	public void selectOneStudent(){
		System.out.println(MybatisUtil.getSqlSession().selectOne("com.bp.test.selectStudent", 1));
	}
	
	@Test
	public void selectAllStudent(){
		System.out.println(MybatisUtil.getSqlSession().selectList("com.bp.test.selectAllStudent"));
	}
	
	@Test
	public void addStudent(){
		System.out.println(MybatisUtil.getSqlSession().insert("com.bp.test.addStudent", new Student(-1,"name1","address1")));
	}
	
	@Test
	public void updateStudent(){
		System.out.println(MybatisUtil.getSqlSession().update("com.bp.test.updateStudent", new Student(2,"name22","address2")));
	}
	
	@Test
	public void deleteStudent(){
		System.out.println(MybatisUtil.getSqlSession().delete("com.bp.test.deleteStudent", 1));
	}
	
	@Test
	public void selectStudent1(){
	}
	
}
