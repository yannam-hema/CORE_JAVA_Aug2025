package com.gqt.challenges.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Challenge5 {
public static void main(String[] args) {
	HashMap<String, Integer> hp = new HashMap<>();
	hp.put("java",1);
	hp.put("c++",1);
	hp.put("java", hp.getOrDefault("java", 0)+1);
	hp.put("js", 1);
	System.out.println(hp);
	System.out.print("After deletion");
	hp.remove("c++");
	System.out.println(hp);
	System.out.println("Iterating");
	for (Map.Entry<String, Integer> entry : hp.entrySet()) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }
}
}
