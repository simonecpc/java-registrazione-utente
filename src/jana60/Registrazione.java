package jana60;

import java.util.Scanner;

public class Registrazione {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserire i dati per l'iscrizione:");
		
		boolean riprova = true;
		
		do {
				System.out.println("Inserire nome:");
				String nome = scan.nextLine();
				System.out.println("Inserire Cognome: ");
				String cognome = scan.nextLine();
			try {
				System.out.println("Inserire e-mail: ");
				String email = scan.nextLine();
				System.out.println("Inserire Password: ");
				String password = scan.nextLine();
				System.out.println("Inserire età: ");
				int eta = Integer.parseInt(scan.nextLine());
				
				Utente u = new Utente (nome ,cognome ,email ,password ,eta);
				riprova = false;
				System.out.println(u);
			} catch (NumberFormatException e) {
				System.out.println("Inserire un numero per l'età");
				e.printStackTrace();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}while(riprova);
	}
	
}
