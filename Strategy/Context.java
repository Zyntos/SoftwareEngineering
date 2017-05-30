package Sestuzff;

public class Context {
	private Encryptor enc;
	
	public void setEncryptionStrategy(Encryptor enc){
		this.enc=enc;
	}
	public String encrypt(String code){
		
		return enc.encrypt(code);
	}
	
}
