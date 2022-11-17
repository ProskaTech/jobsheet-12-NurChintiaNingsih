/* 
 * @Created by: 21343011 - Nur Chintia Ningsih
 */
package Latihan3_PolymorphismDynamic;

public class Bank {
	float sukuBunga() {
		return 0;
	}
}
class BRI extends Bank{
	// overriding sukuBunga method
	float sukuBunga() {
		return 5.5f;
	}
}



