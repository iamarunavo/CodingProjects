// Arunavo Chowdhury
// Lab Section 22B
import java.awt.*;
import javax.swing.*;

public class Project1 {
	public static void main(String[] args) {
		
		/* create a string array to store the roman numerals,
		 * an int array to store the roman numerals integer values, 
		   then read the roman numerals from the file and store */
		String romanArray[] = new String[90]; 
		int number[] = new int[90]; 
		int numOfStrings = readFromFile(romanArray); 
		
		// create JFrame, container, and 2 textarea
		JFrame frame = (JFrame) RomanNumeralGUI.createAndShowGUI(); 
		Container myContentPane = frame.getContentPane();
		TextArea myTextArea = new TextArea();
		TextArea mySecondTextArea = new TextArea();
		
		// make the text areas read only
		myContentPane.add(myTextArea);
		myContentPane.add(mySecondTextArea);
		
		myTextArea.setEditable(false);
        mySecondTextArea.setEditable(false);
        
        // loop through the array to convert and distribute the roman numerals and their integer values in the textarea
		for (int i = 0; i < numOfStrings; i++) {
			int num = convertRomanToInt(romanArray[i]);
			myTextArea.append(romanArray[i] + "\n");
			mySecondTextArea.append(num + "\n");
		}

	}

	private static int readFromFile(String[] strs) {
		
		// reads input from text file named input.txt
		// initialize string to read lines later on
		// initialize int with a value 0 to increment later on

		TextFileInput in = new TextFileInput("input.txt");
		String line = in.readLine();
		int index = 0;
		
		
		// while loop to split lines with commas as long as the line is not null
		// increments index in order to obtain the amount of strings after the split
		while (line != null) {
		    String[] splitLine = line.split(",");
		    if (splitLine.length != 0) {
		        for (int i = 0; i < splitLine.length; i++) {
		            strs[index] = splitLine[i];
		            index++;
		        }
		    }
		    line = in.readLine(); 
		}
		line = in.readLine();
		return index;

	}
	
	
	private static int convertRomanToInt(String romanString) {
		// create a int to store the integer version of a roman numeral
		int answer = 0;
		
		// an int to store the previous roman numeral letter value  
		int previous = 0;
		
		//go through the array starting from the end
		for (int i = romanString.length() - 1; i >= 0; i--) {
	        int current = 0;
	        char c = romanString.charAt(i);
	        switch (c) {
	            case 'I':
	                current = 1;
	                break;
	            case 'V':
	                current = 5;
	                break;
	            case 'X':
	                current = 10;
	                break;
	            case 'L':
	                current = 50;
	                break;
	            case 'C':
	                current = 100;
	                break;
	            case 'D':
	                current = 500;
	                break;
	            case 'M':
	                current = 1000;
	                break;
	        }
	        // to subtract the current value from the answer if it is less than the previous value
	        // if it isn't add it to the answer
	        if (current < previous) {
	            answer -= current;
	        } else {
	            answer += current;
	        }
	        previous = current;
	    }
		return answer;
	}
}
