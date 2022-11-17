/* 
 * @Created by: 21343011 - Nur Chintia Ningsih
 */
package Latihan3_PolymorphismDynamic;

public class PolymorphismDynamic {
// Run | Debug
	public static void main(String[] args) {
		// creating variable of Bank class
		Bank B;
		B = new BRI();
		System.out.println("Tingkat Suku Bunga BRI adalah: "+B.sukuBunga());
		B = new BNI();
		System.out.println("Tingkat Suku Bunga BNI adalah: "+B.sukuBunga());
		B = new Mandiri();
		System.out.println("Tingkat Suku Bunga Mandiri adalah: "+B.sukuBunga());

	}

}
