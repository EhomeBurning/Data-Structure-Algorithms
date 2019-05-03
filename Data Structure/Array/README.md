# Array 





## Topics
* [1. Two Pointers](#1-Two-Pointers)      
* [2.]()

## 1. Two Pointers    




* [905. Sort Array By Parity(Easy)](https://leetcode.com/problems/sort-array-by-parity/)     
Input: [3,1,2,4]    
Output: [2,4,3,1]    
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.    
> Solution:      
> 1. i: slow pointer; j: find even num;      
> 2. condition: swap when find even num;     

* [922. Sort Array By Parity II(Easy)](https://leetcode.com/problems/sort-array-by-parity-ii/)   
> Assumptions: 
> 1. num of even = num of odd.     
> 2. array.length % 2 == 0.    
> Solution:   
> 1. i: even index; j: odd index;  
> 2. condition: i find odd num, j find even num, then swap;      
> Tips:    
> 1. in while loop, mind index exception every condition and put it in the first place.    






