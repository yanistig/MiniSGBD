import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		DBManager dbManager = new DBManager();
		dbManager.init();
		Scanner sc = new Scanner(System.in);
		System.out.println(" init to the DBDef");
		
		String nom = sc.nextLine();
		int nbc = sc.nextInt();
		for(int i=0; i<nbc; i++) {
			String typeC = sc.nextLine();
		}

		System.out.println(" add to the DBDef");
		
		
		
		
	}

}
