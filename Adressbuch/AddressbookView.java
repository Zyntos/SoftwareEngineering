package SEStuff;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTable;


public class AddressbookView extends JFrame{
	private Addressbook addressbook;
	private AddressbookAdapter addressbookadapter;
	
	public AddressbookView(Addressbook addressbook){
		this.addressbook = addressbook;
		addressbookadapter = new AddressbookAdapter(addressbook);
		createGui();
	}
	
	private void createGui(){
		// Hier Ihren Code ergänzen
		JTable table = new JTable(addressbookadapter);
		add(table);
		
		setSize(new Dimension(400, 300));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
