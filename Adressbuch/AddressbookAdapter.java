package SEStuff;
import javax.swing.table.*;

public class AddressbookAdapter extends AbstractTableModel{
	private Addressbook addressbook;
	public AddressbookAdapter(Addressbook addressbook){
		this.addressbook=addressbook;
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 3;
	}
	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		Object tmp = null;
		if(0==arg1){
			tmp= addressbook.get(arg0).getName();
		}
		else if(1==arg1){
			tmp=  addressbook.get(arg0).getAddress();
		}
		else if(2==arg1){
			tmp=  addressbook.get(arg0).getPhone();
		}
		return tmp;
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return addressbook.getSize();
	}
	

}
