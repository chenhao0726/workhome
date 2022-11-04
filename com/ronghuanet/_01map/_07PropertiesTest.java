package com.ronghuanet._01map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

public class _07PropertiesTest {

	public static void main(String[] args) throws IOException {
		Properties propeties = new Properties();
		// 我们在使用Properties这个类的时候不建议使用Map中的方法
		// 建议使用Properties类中自己的方法
//		propeties.setProperty("username", "zs");
//		propeties.setProperty("password", "123456");
		// 获取
//		System.out.println(propeties.getProperty("username"));
//		System.out.println(propeties.getProperty("password"));
//		System.out.println(propeties.size());
//		System.out.println(propeties);
		// 上面已经创建了一个对应的属性对象 我们现在想要把该数据持久化
		// 创建了一个 流 告诉jvm要把数据写到哪里去
//		PrintStream out = new PrintStream("D:\\test.properties");
		// 使用Properties中提供的方法将数据持久化
//		propeties.list(out);
		
		// 从磁盘中读取我们的文件
		FileInputStream fileInputStream = new FileInputStream("D:\\test.properties");
		System.out.println(fileInputStream);
		propeties.load(fileInputStream);
		System.out.println(propeties.getProperty("url"));
		System.out.println(propeties.getProperty("teacher"));
	}

}
