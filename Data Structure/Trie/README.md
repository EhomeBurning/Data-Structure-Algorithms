# Trie
*From the word "Retrieve"*       
*Trie is a data structure, actually it is a tree and a search tree*   

- Use Case:    
   - String or sequence typed elements.    
   - fast worst case search/add/delete.   
   - **grouping common prefix, both for time and space efficiency**.   
   - problems related to prefix/matching.     

- Example Trie    
path    
![Trie Example](/images/trie.png)       

## Topics
* [1.Knowledge](#1)      
* [2.]()

## 1.Knowledge    




- Dictionary Requirement:      
   - search(word)    
   - delete   
   - add   
   - find all words with given prefix    

- Options of Data Structure:      
   - Trie   
   - HashMap, Balanced BST, ArrayList(Sorted)   

- Time Complexity Analysis:    
   - n -> num of words     
   - m -> length of the string/word    
Data Structure | Search | delete | add | prefix
------------ | ------------- | ------------- | ------------- | -------------
HashMap | O(1 * m)(equals()) |  O(m) | O(m) | O(n * m)
Balanced BST | O(mlogn) | O(mlogn) | O(mlogn) | O(mlogn + k) 
ArrayList | O(mlogn) | O(mlogn + n) (move elements) | O(mlogn + n) | O(mlogn + k) 
Trie | O(m) (guarantee) | O(m) | O(m) | O(m)  

- Advantages:    
   - Ordering     
      - HashMap do not have.     

2. Space  
Only if the trie is not too sparse.     
Worst case O(nm).    

* Drawbacks:    
1. Time:   
If stored on disk, more random disk accesses(expensive).   
2. Space(especially when trie is sparse):    
Every TrieNode has extra space consumption.  
Memory allocation fragmentation.   








* [Design A dictionary]()   

   








