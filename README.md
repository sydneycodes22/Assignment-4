Assignment 4 Problems

Problem 1: Character Counter
Design a program that asks the user for a file name and prints the number of characters, words, and lines in that file.
Extra requirement:
•	Your program must use exception to handle the situation when the file entered by the user cannot be found. 
•	The counting of characters, words, and lines must be implemented as separate functions:
o	countCharacters
o	countWords
o	countLines
•	Use the following sample file for testing: hw4p1test.txt

Problem 2: Exception Handler
In chapter 7, we studied the demonstration code DataAnalyzer.java (on page 361). Modify the DataAnalyzer.java program so that you do not call hasNextInt or hasNextDouble. Simply have nextInt and nextDouble throw a NoSuchElementException and catch it in the main method. 
Requirement: Please create three input files with the following contents and use these files to test your exception handler:
input1.txt, input2.txt, input3.txt