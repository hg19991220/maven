package com.hangang.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.hangang.common.utils.AssertUtil;
import com.hangang.common.utils.Lx;

public class AssertTest {
	//测试测试AssertUtil.isTrue()方法，通过断言测一次，不能通过断言测一次
	@Test
	public void fun1Test() {
		try {
			AssertUtil.isTrue(false, "这不是一个true");
		} catch (Lx e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	//测试AssertUtil.isFalse()方法，通过断言测一次，不能通过断言测一次
	@Test
	public void fun2Test() {
		try {
			AssertUtil.isFalse(true, "这不是一个false");
		} catch (Lx e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	//测试AssertUtil.notNull()方法，通过断言测一次，不能通过断言测一次
	@Test
	public void fun3Test() {
		try {
			AssertUtil.notNull("", "这不是一个字符串");
		} catch (Lx e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	//测试AssertUtil.isNull()方法，通过断言测一次，不能通过断言测一次
	@Test
	public void fun4Test() {
		try {
			AssertUtil.isNull("", "这是一个字符串");
		} catch (Lx e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	//用List对象测试AssertUtil.notEmpty()方法，通过断言测一次，不能通过断言测一次
	@Test
	public void fun5Test() {
		try {
			ArrayList<Integer> arrayList=new ArrayList<Integer>();
			arrayList.add(3);
			AssertUtil.notEmpty(arrayList, "这不是一个集合");
		} catch (Lx e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	//用Map对象测试AssertUtil.notEmpty()方法，通过断言测一次，不能通过断言测一次
	@Test
	public void fun6Test() {
		try {
			Map<Integer, String> map=new HashMap<Integer,String>();
			map.put(2, "sdas");
			AssertUtil.notEmpty(map, "这不是一个map集合");
		} catch (Lx e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	//用String对象测试AssertUtil.hasText()方法，通过断言测一次，不能通过断言测一次
	@Test
	public void fun7Test() {
		try {
			AssertUtil.hasText("sdfds df da", "这不是一个字符串");
		} catch (Lx e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	//测试AssertUtil. greaterThanZero()方法，通过断言测一次，不能通过断言测一次
	@Test
	public void fun8Test() {
		try {
			AssertUtil.greaterThanZero(-10, "这不是一个正数");
		} catch (Lx e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
