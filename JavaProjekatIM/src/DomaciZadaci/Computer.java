 
package DomaciZadaci;

public class Computer {
	private int RAM;
	private String OS;
	private boolean PowerOn;

	public void OnOff() {
		if (PowerOn == true) {
			PowerOn = false;
		}
		else {
			PowerOn = true;
		}
	}
	
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		if (rAM == 2 || rAM == 4 || rAM == 8 || rAM == 16 || rAM == 32 || rAM == 64 || rAM == 128) {
			RAM = rAM;
		}
		else {
			System.out.println("\"" + rAM + "\"" + " nije odgovarajuca vrednost za RAM. Podrzane vrednosti su: 2, 4, 8, 16, 32, 64, 128.");
			RAM = 4;
		}
			
	}
	public String getOS() {
		return OS;
	}
	public void setOS(String oS) {
		if (oS == "Linux" || oS == "MacOs" || oS == "Windows") {
			OS = oS;
		}
		else {
			System.out.println("\"" + oS + "\"" + " nije odgovarajuci operativni sistem. Podrzani su samo Linux, MacOs i Windows");
			OS = "built-in";
		}
	}
	public boolean isPowerOn() {
		return PowerOn;
	}
	public void setPowerOn(boolean powerOn) {
		PowerOn = powerOn;
	}
	
	
	

}
