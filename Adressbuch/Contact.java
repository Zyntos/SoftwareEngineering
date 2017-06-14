package SEStuff;


public class Contact {
	private String name;
	private String address;
	private String phone;
	public Contact(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", address=" + address + ", phone="
				+ phone + "]";
	}
	public Object getAddress() {
		return address;
	}
	public Object getPhone() {
		return phone;
	}
	

}
