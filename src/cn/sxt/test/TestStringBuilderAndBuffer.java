package cn.sxt.test;

public class TestStringBuilderAndBuffer {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<26;i++) {
			sb.append((char)('a'+i));
		}
		System.out.println(sb);
		
		//倒序字符串
		sb.reverse();
		System.out.println(sb);
		sb.setCharAt(3,'高');
		System.out.println(sb);
		sb.insert(0, '我');//此方法可以链式调用，使用了return this。
		System.out.println(sb);
		
		sb.delete(20, 23);
		System.out.println(sb);
	}
}
