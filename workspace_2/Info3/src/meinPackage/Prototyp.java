package meinPackage;

/**
 * 
 * @author wuestema
 *
 */
public class Prototyp {
	private String nameCommand;
	private Command commando;
	
	public Prototyp(){
		
	}	
	
	public Prototyp(String nameCommand){
		this.nameCommand=nameCommand;
	}
	
	/**
	 * Erstellt dem Namen entsprechendes Command-Object
	 * @return Referenz auf erzeugtes Objekt bzw null-Zeiger, wenn anderer als definierter name
	 */
	public Command createInstance(){
		if(this.nameCommand.equalsIgnoreCase("Direction"))
			commando =new Direction(0,"a",0);
		else if(nameCommand=="Gear")
			commando =new Gear(0,"a",0);
		else if(nameCommand=="Pause")
			commando = new Pause(0,0);
		else if(nameCommand=="Repetition")
			commando = new Repitition(0,0);
		else
			return null;
		return commando;
	}

	public void setNameCommand(String nameCommand) {
		this.nameCommand = nameCommand;
	}

	public String getNameCommand() {
		return nameCommand;
	}

	
	
}
