import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //사용자 입력으로 n값을 받는다.
		
		for(int i = 0; i < n; i++) {
			
			for(int j = n-i; j > 1; j--) {
				System.out.print(" ");
			}
			
			for(int k = i; k >= 0; k--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		sc.close();
	}
}
