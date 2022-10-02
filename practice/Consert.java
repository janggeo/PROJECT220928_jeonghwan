package PROJECT220928.practice;

import java.util.Scanner;

class Menu{
	private String[] S = {" --- "," --- "," --- "," --- "," --- "," --- "," --- "," --- "," --- "," --- "};
	private String[] A = {" --- "," --- "," --- "," --- "," --- "," --- "," --- "," --- "," --- "," --- "};
	private String[] B = {" --- "," --- "," --- "," --- "," --- "," --- "," --- "," --- "," --- "," --- "};
	

	public Menu() {
		
	}
	public void reserve() {
		int choice=0;
		String name;
		int seat=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		choice = scanner.nextInt();
		
		switch(choice) {
			case 1:{
				System.out.print("S>> ");
				for(int i=0;i<S.length;i++) {
					System.out.print(S[i]);
				}
				System.out.println();
				System.out.print("이름>>");
				name = scanner.next();
				System.out.print("번호>>");
				seat = scanner.nextInt();
				
				S[seat-1] = name;
				break;
			}
			case 2:{
				System.out.print("A>> ");
				for(int i=0;i<A.length;i++) {
					System.out.print(A[i]);
				}
				System.out.println();
				System.out.print("이름>>");
				name = scanner.next();
				System.out.print("번호>>");
				seat = scanner.nextInt();
				
				A[seat-1] = name;
				break;
			}
			case 3:{
				System.out.print("B>> ");
				for(int i=0;i<B.length;i++) {
					System.out.print(B[i]);
				}
				System.out.println();
				System.out.print("이름>>");
				name = scanner.next();
				System.out.print("번호>>");
				seat = scanner.nextInt();
				
				B[seat-1] = name;
				break;
			}
		}
	}
	
	public void show() {
		System.out.print("S>> ");
		for(int i=0;i<S.length;i++) {
			System.out.print(S[i]);
		}
		System.out.println();
		System.out.print("A>> ");
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]);
		}
		System.out.println();
		System.out.print("B>> ");
		for(int i=0;i<B.length;i++) {
			System.out.print(B[i]);
		}
		System.out.println();
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	public void cancel() {
		int choice;
		String name;
		Scanner scanner = new Scanner(System.in);
		System.out.print("좌석 S:1, A:2, B:3>>");
		choice = scanner.nextInt();
		
		switch(choice) {
			case 1:{
				System.out.print("S>>");
				for(int i=0;i<S.length;i++) {
					System.out.print(S[i]);
				}
				System.out.println();
				System.out.print("이름>>");
				name = scanner.next();
				for(int i=0; i<S.length;i++) {
					if(name.equals(S[i])) 
						S[i]=" --- ";
				}
				break;
			}
			case 2:{
				System.out.print("A>>");
				for(int i=0;i<A.length;i++) {
					System.out.print(A[i]);
				}
				System.out.println();
				System.out.print("이름>>");
				name = scanner.next();
				for(int i=0; i<A.length;i++) {
					if(name.equals(A[i])) 
						A[i]=" --- ";
				}
				break;
			}
			case 3:{
				System.out.print("B>>");
				for(int i=0;i<B.length;i++) {
					System.out.print(B[i]);
				}
				System.out.println();
				System.out.print("이름>>");
				name = scanner.next();
				for(int i=0; i<B.length;i++) {
					if(name.equals(B[i])) 
						B[i]=" --- ";
				}
				break;
			}
		}
	}
}

public class Consert {
	public static void main(String[] args) {
		int choice=0;
		Menu menu = new Menu();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		
		while(choice!=4) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			choice = scanner.nextInt();
			switch(choice) {
			case 1: {
				menu.reserve();
				break;
			}
			case 2: {
				menu.show();
				break;
			}
			case 3:{ 
				menu.cancel();
				break;
			}
				
			case 4: break;
			}
		}
		scanner.close();
		
	}
}
	
