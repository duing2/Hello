package ch04;

import java.util.Scanner;

public class checktest07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int num2 = 0;
		
		
		while(run) {
			
			System.out.println("-----------------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------------------");
			System.out.println();
			
			System.out.print("선택> ");
			int num = scanner.nextInt();
			
			if(num == 1) {
				System.out.print("예금액>");
				num2 += scanner.nextInt();
			}
			else if(num == 2) {
				System.out.print("출금액>");
				num2 -= scanner.nextInt();
			}
			else if(num == 3) {
				System.out.print("잔고>");
				System.out.println(num2);
			}
			else if(num == 4) {
				run = false;
			}//if문 종료
		}//while문 종료

		System.out.println("프로그램 종료");
		
	}

}
