import java.util.Scanner;
public class ForLoopTut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of rows: ");
		int x = sc.nextInt();
		System.out.println("Enter no. of columns: ");
		int y = sc.nextInt();
		System.out.println("Enter symbol: ");
		String symbol = sc.next();
		
		for(int i = 1; i<=x; i++) {
			for(int j = 1; j<=y; j++) {
				System.out.print(symbol);
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
