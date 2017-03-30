package com.Collectipons;

import java.util.ArrayList;
import java.util.List;

public class TestArray {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("DEF");
		
		Object[] s = list.toArray();
		String[] S1 = new String[list.size()];
		String[] S2 = new String[list.size()];
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] instanceof String) {
				String temp = (String) s[i];
				
			}
			
		}
		
	}
}
