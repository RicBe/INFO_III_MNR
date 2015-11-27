package meinPackage;
import java.util.Iterator;
import java.util.Properties;
import java.util.Vector;

/**
 * 
 * @author wuestema
 * Diese Klasse erstellt eine verkettete Liste von ListElement-Elementen 
 */
public class ControlModel implements Interface{
	private ListElement startList = null;
	private ListElement hilfList;
	private Vector prototypen;
	
	/**
	 * F�gt der Liste ein Command am Ende an
	 * @param prototyp-Object welches der Liste angeh�ngt werden soll
	 */
	public void addStep(Prototyp prototyp){
		if(startList==null){
			startList=new ListElement(prototyp.createInstance());
		}
		else{
			ListElement newElement= new ListElement(prototyp.createInstance());
			ListElement lastElement=getLastElement();
			lastElement.setNextElement(newElement);
		}	
	}
	
	public void addStep(Command kommando){
		if(startList==null){
			startList=new ListElement(kommando);
		}
		else{
			ListElement newElement= new ListElement(kommando);
			ListElement lastElement=getLastElement();
			lastElement.setNextElement(newElement);
		}	
		this.durchz�hlen();
	}
	
	/**
	 * Hilfsfunktion, die Referenz auf das letzte Element der Liste zur�ckgibt
	 * @return Referenz auf letztes ListElement
	 */
	public ListElement getLastElement(){
		ListElement last = startList;
			while(last.getNextElement()!=null){
				last=last.getNextElement();
			}
		return last;
	}
	
	/**
	 * Entfernt ein Element aus der Liste
	 * @param pos liefert die Position(=stepID) des Elements, das entfernt werden soll
	 */
	public void removeStep(int pos){
		hilfList=startList;
		int i=1;
		if(pos==1){
			startList=startList.getNextElement();
		}
		else if(hilfList!=null){
			for(; (i<(pos-1))&&(hilfList.getNextElement()!=null); i++){
				hilfList=hilfList.getNextElement();
			}
			if(i==(pos-1)){
				hilfList.setNextElement(hilfList.getNextElement().getNextElement());
				
			}
		}
		this.durchz�hlen();
	}
	
	/**
	 * Gibt die Elemente (Commands) der Liste der Reihenfolge nach aus
	 */
	public void showList(){
		hilfList=startList;
		/*while(hilfList!=null){
			System.out.println(hilfList.getCommand());
			hilfList=hilfList.getNextElement();
			*/
		for (;hilfList!=null; hilfList=hilfList.getNextElement()){
			System.out.println(hilfList.getCommand());
		}
	}
	
	/**
	 * kleine HIlfsfunktion zum �berpr�fen ob StepIDs richtig gesetzt werden
	*/
	public void showIDs(){
		hilfList=startList;
		while(hilfList!=null){
			System.out.println("stepID: " + hilfList.getCommand().getStepID());
			hilfList=hilfList.getNextElement();
		}
	}
	
	
	/**
	 * Ermittelt aus der Liste bestimmtes Command
	 * @param 	pos ist die Position des Element, was zur�ckgeliefert werden soll
	 * @return 	Referenz auf das angeforderte Element. Falls dieses nicht enthalten ist: null-Zeiger
	 */
	public ListElement get(int pos){
		hilfList=startList;
		/**
		 * Abbruchbedingung
		 */
		boolean error=false;
		if(hilfList==null)
			error=true;
		else{
			for(int i=1;i<pos;i++){
				if((hilfList.getNextElement()!=null)){
					hilfList=hilfList.getNextElement();
				}
				else{
					i=pos;
					error=true;
				}
			}
		}
		if(error==false){
			System.out.println("Element " + hilfList.getCommand() +" erfolgreich referenziert");
			return hilfList;
		}
		else{
			System.out.println("Element nicht enthalten");
			return null;
		}			
	}
	
	/**
	 * Verschiebt das Command um eine Position nach oben/vorne
	 * @param elementUp Referenz auf Command in der Klasse, welches nach oben verschoben werden soll
	 */
	public void incOrder(ListElement elementUp){
		/**
		 * zeiger vom vorherigem Element wird �ber hilf 2 auf hinteres Element gestellt
		 * zeiger von elementUp wird auf vorheriges umgestellt
		 * zeiger vom Objekt 2 Stellen vorher wird auf elementUp gestellt(mit sonderfall dass vorheriges Element startList ist)
		 */
		if(elementUp!=startList)
		{
			ListElement hilf2 =elementUp.getNextElement();
			hilfList=startList;
			while(hilfList.getNextElement()!=elementUp){
				hilfList=hilfList.getNextElement();
			}
			hilfList.setNextElement(hilf2);
			elementUp.setNextElement(hilfList);
			hilf2=startList;
			if(hilfList==hilf2){
				startList=elementUp;
			}
			else{
				while(hilf2.getNextElement()!=hilfList){
				hilf2=hilf2.getNextElement();
				}
				hilf2.setNextElement(elementUp);
			}
		}
		else
			System.out.println("Ist Listenanfang");
		this.durchz�hlen();
	}
	
	/**
	 * Verschiebt das Command um eine Position nach unten/vorne
	 * @param elementDown	Referenz auf das Command in der Liste, welches nach unten/hinten verschoben werden soll
	 */
	public void decOrder(ListElement elementDown){
		hilfList=startList;
		if(elementDown!=this.getLastElement()){
			if(hilfList==elementDown){
				startList=elementDown.getNextElement();
				elementDown.setNextElement(startList.getNextElement());
				startList.setNextElement(elementDown);
			}
			else{
				while(hilfList.getNextElement()!=elementDown){
					hilfList=hilfList.getNextElement();
				}
				hilfList.setNextElement(elementDown.getNextElement());
				elementDown.setNextElement(elementDown.getNextElement().getNextElement());
				hilfList.getNextElement().setNextElement(elementDown);
			}
		}
		else{
			System.out.println("Ist bereits letztes Element");
		}
		this.durchz�hlen();
	}
	
	/**
	 * nummeriert StepIDs der Liste an Kommandos durch
	 */
	public void durchz�hlen(){
		hilfList=startList;
		for(int i=1; hilfList.getNextElement()!=null; i++){
			hilfList.getCommand().setStepID(i);
			hilfList=hilfList.getNextElement();
		}
	}
	
	/**
	 * Bef�llt den Vektor "prototypen" mit allen Prototyp-Objekten
	 */
	public void createPrototypen(){
		prototypen.addElement(new Prototyp("Direction"));
		prototypen.addElement(new Prototyp("Gear"));
		prototypen.addElement(new Prototyp("Pause"));
		prototypen.addElement(new Prototyp("Repitition"));
	}

	/*public Properties laden(String verzeichnis) {
		
	}

	public void speichern(Properties daten, String verzeichnis) {
		properties.put();
	}*/
	
	
}
