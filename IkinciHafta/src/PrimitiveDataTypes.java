public class PrimitiveDataTypes {

	public static void main(String[] args) {
		
		int sayi1 = 16;
		int sayi2 = 8;
				
		int ucgenYukseklik = 10;
		int ucgenTabanUzunlugu = 7;
		
		int yaricapDaire = 3;
		
		
		
		System.out.println("Sayılar toplama:"+ (sayi1 + sayi2));
		System.out.println("Sayılar çıkarma: "+ (sayi1 - sayi2));
		System.out.println("Sayılar çarpma: "+ (sayi1 * sayi2));
		System.out.println("Sayılar bölme: "+ (sayi1 / sayi2));
		
		System.out.println("Üçgen alan: "+ ((ucgenYukseklik * ucgenTabanUzunlugu)/2));
		
		System.out.println("Dairenin alan "+ (Math.pow(yaricapDaire* Math.PI, 2)));
		System.out.println("Daire çevre: "+ (2 * Math.PI * yaricapDaire));
		
		

	}

}
