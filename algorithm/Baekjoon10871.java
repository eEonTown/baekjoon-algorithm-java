import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strArr = br.readLine().split(" ");
		int n = Integer.parseInt(strArr[0]); //수열의 크기를 정하는 값을 받는 변수
		int x =	Integer.parseInt(strArr[1]); //수열에서 비교할 값을 받는 변수
		
		String[] sequence = new String[n]; //n의 크기만큼 배열 지정
		sequence = br.readLine().split(" "); //n의 크기만큼의 수열을 이룬다
		
		for(int i = 0; i < n; i++) { //수열내의 값들과 x의값을 비교하기 위해 수열의 크기인 n만큼 반복문을 돌림
			
			if(Integer.parseInt(sequence[i]) < x) {
				int a = Integer.parseInt(sequence[i]);
				System.out.print(a);
				System.out.print(" ");
			}
		}
	}
}
