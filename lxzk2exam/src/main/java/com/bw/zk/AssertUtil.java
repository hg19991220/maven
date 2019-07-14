package com.bw.zk;

import java.util.Collection;
import java.util.Map;

public class AssertUtil {
	//断言为真
	public static void isTrue(boolean exp,String message) {
		if (!exp) {
			throw new lx(message);
		}
	}
	//断言为假
	public static void isFalse(boolean exp,String message) {
		if (exp) {
			throw new lx(message);
		}
	}
	//断言不能为空
	public static void isNotNull(String exp,String message) {
		if (exp==null || exp.length()==0) {
			throw new lx(message);
		}
	}
	//断言为空
	public static void isNull(String exp,String message) {
		if(exp.length()>0) {
			throw new lx(message);
		}
	}
	//List或集合不为空
	public static void collectionNotNull(Collection<?> col,String message) {
		if(col==null || col.size()==0) {
			throw new lx(message);
		}
	}
	//map不为空
	public static void mapNotNull(Map<?, ?> map,String message) {
		if(map==null || map.size()==0) {
			throw new lx(message);
		}
	}
	//字符串不为空
	public static void isLength(String exp,String message) {
		if(exp.trim().length()>0) {
			throw new lx(message);
		}
	}
	//一个正数
	public static void absInt(int exp,String message) {
		if(exp<=0) {
			throw new lx(message);
		}
	}
}
