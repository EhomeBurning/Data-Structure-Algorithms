# Trie
*From the word "Retrieve"*       
*A data structure, actually it is a tree and a search tree*    

* Use Case:    
1. String or sequence typed elements.    
2. fast worst case search/add/delete.   
3. **grouping common prefix, both for time and space efficiency**.   
4. problems related to prefix/matching.     

* Example Trie    
path    
![Trie Example](/images/trie.png)       

* Dictionary Requirement:      
1. search(word)    
2. delete   
3. add   
4. find all words with given prefix    

* Options of Data Structure:      
1. Trie   
2. HashMap, Balanced BST, ArrayList(Sorted)   

* Time Complexity Analysis:    
n - num of words     
m - length of the string/word    
Data Structure | Search | delete | add | prefix
------------ | ------------- | ------------- | ------------- | -------------
HashMap | O(1 * m)(equals()) |  O(m) | O(m) | O(n * m)
Balanced BST | O(mlogn) | O(mlogn) | O(mlogn) | O(mlogn + k) 
ArrayList | O(mlogn) | O(mlogn + n) (move elements) | O(mlogn + n) | O(mlogn + k) 
Trie | O(m) (guarantee) | O(m) | O(m) | O(m)  

* Advantages:    
1. Ordering     
HashMap do not have.     

2. Space  
Only if the trie is not too sparse.     
Worst case O(nm).    

* Drawbacks:    
1. Time:   
If stored on disk, more random disk accesses(expensive).   
2. Space(especially when trie is sparse):    
Every TrieNode has extra space consumption.  
Memory allocation fragmentation.   




## Topics
* [1.](#1)      
* [2.]()

## 1.    




* [Design A dictionary]()   

   








