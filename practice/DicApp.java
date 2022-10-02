package PROJECT220928.practice;
import java.util.Scanner;

class Dictionary{
	private static String[] kor= {"사랑","아기","돈","미래","희망"};
	private static String[] eng= {"love","baby","money","future","hope"};
	public static String kor2Eng(String word) {
		int idx=-1;
		for(int i=0;i<kor.length;i++) {
			if(kor[i].equals(word)) {
				idx=i;
				break;		
			}
			}
		if(idx==-1) {
			return "NONE";
		}
		else {
			return eng[idx];
		}
	}
}
public class DicApp {
	public static void main(String[] args) {
		String word;
		Dictionary dic;

		Scanner scanner = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
		System.out.print("한글 단어?");
		word = scanner.next();
		if(word.equals("그만")) break;
		
		if(Dictionary.kor2Eng(word).equals("NONE")) {
			System.out.println(word+"은/는 저의 사전에 없습니다.");
		}
		else {
		System.out.println(word+"은/는 "+Dictionary.kor2Eng(word));
		}
	}
		scanner.close();
	}
}
