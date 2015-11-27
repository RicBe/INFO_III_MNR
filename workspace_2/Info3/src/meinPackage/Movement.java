package meinPackage;

public abstract class Movement extends Command {
	private String hwAddress;
	
	public Movement(String hwAddress,String name,int stepID){
		super(name, stepID);
		this.hwAddress=hwAddress;
	}
	
	public Movement(String name){
		super(name);
	}

	public void setHwAddress(String hwAddress) {
		this.hwAddress = hwAddress;
	}

	public String getHwAddress() {
		return hwAddress;
	}

	public String toString() {
		return "Movement [hwAddress=" + hwAddress + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movement other = (Movement) obj;
		if (hwAddress == null) {
			if (other.hwAddress != null)
				return false;
		} else if (!hwAddress.equals(other.hwAddress))
			return false;
		return true;
	}
	
}
