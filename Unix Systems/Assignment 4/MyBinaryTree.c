#include "MyBinaryTree.h"

static theNetstatDataNode* theBinaryTreeRoot = NULL;

int myBinaryTreeCreate()
{
    theBinaryTreeRoot = NULL;
    printf("Binary Tree created\n");
    return 0;
}

int myBinaryTreeFill()
{

    FILE* out = popen("netstat -a | grep 'ESTABLISHED'", "r");
    //FILE* infile;
    //infile = fopen("myNetstatEstablish.txt", "r");

    /*char theCurrentProtocol[7];
    char theCurrentRecvQueueSize[7];
    char theCurrentSendQueueSize[8];
    char theCurrentLocalAddress[24];
    char theCurrentForeignAddress[24];
    char theCurrentState[12];*/

    // char* lineBuff = "tcp123 123450 123450 mia-satellite-c55:35477 maybe.worcester.lo:2869 ESTABLISHED\0";

    /*memcpy(theCurrentProtocol, &lineBuff[0], 6);
    theCurrentProtocol[6] = '\0';
    printf("The current protocol is:%s<-\n", theCurrentProtocol);

    memcpy(theCurrentRecvQueueSize, &lineBuff[7], 6);
    theCurrentRecvQueueSize[6] = '\0';
    printf("The current Recv-Q is:%s<-\n", theCurrentRecvQueueSize);

    memcpy(theCurrentSendQueueSize, &lineBuff[14], 6);
    theCurrentSendQueueSize[6] = '\0';
    printf("The current Send-Q is:%s<-\n", theCurrentSendQueueSize);

    memcpy(theCurrentLocalAddress, &lineBuff[21], 23);
    theCurrentLocalAddress[23] = '\0';
    printf("The current Local Address is:%s<-\n", theCurrentLocalAddress);

    memcpy(theCurrentForeignAddress, &lineBuff[45], 23);
    theCurrentForeignAddress[23] = '\0';
    printf("The current Foreign Address is:%s<-\n", theCurrentForeignAddress);

    memcpy(theCurrentState, &lineBuff[69], 11);
    theCurrentState[11] = '\0';
    printf("The current State is:%s<-\n", theCurrentState);*/

    int lineCount = 0;
    if(out != NULL) {   // if file is open
        char lineBuff[85]; // Gives us a blank array size of 80
        while(fgets(lineBuff, sizeof(lineBuff), out) != NULL) {
            if(strlen(lineBuff) > 5) {

                theNetstatDataNode* theNewNode;
                theNewNode = malloc(sizeof(theNetstatDataNode));

                lineCount++;
                printf("%s", lineBuff);

                memcpy(theNewNode->protocol, &lineBuff[0], 5);
                theNewNode->protocol[5] = '\0';
                printf("The current protocol is:%s<-\n", theNewNode->protocol);

                memcpy(theNewNode->recvQueueSize, &lineBuff[6], 6);
                theNewNode->recvQueueSize[6] = '\0';
                printf("The current Recv-Q is:%s<-\n", theNewNode->recvQueueSize);

                memcpy(theNewNode->sendQueueSize, &lineBuff[13], 6);
                theNewNode->sendQueueSize[6] = '\0';
                printf("The current Send-Q is:%s<-\n", theNewNode->sendQueueSize);

                memcpy(theNewNode->localAddress, &lineBuff[20], 23);
                theNewNode->localAddress[23] = '\0';
                printf("The current Local Address is:%s<-\n", theNewNode->localAddress);

                memcpy(theNewNode->foreignAddress, &lineBuff[44], 23);
                theNewNode->foreignAddress[23] = '\0';
                printf("The current Foreign Address is:%s<-\n", theNewNode->foreignAddress);

                memcpy(theNewNode->state, &lineBuff[68], 11);
                theNewNode->state[11] = '\0';
                printf("The current State is:%s<-\n", theNewNode->state);
                printf("\n");

                myBinaryTreeAdd(theNewNode);
            }
        }
    }

    return 0;
}

int addNode(theNetstatDataNode* theInCurrentNode, theNetstatDataNode* theInNewNode)
{
    if(strcmp(theInNewNode->foreignAddress, theInCurrentNode->foreignAddress) < 0) { // Going down the left
        if(theInCurrentNode->theLeftTreeNode == NULL) {                              // Current Node is a leaf
            theInCurrentNode->theLeftTreeNode = theInNewNode;
        } else {                                                                     // Current Node is a parent
            addNode(theInCurrentNode->theLeftTreeNode, theInNewNode);
        }

    } else {                                                                        // Else, going down the right
        if(theInCurrentNode->theRightTreeNode == NULL) {
            theInCurrentNode->theRightTreeNode = theInNewNode;
        } else {
            addNode(theInCurrentNode->theRightTreeNode, theInNewNode);
        }
    }
    return 1;
}

int myBinaryTreeAdd(theNetstatDataNode* theInNode)
{
    theNetstatDataNode* theTempNode = theBinaryTreeRoot;

    if(theBinaryTreeRoot == NULL) {         // If the Binary Tree is empty
        theBinaryTreeRoot = theInNode;      // theInNode becomes the first node in the tree
    } else {                                // The Binary Tree is not empty
                                            // Find spot for new node
        addNode(theBinaryTreeRoot, theInNode);
    }

    // printf("**** ADDING...:%s<-\n", theInNode->protocol);

    return 0;
}

//In-Order Traversal
void localInOrderPrintTree(theNetstatDataNode* theBinaryTreeRoot)
{
    if(theBinaryTreeRoot != NULL) {
        localInOrderPrintTree(theBinaryTreeRoot->theLeftTreeNode);  //
        printf("  ");
        printf("value: %s\n", theBinaryTreeRoot->foreignAddress);
        localInOrderPrintTree(theBinaryTreeRoot->theRightTreeNode);
        printf("  ");
    }
}

//Pre-Order Traversal
void localPreOrderPrintTree(theNetstatDataNode* theBinaryTreeRoot) {
    if(theBinaryTreeRoot != NULL) {
        printf("value: %s\n", theBinaryTreeRoot->foreignAddress);
        localPreOrderPrintTree(theBinaryTreeRoot->theLeftTreeNode);
        //printf("  ");
        localPreOrderPrintTree(theBinaryTreeRoot->theRightTreeNode);
        //printf("  ");
    }

}

//Post-Order Traversal
void localPostOrderPrintTree(theNetstatDataNode* theBinaryTreeRoot) {
    if(theBinaryTreeRoot != NULL) {
        localPostOrderPrintTree(theBinaryTreeRoot->theLeftTreeNode);
        //printf("  ");
        localPostOrderPrintTree(theBinaryTreeRoot->theRightTreeNode);
        //printf("  ");
        printf("value: %s\n", theBinaryTreeRoot->foreignAddress);
    }
}

void printTree() {
    printf("In-Order Traversal\n");
    printf("--------------------------------\n");
    localInOrderPrintTree(theBinaryTreeRoot);
    printf("\n");
    printf("Pre-Order Traversal\n");
    printf("--------------------------------\n");
    localPreOrderPrintTree(theBinaryTreeRoot);
    printf("\n");
    printf("Post-Order Traversal\n");
    printf("--------------------------------\n");
    localPostOrderPrintTree(theBinaryTreeRoot);
}

