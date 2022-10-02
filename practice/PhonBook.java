package PROJECT220928.practice;

import java.util.Scanner;

class Phone{
	String name;
	String num;
	Phone(String name,String num){
		this.name=name;
		this.num=num;
	}
	
}
public class PhonBook {
	public static void main(String[] args) {
		String check;
		int idx;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("인원수>>");
		int num = scanner.nextInt();
		
		Phone P[] = new Phone[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("이름과 전화전호(이름과 번호는 빈 칸없이 입력)>>");
			P[i] = new Phone(scanner.next(),scanner.next());
		}
		System.out.println("저장 되었습니다...");
		
		while(true){
			idx=-1;
			System.out.print("검색할 이름>>");
			String search = scanner.next();
			if(search.equals("그만")) break;
			for(int i=0; i<num; i++) {
				if(search.equals(P[i].name)) {
					idx =i;
				}
				 
			}
			if(idx>=0 && idx<num) {
				System.out.println
				(P[idx].name+"의 번호는 "+P[idx].num+" 입니다.");
			}
			else {
			System.out.println(search+"의 이름이 없습니다.");
			}
		}
		
		scanner.close();
	}
}
