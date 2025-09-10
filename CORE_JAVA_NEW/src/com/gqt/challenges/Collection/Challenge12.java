package com.gqt.challenges.Collection;

import java.util.EnumSet;

public class Challenge12 {
	enum State {
	    ANDHRA, TELANGANA, TAMILNADU, KARNATAKA, MAHARASHTRA,
	    PUNJAB, GUJARAT, JAMMU, CHANDIGARH,
	    ARUNACHALPRADESH, SIKKIM, NAGALAND
	}

    public static void main(String[] args) {
        EnumSet<State> southStates = EnumSet.of(
            State.ANDHRA, State.TELANGANA, State.TAMILNADU, State.KARNATAKA, State.MAHARASHTRA
        );
        EnumSet<State> northStates = EnumSet.of(
            State.PUNJAB, State.GUJARAT, State.JAMMU, State.CHANDIGARH
        );
        EnumSet<State> eastStates = EnumSet.of(
            State.ARUNACHALPRADESH, State.SIKKIM, State.NAGALAND
        );
        System.out.println("South States: " + southStates);
        System.out.println("North States: " + northStates);
        System.out.println("East States: " + eastStates);
        
        southStates.remove(State.MAHARASHTRA);

        System.out.println("Iterating South States:");
        for (State s : southStates) {
            System.out.println(s);
        }
    }
}
