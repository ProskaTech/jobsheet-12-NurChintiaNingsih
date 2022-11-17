/* 
 * @Created by: 21343011 - Nur Chintia Ningsih
 */
package Latihan5_AbstractionInterface;

public class AktivitasPagiAnak implements AktivitasPagi{
	
		@Override
		public void lari() {
			System.out.println("Aktivitas Pertama Pagi ini adalah Lari Pagi");
			
		}
		
		@Override
		public void berenang() {
			System.out.println("Aktivitas Kedua Pagi ini adalah Berenang");
		}

}
