package cn.sxt.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestCalender {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要查询的日期：如\"2019-2-30\"");
		String str = sc.nextLine();
		//声明日期格式
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		//将字符串转为日期
		Date date = df.parse(str);
		System.out.println("你刚刚输入的日期为："+date);
		Calendar c = new GregorianCalendar();
		c.setTime(date);
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("日\t一\t二\t三\t四\t五\t六");
//		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		

		
		//将日期转为当前月份一号
		c.set(Calendar.DAY_OF_MONTH, 1);
//		System.out.println(c);
		//获取当前月份的最大天数
//		System.out.println(c.getActualMaximum(Calendar.DATE));
//		System.out.println(Calendar.DAY_OF_MONTH);
		
		for(int j=1;j<c.get(Calendar.DAY_OF_WEEK);j++) {
			System.out.print("\t");
		}
		
		int maxdays = c.getActualMaximum(Calendar.DATE);
		for(int i=1;i<=maxdays;i++) {
			if(day==c.get(Calendar.DAY_OF_MONTH)) {
				System.out.print(c.get(Calendar.DAY_OF_MONTH)+"*"+"\t");
			}else {
				System.out.print(c.get(Calendar.DAY_OF_MONTH)+"\t");
			}
			if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY) {
				System.out.println();
			}
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
}
