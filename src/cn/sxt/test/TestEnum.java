package cn.sxt.test;

public class TestEnum {

	public static void main(String[] args) {
		System.out.println(SeaSon.SPRING);
		
		SeaSon a = SeaSon.AUTUMN;
		switch (a) {
		case SPRING:
			System.out.println("春天来了");
			break;
		case SUMMER:
			System.out.println("夏天来了");
			break;
		case AUTUMN:
			System.out.println("秋天来了");
			break;
		case WINTWER:
			System.out.println("冬天来了");
			break;

		default:
			break;
		}
	}
	enum SeaSon{
		SPRING,SUMMER,AUTUMN,WINTWER;
	}
}
