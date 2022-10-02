package PROJECT220928.practice;

import java.util.Scanner;

class Player{
	public String name;			//플레이어 이름
	public String temp;			//참가자가 입력한 단어
	public static String word="아버지";	//직전 참가자가 입력한 단어( 처음 제시어는 아버지)
	
	public Player() {//생성자
		//참가자의 이름 입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("참가자의 이름을 입력하세요>>");
		name= scanner.next();
	}
	
	public void getWordFromUser() {//단어 입력
		Scanner scanner = new Scanner(System.in);
		System.out.print(name+">>");
		this.temp = scanner.next();
	}
	
	public boolean checkSuccess() {
		int lastIndex = word.length() -1;
		char lastChar = word.charAt(lastIndex);
		char firstChar = word.charAt(0);
		//전 참가자의 단어와 비교
		if(this.temp.charAt(0) != lastChar){//끝말잇기 실패
			System.out.println(name + "이/가 졌습니다." );
			return false;
		}
		else {//끝말잇기 성공
			word=temp; //word값을 현재 참가자가 말한 단어로 변경
			return true;
		}
	}
}
public class WordGameApp {
	
	public Player[] PlayerList;
	public int num;
	
	public WordGameApp() {
	}
	
	public void run() {
		PlayerList = new Player[num];
		for(int i=0; i<num; i++) {//PlayerList에 각 참가자 생성
			PlayerList[i] = new Player();
		}
		System.out.println("시작하는 단어는 아버지입니다.");
		while(true) {
			for(int i=0; i<num; i++) {
				PlayerList[i].getWordFromUser();
				if(!PlayerList[i].checkSuccess()) {//끝말잇기에 실패했을 경우
					return ;
				}
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		WordGameApp game = new WordGameApp();
		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		game.num = scanner.nextInt();
		game.run();
		
		scanner.close();
	}
}
