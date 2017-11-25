#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "MyBinaryTree.h"

int main()
{
    printf("NETSTAT: Active Listening Connections\n");
    printf("----------------------------------------------------------------------\n");
    myBinaryTreeFill();
    printf("\n");
    printTree();
    return 0;
}
