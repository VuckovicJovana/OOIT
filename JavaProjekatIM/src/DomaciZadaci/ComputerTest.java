
package DomaciZadaci;

public class ComputerTest {

	public static void main(String[] args) {
	
		Computer Com1 = new Computer();
		Com1.setRAM(8);
		Com1.setOS("Windows");
		Com1.setPowerOn(true);
		
		Com1.OnOff();
		
		if (Com1.isPowerOn() == false) {
			System.out.println("Metod je izvrsen pravilno.");
		}
	}
	
}

