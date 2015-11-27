package meinPackage;
import java.util.Vector;

/**
 * Zentralverwaltung welche die beiden Listen prototypen und controlprocess
 * @author wuestema
 *
 */
public class ABC {
	private Vector prototypen;
	private Vector controlprocess;
	
	
	
	/**
	 * 
	 */
	public void createPrototypen(){
		prototypen.addElement(new Prototyp("Direction"));
		prototypen.addElement(new Prototyp("Gear"));
		prototypen.addElement(new Prototyp("Pause"));
		prototypen.addElement(new Prototyp("Repitition"));
	}
	
	public void addStep(Prototyp prototyp){
		controlprocess.addElement(prototyp.createInstance());
	}
	
	public void removeStep(int id){
		controlprocess.remove(id);
	}
	
	
		
		
	
	
	
	
}
