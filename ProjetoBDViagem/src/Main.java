import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				System.out.println("vai ter copa!");
			}
			if (n != 0) {
				System.out.println("vai ter duas!");
			}
		}
	}
}