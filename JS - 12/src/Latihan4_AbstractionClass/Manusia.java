/* 
 * @Created by: 21343011 - Nur Chintia Ningsih
 */
package Latihan4_AbstractionClass;

public class Manusia {
	// Run | Debug

	public static void main(String[] args) {
		// object induk tidak bisa dibuat disini
		
		//buat object anak umur 1 tahun baru
		AnakUmur1Tahun a1 = new AnakUmur1Tahun();
		
		//panggil method anak umur 1 tahun
		a1.makan();
		a1.minum();
		a1.namaAyahKu();
		System.out.println();

	}

}
