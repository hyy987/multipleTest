package cn.sxt.test;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		String sttr;//不可变字符
		
		//StringBuilder线程不安全，效率高（一般使用它）；StringBuffer线程安全，效率低
		StringBuilder sb = new StringBuilder("abcdefg");//可变字符
		
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
		
		sb.setCharAt(2, 'M');
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
	}
}
