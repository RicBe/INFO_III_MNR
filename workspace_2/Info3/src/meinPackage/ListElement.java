package meinPackage;

/**
 * 
 * @author wuestema
 * Objekt, das ein Command-Object und einen Zeiger auf ein nächstes ListElement enthält
 */
public class ListElement {
	private Command commando;
	private ListElement nextElement;
	
	
	ListElement(Command commando){
		this.commando=commando;
		nextElement=null;
	}
	
	public ListElement getNextElement(){
		return nextElement;
	}
	
		public void setNextElement(ListElement nextElement){
		this.nextElement=nextElement;
	}
	
	
	public Command getCommand(){
		Command c1= commando;
		return c1;
	}

	

	

	
	
	
	
	
	
}
