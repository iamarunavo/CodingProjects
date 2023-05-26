
// Arunavo Chowdhury
// Lab Section 22B


import javax.swing.JOptionPane; 

public class Project0 {
    public static void main(String[] args){ 

        String sentence;
    
        //this while loops encases most of the code and allows to user to provide input multiple times without running the code over and again
        while (true){ 
        
        //here I use the JOptionPane class that I imported in the beginning and I am using the showInputDialog to make a popup that asks the user for the input rather than asking the user in the terminal
            sentence = JOptionPane.showInputDialog("Please enter a sentence: ");

            int uppercase = 0; //initializes the counter for uppercase e and gives it a value of 0 as it can't start from nothing
            int lowercase = 0; // initializes the counter for lowercase e and gives it a value of 0 as it can't start from nothing

        //this if condition checks if what the user enters is equal to the word stop and ignores the combination of uppercase or lowercase letters it is, and if it is then programs stops and popup disappears
        if (sentence.equalsIgnoreCase("STOP")){ 
            break;
            }

        for (int i = 0; i < sentence.length(); i++){ //for loop to go through each index of the string the user enters and check if any of the indexes are equal to either a lowercase e or uppercase and if they are then the corresponding counter will increment
            
            if (sentence.charAt(i) == 'E'){
            uppercase++;
            }
            if (sentence.charAt(i) == 'e'){
            lowercase++;
            }

        }

        JOptionPane.showMessageDialog(null,"Number of lowercase e's: " +  lowercase + "\n" + "Number of uppercase e's: " + uppercase); //a popout that shows the user how many lowercase e's and uppercase e's the sentence they entered has 
       
        }
    }
}
