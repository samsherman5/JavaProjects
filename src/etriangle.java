import java.util.Scanner;
public class etriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int input=scan.nextInt();

		for(int x = 0; x<input; x++) {
			for(int y = input; y>x; y--) {
				System.out.print(" ");
			}
			for(int y = 0; y<=x; y++ ) {
				System.out.print("*");
			}
			for(int y = 1; y<=x; y++ ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
