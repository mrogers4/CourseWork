Quick Start:
To Build: Run make
To Run: Execute at command line "./main"

Details:
Wrote a C program that implements a Linked List of strings that will be read from a file. It will display a menu that resembles the following: 
1. Display Library
2. Check Out Item
3. Query for Author
4. Exit
The first step was that I had it read in the entire library from the provided file (called library.txt). I used this file to create and populate my Linked List. Then, I had it depend on the users program and have its respond appropriately. So, if the user wishes to view the contents of the library, my program will iterate over the list and display each item. If they choose to check out a book from the library, my program will check if the book exists, and if so, remove it from the list and return it to the user. Finally, if the user chooses to query for an author, my program will return all the books found by that author. My program will build the library in sorted order based on author name. So each time a book is added, I have iterated over the list to put the book in the correct place.
