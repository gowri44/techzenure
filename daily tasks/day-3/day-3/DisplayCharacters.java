import java.util.Scanner;

public class DisplayCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 4 Numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		System.out.println(a + " - " + (char)a);
		System.out.println(b + " - " + (char)b);
		System.out.println(c + " - " + (char)c);
		System.err.println(d + " - " + (char)d);
		
		sc.close();
	}

}
