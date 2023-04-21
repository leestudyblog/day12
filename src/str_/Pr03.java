package str_;

public class Pr03 {

	public static void main(String[] args) {
		// 문자 변경
		System.out.println("===변경전===");
		String str = "김개똥-2017년 \n홍길동구리-2015년 \n선우선녀-2018년";
		System.out.println(str);		
		
		System.out.println("===변경후===");
		
		str = str.replace("2017", "1999");
		str = str.replace("2015", "1999");
		str = str.replace("2018", "1999");
		
		
		str = str.replace("-",":");
		System.out.println(str);
		
		
	}

}
