// Name: Rahim
// Surname: Rzayev
/* Description: An application has been provided for summing even numbers, odd numbers, or both, displaying the result on a JTextArea.
To use the application, enter numbers in the TextField using the "Add" button.
Clicking the "Sums" button computes the result, shown on the JTextArea.
For removing numbers or making changes, utilize the "Remove Integer" button.
The "List" button displays the added items on the JTextArea.
Additionally, the application allows adding strings separately using the "Add String" button and removing them with the "Remove String" button.Additionally, the application allows adding strings separately using the "Add String" button and removing them with the "Remove String" button.
A print function is also available. 
When entering both big and small numbers, the application prioritizes displaying the smallest number first.
The "Reset" button clears all added items and messages. 
Finally, use the "Exit" button to close the application.
*/
import java.util.*; //Import Java Utils

public class SumCalculator {    
    /*
    Function: sumCalculator
    Purpose:  This method calculates the sum of a array of numbers
    Parameters: ArrayList <Integer> inputSumNum represents a array of numbers     
    Return: Integer 
    */
    public static Integer sumCalculator(ArrayList <Integer> inputSumNum){ //creats a Integer method with an ArrayList <Integer> input
        int sum = 0; //sets sum int to 0
        for (Integer i: inputSumNum){ //creats a for loop to find the average of given arraylist of integers
            sum += i; // adds the i var numbers to the sum var
        }
        return sum;//return sum Integer
    }
    
    /*
    Function: findEvenCalculator
    Purpose:  This method calculates the even numbers of a array 
    Parameters: ArrayList <Integer> inputFindEven represents a array of numbers     
    Return: ArrayList <Integer> 
    */
    public static ArrayList <Integer> findEvenCalculator(ArrayList <Integer> inputFindEven){ //creats a ArrayList <Integer> method with ArrayList <Integer> input
        ArrayList <Integer> findEven = new ArrayList(); //creats a array to store the even numbers in
        for (int i=0; i < inputFindEven.size(); i++) { //creats a for loop of the array input
            if(inputFindEven.get(i)%2 == 0){ //finds all the even numbers by result of i%2 (if it = 0 the number is even)
                findEven.add(inputFindEven.get(i)); //adds inputFindEven.get(i) to the findEven Array
            }
        }
        return findEven; //returns findEven array
    }
    
    /*
    Function: findOddCalculator
    Purpose:  This method calculates the odd numbers of a array 
    Parameters: ArrayList <Integer> inputFindOdd represents a array of numbers     
    Return: ArrayList <Integer> 
    */
    public static ArrayList <Integer> findOddCalculator(ArrayList <Integer> inputFindOdd){ //creats a ArrayList <Integer> method with ArrayList <Integer> input
        ArrayList <Integer> findOdd = new ArrayList(); //creats a array to store the odd numbers in
        for (int i=0; i <inputFindOdd.size(); i++){ //creats a for loop of the array input
            if(inputFindOdd.get(i)%2 != 0){ //finds all the odd numbers by result of i%2 (if it != 0 the number is odd)
                findOdd.add(inputFindOdd.get(i)); //adds inputFindOdd.get(i) to the findOdd Array
            }
        }
        return findOdd;// returns findEven array
    }
    
    /*
    Function: sumEvenCalculator
    Purpose:  This method calculates the sum of even numbers in a array
    Parameters: ArrayList <Integer> inputSumEven represents a array of numbers     
    Return: Integer 
    */
    public static Integer sumEvenCalculator(ArrayList <Integer> inputSumEven){ //creats a Integer method with an ArrayList <Integer> input
        ArrayList <Integer> getEven = findEvenCalculator(inputSumEven); //passes inputSumEven array to findEvenCalculator method
        Integer getSum = sumCalculator(getEven); //passes getSum array to sumCalcuator method
        return getSum; //returns getSum Integer
    }
    
    /*
    Function: sumOddCalculator
    Purpose:  This method calculates the sum of odd numbers in a array
    Parameters: ArrayList <Integer> inputSumOdd represents a array of numbers     
    Return: Integer 
    */
    public static Integer sumOddCalculator(ArrayList <Integer> inputSumOdd){ //creats a Integer method with an ArrayList <Integer> input
        ArrayList <Integer> getOdd = findOddCalculator(inputSumOdd); //passes inputSumOdd array to findOddCalculator method
        Integer getSum = sumCalculator(getOdd); //passes getOdd to sumCalculator method
        return getSum; //returns getSum Integer
    }
}