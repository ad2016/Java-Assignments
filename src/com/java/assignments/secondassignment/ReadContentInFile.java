package com.java.assignments.secondassignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadContentInFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		int countNo = 0;
		String word = null;
		
		Scanner text = new Scanner (new File("src/Text.txt"));
	    while(text.hasNextLine())
	    {
	        word = text.nextLine();
	        for (int i = 0; i < word.length(); i++)
	        {
	            if (word.charAt(i) == 'a')
	            {
	                countNo++;
	            }
	        }

	    }

	    System.out.print(countNo);


	}

}
