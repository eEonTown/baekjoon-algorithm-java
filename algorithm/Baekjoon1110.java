import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int a = n;
		int b;
		int result = 0;
		
		if(n == 0) {
			System.out.println("1");
		}else {
			do {
				b = (a % 10) * 10 + ((a / 10) + (a % 10)) % 10;
				a = b;
				result++;
			}while(b != n); {
				System.out.println(result);
			}
		}
	}
}
