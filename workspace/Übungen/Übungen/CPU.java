
public class CPU {
	private int wortbreite;
	private int frequency;
	
		
	CPU(int wortbreite, int frequency){
		this.wortbreite=wortbreite;
		this.setFrequency(frequency);
	}
	
	public int getWortbreite(){
		return wortbreite;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public int getFrequency() {
		return frequency;
	}
	
}
