import java.io.File;
import java.util.Scanner;

public class ManipulandoCaminhoArquivo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(System.in);
		String strPath = sc.nextLine();
		File path = new File(strPath);
		
		System.out.println("GetName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		

	}

}
