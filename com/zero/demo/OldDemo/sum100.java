public class sum100 {
	public static void main(String[] args) {
		//for循环
		int sum = 0;
		for(int i = 1;i <= 100;i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("for循环版：1~100偶数之和是：" + sum);
		//while循环
		int sum2 = 0;
		int j = 1;
		while(j <= 100) {
			if(j % 2== 0) {
				sum2 += j;
			}
			j++;
		}
		System.out.println("while循环版：1~100偶数之和是：" + sum2);
		//do...while循环
		int sum3 = 0;
		int k = 1;
		do {
			if(k % 2 == 0) {
				sum3 += k;
			}
			k++;
		}while(k <= 100);
		System.out.println("do...while循环版：1~100偶数之和是："+ sum3);
	}
}
