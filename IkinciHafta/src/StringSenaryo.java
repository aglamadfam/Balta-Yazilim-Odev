import java.util.Scanner;

public class StringSenaryo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("e-postanizi girin: ");
		String eposta = scan.nextLine();
		
		if(eposta.contains("@") && eposta.contains(".com")) {
			if (eposta.contains("ı") || eposta.contains("ğ") || eposta.contains("ş") || eposta.contains("ç") || eposta.contains("ü") || eposta.contains("ö") || eposta.contains("İ") || eposta.contains("Ğ") || eposta.contains("Ş") || eposta.contains("Ç") || eposta.contains("Ü") || eposta.contains("Ö")) {
				    System.out.println("türkçe karakter içeriyor hata hata darbe");
				} else {
				    System.out.println("eposta adresiniz:"+eposta.toLowerCase());
				}
		}
		else {
			System.out.println("try againa");
		}
		

	}


}
