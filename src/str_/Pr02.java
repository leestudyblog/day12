package str_;

public class Pr02 {

	public static void main(String[] args) {
		// 문자 개수 출력
		String str="Is is a fun java programming";
		
		int cnt =0;
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)=='a') {
				cnt++;
			}
		}
		int cnt1 =0;
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)=='g') {
				cnt1++;
			}
		}
		
		System.out.println("총개수는 : "+str.length());
		System.out.println("a개수는 : "+cnt);
		System.out.println("g개수는 : "+cnt1);
		
	}
		
		
	}

