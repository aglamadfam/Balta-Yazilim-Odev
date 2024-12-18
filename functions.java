package fonksiyonlar;
import java.util.Arrays;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		double notLar[] = {67,24,85};
		notLar = arrayEkleyen62(notLar,53);
		
		System.out.println(Arrays.toString(notLar));
		System.out.println(ortalamaAlan13(notLar));
		
		
		double not = notAlici(80,50);
		System.out.println("notunuz: "+not);


		System.out.println("cevap "+ carpici(4));

	}

	static double carpici(int kacSayi) {

		Scanner scann = new Scanner(System.in);

		float toplam = 0;
		System.out.println(kacSayi+" kadar sayiyi carpmak istiyorsunuz");
		int cikarilacak = kacSayi--;
		System.out.println();
		for(int i = kacSayi; i>=0; i--) {
			int kacinci = (i - cikarilacak)+2;
			System.out.println(kacinci+ ". sayiyi gir");
			int giris = scann.nextInt();

			if(kacinci == 1) {

				toplam = giris;


			} else {
				toplam *= giris;
			}
			cikarilacak-=2;
		}


		return toplam;
	}

	static double[] arrayEkleyen62(double notLar[],double eklenecekSayi) {
		int uzunluk = notLar.length;
		double geciciNot[] = Arrays.copyOf(notLar, uzunluk+1);
		geciciNot[uzunluk] = eklenecekSayi;
		
		return geciciNot;
	}

	static double ortalamaAlan13(double array[]) {
		
		int uzunluk = array.length;
		double toplam=0;
		for(int i=0;i<uzunluk;i++) {
			toplam += array[i];
		}
		double returnlenecek =toplam/uzunluk;
		
		return returnlenecek;
	}
	

	static double notAlici(double vizeNot,double finalNot) {

		double realNot = (vizeNot*0.4) + (finalNot*0.6);


		return realNot;
	}

}
