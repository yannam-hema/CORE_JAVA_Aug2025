package com.gqt.challenges.Interface;
interface encryptable1{
	void encrypt();
}
interface decryptable1{
	void decrypt();
}
class encrptionAlgo implements encryptable1{
	@Override
	public void encrypt() {
	 System.out.println("encrypted");
	}
}
class decryptionAlgo implements decryptable{
	@Override
	public void decrypt() {
		System.out.println("decrypted");
	}
}
public class Challenge25 {
public static void main(String[] args) {
encrptionAlgo e =  new encrptionAlgo();
e.encrypt();
decryptionAlgo d = new decryptionAlgo();
d.decrypt();
}
}
