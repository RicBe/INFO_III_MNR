package meinPackage;

public class ListElement {
	private Command commando;
	private ListElement nextElement;
	int pos;
	
	public ListElement getNextElement(){
		return nextElement;
	}
	
	public void setNextElement(ListElement nextElement){
		this.nextElement=nextElement;
	}
	
	public ListElement(Command commando){
		this.commando=commando;
		nextElement=null;
	}
	
	
	
	
	
}
