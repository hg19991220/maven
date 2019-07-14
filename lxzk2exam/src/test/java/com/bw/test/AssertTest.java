package com.bw.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.bw.zk.AssertUtil;
import com.bw.zk.lx;

public class AssertTest {
	@Test
	public void fun1Test() {
		try {
			AssertUtil.isTrue(false, "这不是一个true");
		} catch (lx e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void fun2Test() {
		try {
			AssertUtil.isFalse(true, "这不是一个false");
		} catch (lx e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void fun3Test() {
		try {
			AssertUtil.isNotNull("", "这不是一个字符串");
		} catch (lx e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void fun4Test() {
		try {
			AssertUtil.isNull(" ", "这是一个字符串");
		} catch (lx e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void fun5Test() {
		try {
			ArrayList<Integer> arrayList=new ArrayList<Integer>();
			/*arrayList.add(3);*/
			AssertUtil.collectionNotNull(arrayList, "这不是一个list或集合");
		} catch (lx e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void fun6Test() {
		try {
			HashMap<Integer, String> map=new HashMap<Integer,String>();
			/*map.put(4, "asd");*/
			AssertUtil.mapNotNull(map, "这不是一个map");
		} catch (lx e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void fun7Test() {
		try {
			AssertUtil.isLength("adsa asdsa", "这不是一个字符串");
		} catch (lx e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void fun8Test() {
		try {
			AssertUtil.absInt(-3, "这不是一个正数");
		} catch (lx e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
