/* 
 * @Created by: 21343011 - Nur Chintia Ningsih
 */
package Latihan4_AbstractionClass;

public class AnakUmur1Tahun extends Orang{
	
	public void namaAyahKu() {
		System.out.println("Nama Ayahku adalah "+namaAyah);
	}
	@Override
	public void makan() {
		System.out.println("Anak Umur 1 Tahun Makan Asi");
	}
	@Override
	public void minum() {
		System.out.println("Anak Umur 1 Tahun Minum Asi");
	}
}
