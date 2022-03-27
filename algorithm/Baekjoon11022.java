import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine()); //NumberFormatException, IOException을 예외 처리 해주어야 하며, t변수에 테스트를 몇번 돌릴 것인지 수를 받는다.
		
		for(int i = 1; i <= t; i++) {
			String[] arr = br.readLine().split(" ");
			
			bw.write("Case #" + i + ": " + Integer.parseInt(arr[0]) + " + " + Integer.parseInt(arr[1]) + " = " + (Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])) + "\n");
		}
		bw.close();
	}
}
