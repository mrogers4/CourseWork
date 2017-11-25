#include <stdio.h>

#include "MyList.h"

char inTitle[80];
char inAuthor[80];
char ch;
int theUserInLibraryInput = -1;
void prompt(int);

int main()
{
    myListCreate(); // Calls the function myListCreate (Like the Java constructor)
    myListFill();

    do {
        printf("\nWelcome to Mia's Library, Please type: \n");
        printf("1: View Library\n");
        printf("2: Query Book by Author\n");
        printf("3: Check Out a book\n");
        printf("4: Exit\n");
        scanf("%d", &theUserInLibraryInput);
        getchar();

        switch(theUserInLibraryInput) {
        case 1:
            printf("\nLibrary\n=============================\n");
            myListPrint();
            break;

        case 2:
            printf("\nQuery for Author\n========================\n");
            fgets(inAuthor, 80, stdin);
            if(myListDisplayBooksByAuthor(strtok(inAuthor, "\n")) == 1) {
                printf("This book does not exist in Mia's Library");
            }
            break;

        case 3:
            printf("\nChecking out a book\n========================\n");
            fgets(inTitle, 80, stdin);
            if (myListCheckOutItem(strtok(inTitle, "\n")) == 1) {
                printf("This book does not exist in Mia's Library");
            }
            break;

        case 4:
            printf("\nThank you for visiting, please come again!\n");

        default:
            printf("There is an error \n");
            break;
        }
        prompt(theUserInLibraryInput);
    } while(theUserInLibraryInput != 4); 
    return 0;
}

void prompt(int theUserInLibraryInput)
{
    char ch;
    if(theUserInLibraryInput == 4) {
        printf("Press enter to exit...\n");
    } else {
        printf("Press enter to return to main menu.\n");
    }
    //getchar();
    scanf("%c", &ch);
    system("clear");
}

/*// Display LIbrary
printf("\nDisplay Library\n=============================\n");
myListPrint();

printf("\nExample of 'Query for Author'\n========================\n");
myListDisplayBooksByAuthor("Stephen King");

printf("\nExample of checking out a book\n========================\n");
myListCheckOutItem("Night Shift");

printf("\nExample of 'Query Stephen King again...'\n========================\n");
myListDisplayBooksByAuthor("Stephen King");

printf("\nDisplay Library After A Book is Checked Out\n=============================\n");
myListPrint();*/

