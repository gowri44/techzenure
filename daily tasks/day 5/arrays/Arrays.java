package com.Techzenure.java.arrays;

public class Arrays {

	public static void main(String[] args) {
		int[] marks = {35,54,34,56,35,54};
		System.out.println(marks);
		System.out.println("no of subjects:"+marks.length);
		for(int i =0;i<marks.length;i++) {
			System.out.println("marks for sub -"+(i+1)+"="+marks[i]);
		}
		System.out.println();		
		System.out.print("marks obtained ---->");
		for(int mark : marks)
		{
			System.out.print(mark +"|");
		}
		System.out.print(mark);
		}
}

