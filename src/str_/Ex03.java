package str_;

public class Ex03 {

	public static void main(String[] args) {
		String id ="test";
		id = id.trim(); // 양쪽 공백 제거
		
		//공백이 포함되었을 경우
		if(id.equals("test")) {
			System.out.println("인증 통과");
		}else {
			System.out.println("인증 실패");
		}
		//구분자 사용
		String addr = "우편번호/주소/상세주소"; //구분할 문자 표시
		System.out.println(addr);
		String [] s = addr.split("/");
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		//replace 구분자 변경
		System.out.println("addr" +addr);
		addr = addr.replace("/",">");
		System.out.println("addr" +addr);
		
		
		
	}

}
