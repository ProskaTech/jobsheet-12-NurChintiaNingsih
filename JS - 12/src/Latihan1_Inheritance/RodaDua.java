/* 
 * @Created by: 21343011 - Nur Chintia Ningsih
 */
package Latihan1_Inheritance;

public class RodaDua extends Kendaraan {
	double NaikHargaKe = 0.20; // 0.2 kali
	void hargaAkhir()
	{
		hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
		System.out.println("Setelah di modifikasi, harga sepeda menjadi Rp. " +hargaDasar);

	
	}

}
