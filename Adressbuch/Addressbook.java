package SEStuff;

import java.util.ArrayList;


public class Addressbook {
	private ArrayList<Contact> contacts;
	public Addressbook(){
		contacts = new ArrayList<Contact>();
	}
	public void add(String name, String address, String phone){
		contacts.add(new Contact(name, address, phone));
	}
	public void remove(String name){
		Contact found = find(name);
		if (found != null){
			contacts.remove(found);
		}
	}
	private Contact find(String name){
		for(Contact contact: contacts){
			if (contact.getName().equals(name)){
				return contact;
			}
		}
		return null;
	}
	public int getSize(){
		return contacts.size();
	}
	public Contact get(int index){
		return contacts.get(index);
	}
}
