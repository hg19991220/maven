package com.hangang.common.utils;

import java.time.Month;
import java.util.Date;
import java.util.Scanner;

public class DaateUtil {
	public static int getAge (Date src) {
		System.out.println("输入年龄");
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
	}
	public static Date getDateByMonthInit (Date src) {
		Date date=new Date();
		long time = date.getTime();
		return src;
	}
	public static Date getDateByMonthLast(Date src) {
		Date date=new Date();
		long time = date.getTime();
		return src;
		
	}
	public static int getDaysByFuture (Date future) {
		Date date=new Date();
		date.getTime();
		return 0;
		
	}
	public static int getDaysByDeparted (Date departed) {
		Date date=new Date();
		long time = date.getTime();
		return 0;
	}
	
}
