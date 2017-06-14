package SEStuff;


public class Main {
	public static void main(String[] args){
		Addressbook addressbook = new Addressbook();
		AddressbookView addressbookView = new AddressbookView(addressbook);
		addressbook.add("Alice", "Hamburg", "040 12345");
		addressbook.add("Bob", "Berlin", "030 7891234");
		addressbook.add("Carl", "Köln", "0221 452344");
		
	}
}
