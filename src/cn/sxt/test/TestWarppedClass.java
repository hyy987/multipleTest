package cn.sxt.test;

public class TestWarppedClass {

	public static void main(String[] args) {
		//基本数据类型转成包装类对象
		Integer a = new Integer(3);
		Integer b = Integer.valueOf(30);
		
		//把包装类对象转成基本数据类型
		int c =b.intValue();
		double d = b.doubleValue();
		
		//把字符串转成包装类对象
		Integer e = new Integer("9999");
		Integer f = Integer.parseInt("99988");
		
		//把包装类转换成字符串
		String str = f.toString();
		
		//常见的变量
		System.out.println(Integer.MAX_VALUE);
	}
}
