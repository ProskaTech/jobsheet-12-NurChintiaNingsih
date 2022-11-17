/* 
 * @Created by: 21343011 - Nur Chintia Ningsih
 */
package Latihan3_PolymorphismDynamic;

public class BNI extends Bank {
	// overriding sukuBunga method
	float sukuBunga() {
		return 10.6f;
	}

}
class Mandiri extends Bank{
	// overriding sukuBunga method
	float sukuBunga() {
		return 9.4f;
	}
}
