/* 
 * @Created by: 21343011 - Nur Chintia Ningsih
 */
package Latihan6_Encapsulation;

public class BuahUtama {
	// Run | Debug

	public static void main(String[] args) {
		// Menggunakan constructor untuk menginisialisasi
		EncapsulationBuah Apel = new EncapsulationBuah ("Apel","Rp.3000","Merah");
		//Menggunakan getter ke nilai
		System.out.println("Nama Buah : "+ Apel.getName()+"\nHarga: "
				+Apel.getPrice()+"\nWarna: "+Apel.getColor());
		// uptude harga dan warna menggunakan setter
		Apel.setColor("Hijau");
		Apel.setPrice("Rp.7000");
		System.out.println("Nama Buah "+Apel.getName()+"\nHarga: "
				+Apel.getPrice()+"\nWarna: "+Apel.getColor());

	}

}
