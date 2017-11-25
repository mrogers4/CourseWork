#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdio.h>


typedef struct {         //Creates node structure
    char titleOfBook[80]; //Title of book inside node
    char authorOfBook[80];//Author of book inside node
    int pagesOfBook;   //Pages of book inside node
    int checkedOutFlag; //0 means book is not checked out, 1 (true) means book is checked out
    struct theNodeStructType* theNextNode; //Single linked list, this is the link
} theNodeStructType;

int myListCreate();
int myListAdd();
int myListFill();
void myListPrint();
int myListCheckOutItem (char* inTitle[80]);
int myListDisplayBooksByAuthor (char* inAuthor[80]);