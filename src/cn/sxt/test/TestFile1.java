package cn.sxt.test;

import java.io.File;

/**
 * 使用递归算法打印目录树
 * @author admin
 *
 */
public class TestFile1 {

	public static void main(String[] args) {
		File f = new File("D:\\BaoFengYuYin");
		printFile(f,1);
	}
	
	private static void printFile(File file,int level) {
		for(int i = 0;i<level;i++) {
			System.out.println("*");
		}
		System.out.println(file.getName());
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for(File file1: files) {
				printFile(file1,1);
			}
		}
	}
}
