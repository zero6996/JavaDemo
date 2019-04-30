public class switch_exercise {
	public static void main(String[] agrs) {
		int weekday = 6;
		switch(weekday) {
			case 1:
				System.out.println("今天星期一");
				break;
			case 2:
				System.out.println("今天星期二");
				break;
			case 3:
				System.out.println("今天星期三");
				break;
			case 4:
				System.out.println("今天星期四");
				break;
			case 5:
				System.out.println("今天星期五");
				break;
			case 6:
				System.out.println("今天星期六");
				break;
			case 7:
				System.out.println("今天星期日");
				break;
			default:
				System.out.println("输入数据有误");
				break;
		}
	}
}
