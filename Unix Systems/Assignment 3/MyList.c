#include "MyList.h"

static theNodeStructType* theListHead = NULL;

int myListCreate()
{
    theListHead = NULL;
    printf("List Created\n");
    return 0;
}

int myListFill()
{
    FILE* infile;
    infile = fopen("library.txt", "r");
    const char s[10] = ",";

    char theCurrentTitle[80];
    char theCurrentAuthor[80];
    int theCurrentPages;

    char* token;  
    int i;
    int lineCount = 0;
    if(infile != NULL) { //if file is open
        char line[80];  //Gives us a blank array size of 80
        while(fgets(line, sizeof (line), infile) != NULL) { 
            // Add is done below, after we read the values from each line
            lineCount++;
            token = strtok(line, s);
            for(i = 0; i < 3; i++) {
                switch(i) {
                case 0:
                    strcpy(theCurrentTitle, token);  //Saves that token into theCurrentTitle
                    break;

                case 1:
                    strcpy(theCurrentAuthor, token);  //Saves that token into theCurrentAuthor
                    break;

                case 2:
                    theCurrentPages = atoi(token);  //Saves that token into theCurrentPages
                    break;

                default:
                    printf("There is an error \n");
                }
                token = strtok(NULL, s);  //Calls the first token NULL to be able to get to the next token
            }
            // Add a new node to the list with the values read from the current line(record) of the file
            // printf ("%s - %s - %d\n",theCurrentTitle,theCurrentAuthor,theCurrentPages);
            myListAdd(theCurrentTitle, theCurrentAuthor, theCurrentPages);  //Saves theCurrentTitle, theCurrentAuthor & theCurrentPages 
                                                                            //into the myListAdd function while also ordering them
        }
        fclose(infile);
    }

    /*("test title", "tony",  99);
    myListAdd("test title", "steve",  99);
    myListAdd("test title", "zach", 99);
    myListAdd("test title", "ursila", 99);*/
    return 0;
}
int myListDisplayBooksByAuthor (char* inAuthor[80]) {
    theNodeStructType *theCurrentNode = theListHead;
    
    while (theCurrentNode != NULL) {
        if (theCurrentNode->checkedOutFlag == 0) {
            if (strcasecmp(theCurrentNode->authorOfBook, inAuthor) == 0) {
                printf("Author: %s\nTitle: %s\nPages: %d\n\n", theCurrentNode->authorOfBook, theCurrentNode->titleOfBook, theCurrentNode->pagesOfBook);
            }
        }
        theCurrentNode = theCurrentNode->theNextNode;
    }
}

int myListCheckOutItem (char* inTitle[80]) {
    theNodeStructType *theCurrentNode = theListHead;
    
    while (theCurrentNode != NULL) {
        if (theCurrentNode->checkedOutFlag == 0) {
            if (strcasecmp(theCurrentNode->titleOfBook, inTitle) == 0) {
                printf("Checking out:\nAuthor: %s\nTitle: %s\nPages: %d\n\n", theCurrentNode->authorOfBook, theCurrentNode->titleOfBook, theCurrentNode->pagesOfBook);
                theCurrentNode->checkedOutFlag = 1;
            }
        }
        theCurrentNode = theCurrentNode->theNextNode;
    }
}

void myListPrint() {
    theNodeStructType* theCurrentNode = theListHead;
    
    while (theCurrentNode != NULL) {
        if (theCurrentNode->checkedOutFlag == 0) {
            printf("Author: %s\nTitle: %s\nPages: %d\n\n", theCurrentNode->authorOfBook, theCurrentNode->titleOfBook, theCurrentNode->pagesOfBook);
        }
        theCurrentNode = theCurrentNode->theNextNode;
    }
}

int myListAdd(char* inTitleOfBook, char* inAuthorOfBook, int inPagesOfBook)
{
    // This section, creates and fills the new node
    theNodeStructType* theNewNode;
    theNewNode = malloc(sizeof(theNodeStructType));
    strcpy(theNewNode->titleOfBook, inTitleOfBook);
    strcpy(theNewNode->authorOfBook, inAuthorOfBook);
    theNewNode->pagesOfBook = inPagesOfBook;
    theNewNode->checkedOutFlag = 0;
    theNewNode->theNextNode = NULL;

    // myListPrint();
    // Empty list case
    theNodeStructType* theCurrentNode = theListHead;  //theCurrentNode is a pointer and does the same thing that theListHead is pointing to
    if(theListHead == NULL) { // Easy case, just add
        theListHead = theNewNode;
        theNewNode->theNextNode = NULL;

        // New List head case
    } else if(strcmp(theNewNode->authorOfBook, theListHead->authorOfBook) < 0) {
        theNewNode->theNextNode = theListHead;
        theListHead = theNewNode;
        // At end of list
    } else {
        int bDone = 0;
        while(bDone == 0) { 
            if(strcmp(theNewNode->authorOfBook, theCurrentNode->authorOfBook) >= 0) { //Comparing author&book with the top author&book
                if(theCurrentNode->theNextNode == NULL) {  //If the the node next to the current/listhead author&book is empty, go in this statement
                    theCurrentNode->theNextNode = theNewNode;  //Placing the author&book after the listhead author&book
                    theNewNode = NULL; 
                    bDone = 1;
                } else {
                    theNodeStructType* theTempNode;
                    theTempNode = theCurrentNode->theNextNode;
                    if(strcmp(theNewNode->authorOfBook, theTempNode->authorOfBook) > 0) {
                        theCurrentNode = theCurrentNode->theNextNode;
                    } else {
                        theNewNode->theNextNode = theCurrentNode->theNextNode;
                        theCurrentNode->theNextNode = theNewNode;
                        bDone = 1;
                    }
                }
            } else {
                printf("error??? \n");
            }
        }
    }
    //myListPrint();
    return 1;
}
