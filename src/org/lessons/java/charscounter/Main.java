package org.lessons.java.charscounter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
public static void main(String[] args) {
	Scanner in =  new Scanner(System.in);
	System.out.println("Inserisci un parola:");
	String word=in.nextLine();
	
	Set<Character> uniqueChar = new HashSet<>();
	Map<Character, Integer> charts=new HashMap<>();
	for(char c : word.toLowerCase().toCharArray()) {
		uniqueChar.add(c);
		charts.put(c,charts.getOrDefault(c,0)+1);
	}
	System.out.println("Occorenza carattri:");
	for(char c :uniqueChar) {
		System.out.println(c + ":" + charts.get(c));
	}
}
}
