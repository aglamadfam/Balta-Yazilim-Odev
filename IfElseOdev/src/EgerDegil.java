import java.util.Scanner;

public class EgerDegil {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		System.out.println("1. soru icin birinci sayi girin:");
		int birinciSayi = scann.nextInt();
		System.out.println("1. soru icin ikinci sayi girin:");
		int ikinciSayi = scann.nextInt();
		
		if(birinciSayi > ikinciSayi) {
			System.out.println("birinci sayi daha buyuk");
		}else if(ikinciSayi > birinciSayi) {
			System.out.println("ikinci sayi daha buyuk");
		}else {
			System.out.println("ikisi esit");
		}
		
		System.out.println("");
		System.out.println("2. soru vize not:");
		double vizeNot = scann.nextDouble();
		System.out.println("2. soru final not:");
		double finalNot = scann.nextDouble();
		
		double vizeNotEtki = vizeNot * 0.35;
		double finalNotEtki = finalNot * 0.65;
		double toplamNot = vizeNotEtki + finalNotEtki;
		
		if(toplamNot > 75 && toplamNot <101) {
			System.out.println(toplamNot + "ortalama ile geçti");
		}else if(toplamNot<=75 && toplamNot >=0) {
			System.out.println(toplamNot + "ortalama ile kaldi");
		}else {
			System.out.println("hata hata darbe");
		}
		
		System.out.println("");

		float toplam = 0;
		System.out.println("Kaç sayı ile işlem yapmak istersiniz:");
		int sayiSayisi = scann.nextInt();
		scann.nextLine();
		int cikarilacak = sayiSayisi--;
		for(sayiSayisi++;sayiSayisi!=0;sayiSayisi--) {
			int kacinci = (sayiSayisi - cikarilacak)+1;
			float girilecekSayi;
			System.out.println(kacinci+ ". sayiyi gir");
			String giris = scann.nextLine();
			
			if(kacinci!= 1) {
			System.out.println("4 işlemden birini gir:");
			String islem = scann.nextLine();
			
			if(giris.equals("escape")) {
				System.out.println("kapatiliyor");
				System.exit(0);
			}else {
				try {
					girilecekSayi = Float.parseFloat(giris);
					if(islem.equals("*")) {
						System.out.println("islem:"+toplam+"*"+girilecekSayi);
						toplam = toplam * girilecekSayi;
						System.out.println("sonuc:"+toplam);
					}else if(islem.equals("/")) {
						System.out.println("islem:"+toplam+"/"+girilecekSayi);
						toplam = toplam / girilecekSayi;
						System.out.println("sonuc:"+toplam);
					}else if(islem.equals("-")) {
						System.out.println("islem:"+toplam+"-"+girilecekSayi);
						toplam = toplam - girilecekSayi;
						System.out.println("sonuc:"+toplam);
					}else if(islem.equals("+")) {
						System.out.println("islem:"+toplam+"+"+girilecekSayi);
						toplam = toplam + girilecekSayi;
						System.out.println("sonuc:"+toplam);
						
					}else {
						System.out.println("error");
					}
					
					
				}
				catch(NumberFormatException ex) {
					System.out.println("error");
				}
			
			}
			}
			else if(kacinci == 1) {
				if(giris.equals("escape")) {
					System.out.println("kapatiliyor");
					System.exit(0);
				}else {
					try {
						girilecekSayi = Float.parseFloat(giris);
						toplam = girilecekSayi;
						
					}
					catch(NumberFormatException ex) {
						System.out.println("error");
					}
				
				}
			}
			cikarilacak -=2;
				
		}
			
			
		System.out.println("");
		System.out.println("");
		System.out.println("email girin:");
		String email = scann.nextLine();
		
		if(email.contains("@gmail.com")) {
			System.out.println("giris basarili");
		}else {
			System.out.println("hata");
		}

		
		
		System.out.println("");
		System.out.println("senaryo");
		System.out.println("beyaz masa çağrı merkezine hoşgeldiniz");
		System.out.println("istanbulkart için 1'i | kredi kartı için 2'yi");
		System.out.println("bardak için 3'ü       | bardak altlığı için 4'ü");
		System.out.println("matematik için 5'i    | türkçe için 6'yı");
		System.out.println("for english press 7   | Ziffer 8 für Deutsch");
		System.out.println("diall 9 pour le français");
		System.out.println(" ");
		int tuslananNum = scann.nextInt();
		
		if(tuslananNum == 1) {
			System.out.println("istanbulkart çağrı merkezine hoşgeldiniz hemen operatörü balıyom");
		}else if(tuslananNum ==2) {
			System.out.println("kredi kartınızı ben ne yapayım");
		}else if(tuslananNum ==3) {
			System.out.println("bardak bardak bardak kahve");
		}else if(tuslananNum ==4) {
			System.out.println("bardak altlığı şuan stokta bulunmamaktadır");
		}else if(tuslananNum ==5) {
			System.out.println("2*2 = ceza");
		}else if(tuslananNum==6) {
			System.out.println("türkçe = türkiye = türkçe");
		}else if(tuslananNum==7) {
			System.out.println("and perhaps who is you");
		}else if(tuslananNum==8) {
			System.out.println("Eins, hier kommt die Sonne");
		}else if(tuslananNum==9) {
			System.out.println("tu ne da le vi de vi de tu ne da le vi de vi de");
		}else {
			System.out.println("hata hata darbe");
		}
		
		
		}
		
	}


