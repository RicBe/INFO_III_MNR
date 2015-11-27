package meinPackage;

public abstract class Control extends Command {
	
	
	public Control(String name,int stepID){
		super(name,stepID);
	}
	
	public Control(String name){
		super(name);
	}
	

	public String toString() {
		return "Control []";
	}
	
}
