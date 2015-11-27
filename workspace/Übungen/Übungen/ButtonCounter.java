import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ButtonCounter extends JFrame{
	private JButton button = new JButton();
	
	public ButtonCounter(){
		super("Beispiel anonyme Klasse");
		
		button.addActionListener(new ActionListener(){
			private int counter=0;
			public void	actionPerformed(ActionEvent anEvent){
				++counter;
				button.setText(counter + "x gedrückt");
			}
		});
		add(button);
	}
}
