
public class Anwender {
	public static void main(String[] args){
		CPU c1 = new CPU(12,100);
		Tablet t=new Tablet(1,c1);
		int x =t.getSize();
		System.out.println(x);
		System.out.println(t.getCPU().getFrequency());
		System.out.println(t.getCPU().getWortbreite());
		t.setOs("Hallo");
		System.out.println(t.getOs());
		Tablet t2=t.clone();
		System.out.println(t2.getSize());
		System.out.println(t2.getCPU().getWortbreite());
		boolean b = t2.equals(t);
		System.out.println(b);
	}
}
