#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct { //Creates Node structure
    char   protocol[7];       //Protocol of netstat data inside node
    char   recvQueueSize[7];  //Recv-Queue Size of netstat data inside node
    char   sendQueueSize[8];  //Send-Queue Size of netstat data inside node
    char   localAddress[24];   //Local Address of netstat data inside node
    char   foreignAddress[24]; //Foriegn Address of netstat data inside node
    char   state[24];          //State of netstat data inside node
    struct theNetstatDataNode* theRightTreeNode;
    struct theNetstatDataNode* theLeftTreeNode;
} theNetstatDataNode;

int myBinaryTreeCreate();
int myBinaryTreeFill();
int myBinaryTreeAdd();
void printTree();
