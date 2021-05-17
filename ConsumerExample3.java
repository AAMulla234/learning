package com.akhtar.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsumerExample3 consumerExample3 = new ConsumerExample3();

		Predicate<Stud> p = student -> student.getMarks() > 80;
		Function<Stud, String> f = student -> {
			int marks = student.getMarks();
			if (marks > 80) {
				return "A";
			} else if (marks > 70) {
				return "B";
			} else if (marks > 60) {
				return "C";
			} else {
				return "E";
			}
		};

		// Internally invoking Function interface
        Consumer<Stud> c1 = student -> {
               System.out.println("Name: " + student.getName());
               System.out.println("Marks: " + student.getMarks());
               System.out.println("Grade: " + f.apply(student));
               System.out.println("================================");
        };
        
        List<Stud> students = consumerExample3.populateStudentList();
        for (Stud stud : students) {
               if (p.test(stud)) {
                      c1.accept(stud);
               }
        }

	}

	public List<Stud> populateStudentList() {
		List<Stud> studentList = Arrays.asList(new Stud("Abdul", 31, 60),
				new Stud("Waheed", 29, 90), new Stud("DummyUser", 20, 80),
				new Stud("Adam", 25, 47));
		return studentList;
	}

}
