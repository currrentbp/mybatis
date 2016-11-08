package com.bp.test;


import org.junit.Test;

import com.bp.util.MybatisUtil;

public class ClassesTest {

	@Test
	public void selectOneClass(){
		System.out.println(MybatisUtil.getSqlSession().selectList("com.bp.test.getClass1", 1));
	}
	
}
