package com.hangang.common.utils;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamUtil {
	
	public static void closeAll(Closeable... closeables) {
		//TODO
		//FileInputStream fileInputStream=new FileInputStream(InputStream)
	}
	public static void copy(InputStream src, OutputStream out, boolean isCloseInputStream, boolean isCloseOutputStream)  throws IOException{
		//TODO
	}
	public static String readTextFile(InputStream src) throws IOException{
		return null;
		//TODO
	}
	public static String readTextFile(File txtFile) throws FileNotFoundException, IOException{
		return null;
		//TODO
	}
	public static String readStringFromSystemIn(String message){
		return message;
		//TODO
	}
	public static int readIntFromSystemIn(String message){
		return 0;
		//TODO
	}
}
