package cn.sxt.test;

/**
 * 测试自动装箱、自动拆箱
 * @author admin
 *
 */
public class TestAutoBox {

	public static void main(String[] args) {
		Integer a = 234;//自动装箱。Integer a= Integer.valueOf(234);
		
		int b = a;//自动拆箱。编译器会修改成int b = a.intValue();
		
		Integer c = null;
		if(c!=null) {
			int d = c;//自动拆箱：调用了c.intValue();			
		}
		
		//缓存[-128,127]之间的数字。实际就是系统初始的时候，创建了[-128,127]之间的一个缓存数组。
		//当我们调用Valueof的时候，首先检查是否存在[-128,127]
		
	}
}
