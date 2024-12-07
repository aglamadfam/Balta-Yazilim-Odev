import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Random zandom = new Random();
		Scanner scan = new Scanner(System.in);
		
		String[] kisiler = {"Ahmet","Mehmet","Mahmut","Elif","Efe","Yusuf",
				"Doruk","İlter","Talha","Ömer"};
		
		int size = kisiler.length;
		
		
		//arraydakilerin hepsini yazdirma
		for (int i=0; i<size;i++) {
			System.out.println(kisiler[i]);
		}
		
		// guncelleme
		kisiler[0] = "John";
		
		//cikarilacak kisiyi belirleme
		String cikarilacak = "Mehmet";
		//cikarilacak kisinin indexi
		int cikarilacakIndex = Arrays.asList(kisiler).indexOf(cikarilacak);
		
		for (int i = cikarilacakIndex;i<size-1;i++) {
			kisiler[i] = kisiler[i+1];
		}
		//adam ciktigina gore sizeı ayarlıyoruz
		size--;

		System.out.println("");
		
		for (int i=0; i<size;i++) {
			System.out.println(kisiler[i]);
		}
		//goruldugu uzere artik 9 kisi var
		
		System.out.println("");
		//isimleri buyuk yazdirma
		
		for (int i=0; i<size;i++) {
			String buyukIsim = kisiler[i];
			System.out.println(buyukIsim.toUpperCase());
		}
		
		//sayilari diziye enjekte etmek icin yeni bir dizi olusturuyom
		int insertEdilecek1 = zandom.nextInt(100)+1;
		int insertEdilecek2 = zandom.nextInt(100)+1;
		int insertEdilecek3 = zandom.nextInt(100)+1;
		
		int[] insertEdilecekArray = new int[3];
		insertEdilecekArray[0] = insertEdilecek1;
		insertEdilecekArray[1] = insertEdilecek2;
		insertEdilecekArray[2] = insertEdilecek3;
		
		System.out.println("");
		
		int toplama = 0;
		int size2 = insertEdilecekArray.length;
		for(int i=(size2-1);i>=0;i--){
		    toplama += insertEdilecekArray[i];
		    System.out.println(insertEdilecekArray[i]);
		}
		System.out.println("");
		System.out.println("toplama="+toplama);
		
		int[] siralanicakDizi = new int[15];
		siralanicakDizi[0] = zandom.nextInt(100)+1;
		siralanicakDizi[1] = zandom.nextInt(100)+1;
		siralanicakDizi[2] = zandom.nextInt(100)+1;
		siralanicakDizi[3] = zandom.nextInt(100)+1;
		siralanicakDizi[4] = zandom.nextInt(100)+1;
		siralanicakDizi[5] = zandom.nextInt(100)+1;
		siralanicakDizi[6] = zandom.nextInt(100)+1;
		siralanicakDizi[7] = zandom.nextInt(100)+1;
		siralanicakDizi[8] = zandom.nextInt(100)+1;
		siralanicakDizi[9] = zandom.nextInt(100)+1;
		siralanicakDizi[10] = zandom.nextInt(100)+1;
		siralanicakDizi[11] = zandom.nextInt(100)+1;
		siralanicakDizi[12] = zandom.nextInt(100)+1;
		siralanicakDizi[13] = zandom.nextInt(100)+1;
		siralanicakDizi[14] = zandom.nextInt(100)+1;
		
		System.out.println("");
		
		for(int i = 0; i < 9; i++){
            for(int j = i+1; j < 10; j++){
                if(siralanicakDizi[j] < siralanicakDizi[i]) {
                    int x = siralanicakDizi[i];
                    siralanicakDizi[i] = siralanicakDizi[j];
                    siralanicakDizi[j] = x;
                }
            }
        }
        for(int i = 0; i < 10; i++){
            System.out.println(siralanicakDizi[i]);
        }
		
		
	}
}