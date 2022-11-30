import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("다리가 4개 달린 동물은? ");
		
		String user = a.next();
		
		System.out.println("그건 바로 " + user + "입니다.");
		
		
	}

}
