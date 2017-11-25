#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <math.h>


int main()
{
    srand(time(NULL)); //Random number generator
    int* array;
    int i;
    int theUserInput     = 0;
    int theArrayLength   = 0;
    double sum           = 0.0;
    double average       = 0.0;
    double varianceSum   = 0.0;
    double variance      = 0.0;
    double std_deviation = 0.0;
    double median        = 0.0;
    
    
    printf("Type in an integer from 0-99 for size of array: ");
    scanf("%d", &theUserInput);
    theArrayLength = theUserInput;
    array = (int*) malloc(sizeof(int)*theArrayLength);  //multiplication
    printf("\n");
    
     //creates unsorted array with numbers between 0 and 100;
     for(i = 0; i < theArrayLength; i++) {
         int a = (rand() % 99) + 1;
         *(array + i) = a;
     }
     
     //Prints unsorted array
     printf("The unsorted array is: ");
     for(i = 0; i < theArrayLength; i++) {
     printf("%d, ", *(array + i));
     //*(array + i) = i;
     } 
     printf("\n");
     
     //Sorts the array
      int *k, *j, temp;
      for(k = array; k < array + theArrayLength; k++) {
          for (j = k + 1; j < array + theArrayLength; j++){
              if (*j < *k) {
                  temp = *j;
                  *j = *k;
                  *k = temp;
              }
            }
          }
      
      //Prints sorted array
     printf("The unsorted array sorted is: ");
     for(i = 0; i < theArrayLength; i++) {
     printf("%d, ", *(array + i));
    }
     
     printf("\n");
     
     //Finds the mean of the array
     for(i = 0; i < theArrayLength; i++) {
         sum += *(array + i);
         average = sum / theArrayLength;
     }
     //Prints the mean of the array
     printf ("The mean of the array is: %.2f\n", average);
     
     //Finds the median of the array
     if(theArrayLength % 2 == 0) {
        // if there is an even number of elements, return mean of the two elements in the middle
        median = (*(array + (theArrayLength + 2)) + *(array + ((theArrayLength/2)-1)))/2.0;
        
        printf("The median is: %.2f\n", median);
    } else { 
        // else return the element in the middle
        median = *(array + i/2);
        printf("The median is: %.2f\n", median);
    }
     
     //Prints the mode of the array
     int theMode           = 0;
     int theModeCount      = 0;
     int theCandidateMode  = 0;
     int theCandidateCount = 0;
     int theElementToTest  = 0;
     
     theMode      = *(array);
     theModeCount = 1;
     
     for (i = 1; i < theArrayLength; i++) {
         theElementToTest = *(array + i);
         
        if (theElementToTest == theMode) {
            theModeCount++;
     } else if (theElementToTest == theCandidateMode) {
            theCandidateCount++;
     } else {
         theCandidateMode  = theElementToTest;
         theCandidateCount = 1;
     }   
     
     if (theCandidateCount >= theModeCount) {
         theMode      = theCandidateMode;
         theModeCount = theCandidateCount;
         
         theCandidateMode  = 0;
         theCandidateCount = 0;
        }
     }
     
        if (theModeCount > 1) {
                printf("The mode of this sorted array: %d; It appears %d times. \n", theMode, theModeCount);
        } else {
                printf("There is no mode for this sorted array \n");
        }
     

     
     //Finds the variance of the array
     for(i = 0; i < theArrayLength; i++) {
         varianceSum += ((*(array + i)-average) * (*(array + i)-average)); //Goes through each number in array, 
                                                                        //subtracts the average from it and multiplies it by itself
     }
     variance = varianceSum / theArrayLength;
     //Prints the variance of the array
     printf ("The variance of the array is: %.2f\n", variance);
     
     //Finds the Standard Deviation of the array
     std_deviation = sqrt(variance);
     printf ("The stand deviation of the array is: %.2f\n", std_deviation);
     
     free(array);
   
	return 0;
}
