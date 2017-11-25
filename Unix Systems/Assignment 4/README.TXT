Quick Start:
To Build: Run make
To Run: Execute at command line "./main"

Details:
I created a C program which implements a Binary Search Tree consisting of active internet connections detected by my computer. There are a number of ways to do this, but the way I chose to do it was to use a Unix utility called netstat. Note: this utility is also available on Windows if you do not have access to a Linux or Mac.  environment. I executed the following command through my C program using the system() function to list all the actively listening connections detectable from my terminal: netstat –l
The output that I was interested in had a status of ESTABLISHED which I gepped for, or parse out using C string functions. I then inserted the data into a structure with an attribute for each output column. The output of netstat is as follows: 
Protocol, Recv-Queue size, Send-Queue size, Local Address, Foreign Address, State 
So my struct will resemble the following:
struct netstat_data {
       	char* protocol;
	int recv_q;
	int send_q;
        char* local_address;
        char* foreign_address;
 	char* state;
};
After, I built the BST such that it was ordered by foreign address. It is a char* so even if comparing IP addresses (which consist mostly of integers) to hostnames (strings), there still will be a valid result.

