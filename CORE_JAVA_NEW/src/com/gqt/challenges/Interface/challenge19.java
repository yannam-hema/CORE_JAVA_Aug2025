package com.gqt.challenges.Interface;
interface  playable{
	void play();
}
interface recorable{
	void record();
}
class player implements playable{
	@Override
	public void play() {
     System.out.println("Playing ...");
	}
}
class recorder implements recorable{
	@Override
	public void record() {
     System.out.println("recording ...");
	}
}
public class challenge19 {
public static void main(String[] args) {
	player p = new player();
	p.play();
	recorable r = new recorder();
	r.record();
}
}
