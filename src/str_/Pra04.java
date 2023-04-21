package str_;
import java.io.IOException;
import java.util.Arrays;
public class Pra04 {

	public static void main(String[] args) {
		//로또 프로그램
		
		System.out.println("＊로또번호 랜덤 생성＊"); 
		int idx_num = 0;
		int lotto_num[] = new int[6]; 
		
		String result_txt = "";
		
		for(int i=1; i<=30; i++){ 
			
			result_txt = "";
			result_txt += idx_num+1+"회 : [ "; 
			
			//6개의 랜덤번호를 저장
			for(int j=0; j<=5; j++){
				int num_temp = (int) (Math.random()*44+1);
				lotto_num[j] = num_temp; 
			} 
			
			//저장된 숫자 정렬
			Arrays.sort(lotto_num); 
			
			//중복된 값 체크
			boolean duple = false;
			for(int k=0; k<lotto_num.length; k++){ 
				
				if(k==lotto_num.length-1) { //6번째 숫자일 경우 
					result_txt += lotto_num[k]+" ]"; 
					
				}else if(lotto_num[k]!=lotto_num[k+1]){ //list 내 인접한 숫자가 중복되지 않을 경우
					result_txt += lotto_num[k]+", \t"; 
					
				}else { //중복된 숫자가 있을 경우 flag 체크
					duple = true;
				}
			}
			
			if(idx_num==5)break; //로또번호는 5번만 출력
			
			if(duple==false) { //중복된 숫자가 없으면 로또번호 출력
				idx_num++;
				System.out.println(result_txt);	
			}
		}
		
	}

}
