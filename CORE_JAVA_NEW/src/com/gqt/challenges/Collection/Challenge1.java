package com.gqt.challenges.Collection;

import java.util.ArrayList;

public class Challenge1 {
public static void main(String[] args) {
ArrayList<String> al = new ArrayList();
al.add("hema");
al.add("lahari");
al.add("hari");
System.out.println(al);
al.add("something");
System.out.println(al);
al.remove(al.size()-1);
for(String i : al) {
System.out.print(i +" ");	
}
}
}
