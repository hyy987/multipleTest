package cn.sxt.test;

public class TestString {

	public static void main(String[] args) {
		String str = "aabbcc";
		String str2 = str.substring(2, 5);
		
		System.out.println(str);
		System.out.println(str2);
		
		//做字符串比较时候，使用equals不适用==（==用来判断对象是否相等的）
	}
}
