public class sum100 {
	public static void main(String[] args) {
		//forѭ��
		int sum = 0;
		for(int i = 1;i <= 100;i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("forѭ���棺1~100ż��֮���ǣ�" + sum);
		//whileѭ��
		int sum2 = 0;
		int j = 1;
		while(j <= 100) {
			if(j % 2== 0) {
				sum2 += j;
			}
			j++;
		}
		System.out.println("whileѭ���棺1~100ż��֮���ǣ�" + sum2);
		//do...whileѭ��
		int sum3 = 0;
		int k = 1;
		do {
			if(k % 2 == 0) {
				sum3 += k;
			}
			k++;
		}while(k <= 100);
		System.out.println("do...whileѭ���棺1~100ż��֮���ǣ�"+ sum3);
	}
}
