# Recursion 

## Introduction 
* Function calls itself；    
* 把大问题变成小问题, big problem -> smaller problems;    
* Implementation:    
  * base case;   
  * recursive rule；  

## Table of Contents   
* [Call_Stack Function](#Call_Stack)  
* [Time and Space Complexity](#Time-and-Space-Complexity) 
* [Basic Recusion Questions](#Basic-Recusion-Questions)

## Call_Stack
* Global accessible recource  
* Usage:  store the local information for each recursion function

## Time and Space Complexity
*Draw the Recursion Tree if confused.*   
* Time Complexity: All the leaf node * each node time complexity 
* Space Complexity: how many call stacks in the recursion tree


## Basic Recusion Questions  

* Fibonacci   
```
# Fibonacci 

Time Complexity: 
All the leaf node (2^n) * each node time cost (O(1)) = O(2^n)  

Space Complexity: 
# of Call_Stack = DFS of the recursion tree = height(tree) = O(n)

Recursion Tree:  

        F(4) 
        /  \
     F(3)   F(2)   
     /  \    / \   
  F(2)  F(1)     
  /  \     
F(1)  F(0)    

int fibo (int n) {
    // base case 
    if (n == 0) {
        return 0;
    } else if (n == 1) {
        return 1;
    }
    return fibo(n - 1) + fibo(n - 2);
}
```










