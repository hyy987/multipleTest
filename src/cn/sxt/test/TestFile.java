package cn.sxt.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFile {
	public static void main(String[] args) throws IOException {
//		File f = new File("d:/axis.log");
		File f = new File("d:\\a.txt");
		System.out.println(f);
		f.renameTo(new File("d:/bb.txt"));
		
		System.out.println(System.getProperty("user.dir"));
		
		//再当前项目更目录下创建文件
		File f2 = new File("gg.txt");
//		f2.createNewFile();
		
		System.out.println("File是否存在："+f2.exists());
		System.out.println("File是否目录："+f2.isDirectory());
		System.out.println("File是否文件："+f2.isFile());
		System.out.println("File最后修改时间："+new Date(f2.lastModified()));
		System.out.println("File的大小："+f2.length());
		System.out.println("File的文件名："+f2.getName());
		System.out.println("File目录路径："+f2.getAbsolutePath());

		File f3 = new File("d:/电影/华语/大陆");
//		boolean mkdir = f3.mkdir();//如果有一个目录不存在则返回false
//		System.out.println(mkdir);
		boolean mkdirs = f3.mkdirs();//不管存不存在都会创建
		System.out.println(mkdirs);
	}

}
