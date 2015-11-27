
public class Band {
	private Instrument instrument;
	
	public static void main(String[] args){
		Instrument i1=new Trompete();
		Instrument i2=new Trommel();
		Instrument i3=new Bass();
		i1.spieleInstrument();
		i2.spieleInstrument();
		i3.spieleInstrument();
	}
}
