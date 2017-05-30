package Sestuzff;

import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;


public class EncryptionUI extends JFrame{
	private Encryptor encryptor = null;
	private Context context = new Context();
	private JButton encryptb = new JButton("Encrypt");
	private JButton decryptb = new JButton("Decrypt");
	private JTextArea textArea = new JTextArea("hi");
	private JTextArea textArea2 = new JTextArea("");
	private JPanel panel = new JPanel();
	 
	public EncryptionUI(){
		 panel.setLayout(new FlowLayout());
		 Box box = Box.createVerticalBox();
		 add(box);
		 textArea2.setBorder(new TitledBorder("Encrypted")); 
		 textArea.setBorder(new TitledBorder("Original")); 
		 box.add(textArea); 
		 box.add(textArea2);
		 panel.add(encryptb);
		 panel.add(decryptb);
		 box.add(panel);
		 
		 context.setEncryptionStrategy(new ReverseEnc());
		 
		 encryptb.addActionListener(e->textArea2.setText((context.encrypt(textArea.getText()))));
		 decryptb.addActionListener(e->textArea.setText((context.encrypt(textArea2.getText()))));
		 setSize(300,300);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setVisible(true);

		 
	 }
	
	 
	 public JButton getButton1(){
		 return encryptb;
	 }
	 public JButton getButton2(){
		 return decryptb;
	 }
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			EncryptionUI enUi = new EncryptionUI();

			
			
		}
	
	 }