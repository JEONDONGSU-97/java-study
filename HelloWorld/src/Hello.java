import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		if (str.equals("a")||str.equals("A")) {
			System.out.println("Apple");
		} else if (str.equals("b")||str.equals("B")) {
			System.out.println("Banana");
		} else if (str.equals("w")||str.equals("W")) {
			System.out.println("watermelon");
		} else if (str.equals("s")||str.equals("S")) {
			System.out.println("strawberry");
		} else {
			System.out.println("존재하지 않는 이니셜 입니다.");
		}
		System.out.println("프로그램 종료");
	}

}
