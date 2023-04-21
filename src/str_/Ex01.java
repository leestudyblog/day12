package str_;

public class Ex01 {

	public static void main(String[] args) {
		
		String s = new String(); //자동으로 null 
		s="abcd";
		System.out.println(s);
		
		s= s.toUpperCase(); 
		//대문자로 변환
		System.out.println(s);
		//소문자로 출력
		System.out.println(s.toLowerCase());
		//인덱스 위치 해당 값 출력	
		System.out.println(s.charAt(0)); 
		System.out.println(s.charAt(1)); 	
		
		
		char ch =s.charAt(0);
		
		
	
	}
	
}
