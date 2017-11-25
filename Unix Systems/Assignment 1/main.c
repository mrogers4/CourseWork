#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <time.h>

int assignment1()
{
    // printf("inside function\n\n");

    srand(time(0));
    int theNumberToGuess = rand() % 101;
    int theGuessCount = 0;
    int theUserInput = 0;
    int theUserKeepPlayingInput = 0;
    bool bCorrectGuess = false;
    bool bKeepPlaying = false;

    do {
        do {
            printf("Guess a number between 1 and 100: \n");
            scanf("%d", &theUserInput);
            printf("Ntg %d tui %d\n", theNumberToGuess, theUserInput);
            theGuessCount++;
            if(theNumberToGuess > theUserInput) {
                printf("The number you guessed is too low\n");
                bCorrectGuess = false;
            } else if(theNumberToGuess < theUserInput) {
                printf("The number you guessed is too high\n");
                bCorrectGuess = false;
            } else if(theNumberToGuess == theUserInput) {
                printf("The number you guessed is correct!\n");
                bCorrectGuess = true;
            }

            printf("Your number of guesses is: %d\n", theGuessCount);
        } while(!bCorrectGuess);
        printf("Do you want to keep playing?: \n");
        scanf("%d", &theUserKeepPlayingInput);
        if(theUserKeepPlayingInput == 0) {
            bKeepPlaying = false;
            printf("Thank you for playing!\n");
        } else {
            bKeepPlaying = true;
            srand(time(0));
            theNumberToGuess = rand() % 101;
            theGuessCount = 0;
            theUserInput = 0;
            theUserKeepPlayingInput = 0;
            bCorrectGuess = false;
            
        }
        
    } while(bKeepPlaying);

    return 0;
}
int main(int argc, char** argv)
{
    assignment1();
    return 0;
}
