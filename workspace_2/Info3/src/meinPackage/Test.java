package meinPackage;

public class Test {
	public static void main(String arr[]){
		Command[] commands=new Command[4];
		commands[0] =new Direction(0,"abc",1);
		//	for(int i=0;i<4)
		System.out.println(commands[0].getName());
		Gear g1=new Gear(1,"abc",123);
		Gear g2=new Gear (1,"abc", 123);
		boolean b1;
		String s;
		b1=g1.equals(g2);
		System.out.println(b1);
		s=g1.toString();
		System.out.println(s);
		
		
		
	}

}
