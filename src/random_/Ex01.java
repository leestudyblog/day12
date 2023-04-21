package random_;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println(Math.random());
		ArrayList<Integer> arr = new ArrayList<>();
		
		
		for (int i=0; i<5; i++) {
			double ran = Math.random();//더블 자료형
			arr.add((int)(ran*45)+1);
			
			System.out.println((int)(ran*3));//0~3
			System.out.println((int)(ran*3)+10);// 10~12
		}
	
	}

}
