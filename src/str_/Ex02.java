package str_;

public class Ex02 {

	public static void main(String[] args) {
		//형변환
		int num =1111;
		String st = num + "";
		System.out.println(st + num);
		
		int n = Integer.parseInt(st);// (int)st
		System.out.println(n + num);
		
		String st2 ="";
		st2 +="a";
		st2 +='b';
		st2 +=(char)('c' - 32);  // char 안하면 c = 99 - 32로 출력
		System.out.println(st2);
		
	}

}
