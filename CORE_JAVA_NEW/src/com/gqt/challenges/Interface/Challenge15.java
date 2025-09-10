package com.gqt.challenges.Interface;
interface encryptable{
	void encrypt();
}
interface decryptable{
	void decrypt();
}
class encoder implements encryptable , decryptable{
	@Override
	public void encrypt() {
	 System.out.println("in encoder : encrypted");
	}@Override
	public void decrypt() {
		System.out.println("in encoder : decrypted");
	}
}
class decoder implements encryptable , decryptable{
	@Override
	public void encrypt() {
	 System.out.println("in decoder : encrypted");
	}@Override
	public void decrypt() {
		System.out.println("in decoder : decrypted");
	}
}
public class Challenge15 {
public static void main(String[] args) {
encoder e = new encoder();
e.encrypt();
e.decrypt();
decoder d = new decoder();
d.encrypt();
d.decrypt();
}
}
