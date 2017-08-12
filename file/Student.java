package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		File f1 = new File("Student.txt");
		FileWriter out = new FileWriter(f1);
		System.out.println("enter the no. of students : ");
		int n = sc.nextInt();
		out.write("******STUDENT DETAILS******");
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter student no.: " + i);
			System.out.println("Enter student Roll-no.: ");
			out.write("\nStudent no: " + i);
			int r = sc.nextInt();
			System.out.println("Student name: ");
			String b = sc.next();
			out.write("\nStudent name : " + b);
			System.out.println("Enter the no. of subjects : ");
			int x = sc.nextInt();
			for (int j = 1; j <= x; j++) {
				System.out.println("Enter the subject " + j + " marks : ");
				int y = sc.nextInt();
				out.write("\nSubject " + j + " marks :" + y);
			}
			out.write("\nRoll no : " + r);
			out.write("\n**************************\n");
		}
		System.out.println("Registration Successfull...");
		out.flush();
		out.close();
		sc.close();
	}

}