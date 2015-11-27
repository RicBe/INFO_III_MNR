package meinPackage;

/**
 * Beinhaltet die main-methode und array mit command-Objekten
 * @author wuestema
 *
 */
public class ControlDeveloper {
	String name="Control-Developer";
	Command[] commands = new Command[4];
	
	
	/**
	 * füllt das commands-array mit eingetragenen Werten
	 */
	public void testCommands(){
		commands[0] = new Direction(12,"3",1);
		commands[1] = new Gear(5,"0",2);
		commands[2] = new Pause(100,3);
		commands[3] = new Repitition(4,4);
	}
	
	/**
	 * gibt das commands-array aus
	 */
	public void printCommands(){
		for (int j = 0; j < commands.length; j++) {
			System.out.println(commands[j].toString());
		}
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public static void main(String[] args) {
		ControlDeveloper cd1=new ControlDeveloper();
		ControlModel commandList=new ControlModel();
		System.out.println(cd1.getName());
		System.out.println(cd1.name);
		cd1.testCommands();
		//cd1.printCommands();
		for (int j = 0; j < 4; j++) {
			commandList.addStep(cd1.commands[j]);
		}
		commandList.showList();
		commandList.showIDs();
		
		
		
		
		/**
		 * Hauptprogramm zum ausgeben des Namens des erzeugten Objektes (direkt und über get()
		 */
	}

}
