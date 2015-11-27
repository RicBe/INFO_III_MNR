
public class Tablet extends Computer {
	private int size;
	private String os;
	
	Tablet(int size, CPU cpu){
		super(cpu);
		this.size=size;
	}
	public int getSize(){
		return size;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getOs() {
		return os;
	}
	public Tablet clone(){
		CPU c1=new CPU(this.getCPU().getWortbreite(),this.getCPU().getFrequency());
		Tablet t2=new Tablet(this.getSize(),c1);
		return t2;
	}
	public boolean equals(Tablet t2){
		if((this.getSize()==t2.getSize())&&(this.getCPU().getWortbreite()==t2.getCPU().getWortbreite())&&(this.getCPU().getFrequency()==t2.getCPU().getFrequency())){
			return true;
		}
		else
			return false;
	}
}
