package meinPackage;

public class Pause extends Control{
	private int duration;
	
	
	public Pause(int duration, int stepID){
		super("Pause",stepID);
		this.setDuration(duration);
	}
	
	public Pause(String name){
		super(name);
	}
	

	public String toString() {
		return "Pause [duration=" + getDuration() + "]";
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pause other = (Pause) obj;
		if (getDuration() != other.getDuration())
			return false;
		return true;
	}

	
	public void setDuration(int duration) {
		this.duration = duration;
	}

	
	public int getDuration() {
		return duration;
	}

}
