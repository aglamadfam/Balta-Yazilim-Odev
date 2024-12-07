import java.util.Scanner;
import java.util.Random;

public class Main
{
	public static void main(String[] args) {
		Random zandom = new Random();
		Scanner scan = new Scanner(System.in);
		String hesapEmail = "gulerahmetyusuf4@gmail.com";
		String hesapSifre = "hamza2010*LEri";
		int denemeHakki = 3;


		for(int i = 0; i<denemeHakki; i+=0) {

			System.out.println("Lutfen hesap emailinizi girin");
			String girisEmail = scan.nextLine();
			System.out.println("\nLutfen hesap sifrenizi girin");
			String girisSifre = scan.nextLine();

			if(girisEmail.equals(hesapEmail) && girisSifre.equals(hesapSifre)) {
				System.out.println("\ngiris basarili");
				break;
			}
			else {
				denemeHakki--;
				if(denemeHakki!=0) {
					System.out.println("\nemail ya da sifreniz hatali. "+ denemeHakki+" deneme hakkiniz kaldi");
				} else {
					System.out.println("\nDeneme hakkiniz bitti daha fazla deneme yapamazsiniz");
					break;
				}
			}

		}

		System.out.println("\nFaktoriyel alacaginiz sayi giriniz:");
		int faktoriyelAlinacakSayi = scan.nextInt();
		int sonuc =1;
		for(int i=faktoriyelAlinacakSayi; i>0; i--) {

			sonuc *= i;

		}
		System.out.println("\nsayinin faktoriyeli: "+sonuc);

		int toplamCift = 0;
		int toplamTek = 0;

		for(int i=0; i<50; i++) {
			int sayi = zandom.nextInt(100)+1;

			if(sayi%2==0) {
				toplamCift++;
			} else {
				toplamTek++;
			}

		}

		System.out.println("\n50 tane sayida "+toplamCift+" kadar cift sayi ve "+toplamTek+" kadar tek sayi cikti");



	}
}
