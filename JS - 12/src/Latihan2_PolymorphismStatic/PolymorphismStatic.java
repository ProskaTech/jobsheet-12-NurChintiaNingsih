/* 
 * @Created by: 21343011 - Nur Chintia Ningsih
 */
package Latihan2_PolymorphismStatic;

public class PolymorphismStatic {
	// Run | Debug

	public static void main(String[] args) {
		// memanggil metode perimeter dengan satu argumen
		System.out.println("Sisi Persegi adalah : 4\nKeliling Persegi adalah : "
							+CompileTime.keliling(4)+ "\n");
		
		// memanggil metode perimeter dengan dua argumen
		System.out.println("Sisi Persegi panjang adalah : 10, 13\nKeliling Persegi Panjang adalah : "
							+CompileTime.keliling(10,13));

	}

}
