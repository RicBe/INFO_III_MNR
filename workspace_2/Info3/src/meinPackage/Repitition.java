package meinPackage;

public class Repitition extends Control{
	private int jumpAddress;
	private int nrRepititions;
	
	/**
	 * Konstruktor
	 * @param jumpAddress 	
	 * @param stepID		
	 */
	public Repitition(int jumpAddress, int stepID){
		super("Repitition", stepID);
		this.jumpAddress=jumpAddress;		
	}
	
	public Repitition(String name){
		super(name);
	}
	
	
	public void setJumpAddress(int jumpAddress) {
		this.jumpAddress = jumpAddress;
	}
	public int getJumpAddress() {
		return jumpAddress;
	}
	
	public void setNrRepititions(int nrRepititions) {
		this.nrRepititions = nrRepititions;
	}
	public int getNrRepititions() {
		return nrRepititions;
	}

	public String toString() {
		return "Repitition [jumpAddress=" + jumpAddress + ", nrRepititions="
				+ nrRepititions + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Repitition other = (Repitition) obj;
		if (jumpAddress != other.jumpAddress)
			return false;
		if (nrRepititions != other.nrRepititions)
			return false;
		return true;
	}
	
	
}
