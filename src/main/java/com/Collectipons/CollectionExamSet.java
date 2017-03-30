package com.Collectipons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExamSet {

	public static void main(String[] args) {

		ArrayList<String> grades = new ArrayList<>();

		grades.add("90");
		grades.add("85");
		grades.add("70");

		Collections.sort(grades);

		String names[] = grades.toArray(new String[grades.size()]);

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		for (int i = 0; i < grades.size(); i++) {

			System.out.println(grades.get(i));

		}
		Collections.reverse(grades);

		for (int i = 0; i < grades.size(); i++) {
			System.out.println(grades.get(i));
		}

	}
	
	}