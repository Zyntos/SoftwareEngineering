package Sestuzff;

public class ReverseEnc implements Encryptor{
	private char temp;
	@Override
	public String encrypt(String code){
		char[] ch =  code.toCharArray();

	for(int i=0;i< ch.length/2;i++){
		temp=ch[i];
		
		ch[i]=ch[ch.length-1-i];
		ch[ch.length-1-i]=temp;
		}
	String text = String.valueOf(ch);
	System.out.println(text);
	return text;
	}

	
}