package org.example.utility;

import java.util.Scanner;

public class InputUtility {

    public static String askString(String sentence){
        System.out.println(sentence);
        return new Scanner(System.in).nextLine();

    }
    public static Integer askInt(String sentence){
        System.out.println(sentence);
        return new Scanner(System.in).nextInt();

    }
}
