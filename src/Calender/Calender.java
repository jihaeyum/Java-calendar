package Calender;

import java.util.Scanner;

public class Calender {

	private static final int[] Maxdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysOfMonth(int month){
		
		return Maxdays [month -1];
		
	}
	public static void main(String[] args) {
		System.out.println(" �� ��  ȭ  �� ��  ��  ��");
		System.out.println("---------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 21 21");
		System.out.println("22 23 24 25 26 27 28");
		
		Scanner scanner = new Scanner(System.in);
		Calender cal= new Calender();
		
		System.out.println("�ݺ�Ƚ���� �Է��ϼ���");
		int repeat = scanner.nextInt();
		
		for (int i = 0;i < repeat; i++) {
			System.out.println("���� �Է��ϼ���.");
			int month = scanner.nextInt();
			System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.", month, cal.maxDaysOfMonth(month));
			
		}
		System.out.println("bye~");
		scanner.close();
	}

}
