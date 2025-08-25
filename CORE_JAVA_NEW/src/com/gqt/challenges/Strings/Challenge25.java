package com.gqt.challenges.Strings;

import java.util.Scanner;

public class Challenge25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  // consume newline

        String words[] = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        String f = words[0];
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        for (int j = 0; j < f.length(); j++) {
            char c = f.charAt(j);
            boolean tobreak = false;

            for (int i = 1; i < n; i++) {
                if (j >= words[i].length() || words[i].charAt(j) != c) {
                    tobreak = true;
                    break;
                }
            }

            if (tobreak) break;

            sb.append(c);
            cnt++;
        }

        System.out.println("The longest common prefix is " + sb + " of length " + cnt);
    }
}
