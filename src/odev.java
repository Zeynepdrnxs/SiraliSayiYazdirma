import java.util.Arrays;
import java.util.Random;

public class odev {

	public static void main(String[] args) {
		/*
"Sayi" adında int ver tipinde bir dizi tanımlayınız. Dizinin içerisine 4 tane eleman atayınız,
 elemanlar 0-20 arasında rastgele atanacaktır(Elemanları for döngüsü kullanarak atayınız).
		 Dizinin elemanlarını büyükten küçüğe /küçükten büyüğe sıralayınız */
		
		int[] Sayi = new int[4];
	        Random rand = new Random();
	        for (int i = 0; i < 4; i++) {
	        	// 0-20 arası sayılar
	        	Sayi[i] = rand.nextInt(21); 
	        }
	        System.out.println("Dizi oluşturuldu: " + Arrays.toString(Sayi));
	     // Küçükten büyüğe sıralama
	        Arrays.sort(Sayi); 
	        System.out.println("Küçükten büyüğe sıralı dizi: " + Arrays.toString(Sayi));
	        for (int i = Sayi.length - 1; i >= 0; i--) {
	        	// Büyükten küçüğe sıralama
	        	System.out.print(Sayi[i] + " "); 
	        }
	        System.out.println("\nBüyükten küçüğe sıralı dizi.");
	}

}
