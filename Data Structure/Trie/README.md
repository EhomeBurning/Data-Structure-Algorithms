# Trie
"Retrieve"   
*A data structure, actually it is a tree and a search tree*    


Search Trees   
usually ordered data structure    
search for some "keys"   



path
![Trie Example](/images/trie.png)    




## Topics
* [1.](#1)      
* [2.]()

## 1.    




* [Design A dictionary]()   
n - num of words     
m - length of the string/word    
   
Requirement:    
1. search(word)    
2. delete   
3. add   
4. find all words with given prefix    

Options of Data Structure:      
Trie   
HashMap, Balanced BST, ArrayList(Sorted)     

Data Structure | Search | delete | add | prefix
------------ | ------------- | ------------- | ------------- | -------------
HashMap | O(1 * m)(equals()) |  O(m) | O(m) | O(n * m)
Balanced BST | O(mlogn) | O(mlogn) | O(mlogn) | O(mlogn + k) 
ArrayList | O(mlogn) | O(mlogn + n) (move elements) | O(mlogn + n) | O(mlogn + k) 






