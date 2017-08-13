import java.util.Scanner;
public class Yoshiko {	
	public static void main(String[] args) {
		System.out.println("Yoshiko no koibito wa dare?");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		switch (str) {
			case "Yuri":
				System.out.println("dajiayiqishangtian");
				break;
			case "pangci":
				System.out.println("yeyeyewozaitianshangfei");
				break;
			default:
				System.out.println("nongsita!!!");
		}
	}
}