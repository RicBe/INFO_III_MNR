package meinPackage;

import java.io.Serializable;

public abstract class Command implements Serializable {
	private String name;
	private int stepID;
	
	
	public Command(String name, int stepID){
		this.name=name;
		this.stepID=stepID;
	}
	
	public Command(String name){
		this.name=name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setStepID(int stepID) {
		this.stepID = stepID;
	}
	public int getStepID() {
		return stepID;
	}

/**
 * toString Überschreibung
 */
	public String toString() {
		return "Command [name=" + name + ", stepID=" + stepID + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Command other = (Command) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (stepID != other.stepID)
			return false;
		return true;
	}  
	
}
