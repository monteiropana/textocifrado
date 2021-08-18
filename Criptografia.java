import java.util.Scanner;
import java.io.File;

public class Criptografia {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("texto_cifrado.txt"));
	
			String cifra = sc.nextLine();
			
			String textoPronto = "";
			
			for (int i = 0; i < cifra.length(); i++) {
				if (cifra.charAt(i) == '4') {
					textoPronto += 'a';
				} else if (cifra.charAt(i) == '3') {
					textoPronto += 'e';
				} else if (cifra.charAt(i) == '1') {
					textoPronto += 'i';
				}  else if (cifra.charAt(i) == '0') {
					textoPronto += 'o';
				} else if (cifra.charAt(i) == '7') {
					textoPronto += 'u';
				} else {
					textoPronto += cifra.charAt(i);
				}
			}
			System.out.println("Texto cifrado: " + cifra);
			System.out.println("Texto pronto: " + textoPronto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


//4 = a
//3 = e
//1 = i
//0 = o
//7 = u