package com.gqt.challenges.Interface;

interface serializable{
	void serialize();
}
interface deserializable{
	void deserialize();
}
class file implements serializable,deserializable{
	@Override
	public void serialize() {
    System.out.println("file is serialized");
	}@Override
	public void deserialize() {
     System.out.println("file is deserialized");
	}
}
class database implements serializable,deserializable{
	@Override
	public void serialize() {
    System.out.println("database is serialized");
	}@Override
	public void deserialize() {
     System.out.println("database is deserialized");
	}
}
public class Challenge13 {
public static void main(String[] args) {
	file f = new file();
	f.serialize();
	f.deserialize();
	database db = new database();
	db.serialize();
	db.deserialize();
}
}
