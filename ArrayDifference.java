/* ---------------------------------------------------------------------------
** Class: 	CSC 262
** Assignment: Discussion 3
** File: 	ArrayDifference.java
** Description: Array vs. Array Lists
**
** Author: 	Dillian England
** Date: 	Dec 11th, 2025
** -------------------------------------------------------------------------*/

import java.util.ArrayList;

public class ArrayDifference
{
    public static void main(String[] args)
    {
        // Array Example
        int[] numbersArray = {10, 20, 30, 40, 50};
        System.out.println("Array elements:");
        for (int num : numbersArray)
        {
            System.out.println(num);
        }
        // Arrays have fixed size, cannot add/remove elements dynamically

        // ArrayList Example
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);
        numbersList.add(50);
        numbersList.add(60); 

        System.out.println("\nArrayList elements:");
        for (int num : numbersList)
        {
            System.out.println(num);
        }
        // Can add more elements dynamically

        // Removing element
        numbersList.remove(2); // Removes the element at index 2
        System.out.println("\nArrayList after removing element at index 2:");
        System.out.println(numbersList);
    }
}