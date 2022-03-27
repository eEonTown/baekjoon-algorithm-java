import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine()); //테스트를 몇번 할 것 인지 수를 받음
		
		for(int i = 1; i <= t; i++) { //반복문이 테스트 케이스 수 만큼 돌게 함
			String[] arr = br.readLine().split(" "); //받는 수에 공백이 있는데 공백을 잘라 배열에 추가함
			bw.write("Case #" + i + ": " + (Integer.parseInt(arr[0]) + (Integer.parseInt(arr[1]))) + "\n");
		}
		bw.close();
	}
}
