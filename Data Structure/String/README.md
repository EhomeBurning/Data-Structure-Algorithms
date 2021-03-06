# String 
*There are nine main topics about String*

* [8. String to Integer (atoi)(Medium)](https://leetcode.com/problems/string-to-integer-atoi/)    
> Input: "4193 with words"      
> Output: 4193     
> Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.  
> Solution:     
> 1. firstChar as a sign;       
> 2. see if the following char is digit or not;       
> 3. if char, result = 10 * result + curNum;    

> Tips:      
> 1. mind MAX_VALUE and MIN_VALUE;   


* [387. First Unique Character in a String(Easy)](https://leetcode.com/problems/first-unique-character-in-a-string/)     
> input: s = "leetcode"      
> return 0.   
> Solution:   
> 1. int[] count = new int[26];      
> 2. count[ch - 'a']++;    



# 1. Removal 
## 1.1 remove some particular chars from a string.
## 1.2 remove all leading/tralling/duplicated empty spaces from a string

# 2. Deduplicate


# 3. Substring -> strstr



# 4. String Reversal  

## 4.1 basic reverse   
* [344. Reverse String](https://leetcode.com/problems/reverse-string/)    
Input: ["h","e","l","l","o"]   
Output: ["o","l","l","e","h"]    

* [StringReversal](https://github.com/EhomeBurning/Leetcode_Java/blob/master/Tags/String/StringReversal.java)  
1. Method 1:   Iteration(two pointers different direction). Swap left and right pointers.          
(1) Time: O(n);     
(2) Space: O(1);  

2. Method 2: Recursive.   
(1) base case: 0 or 1 char remaining.  i >= j.     
(2) recursive rule: reverse(i + 1, j - 1).      

 
## 4.2 Double shift -> "I love Google" trick
Step1. Reverse the sentence    
Step2. Reverse each word    
### 4.2.1 Right shift by N Characters  


### 4.2.2 Reverse words
[186. Reverse Words in a String II](https://leetcode.com/problems/reverse-words-in-a-string-ii/)   
> Input:  ["t","h","e"," ","s","k","y"," ","i","s"," ","b","l","u","e"]  
> Output: ["b","l","u","e"," ","i","s"," ","s","k","y"," ","t","h","e"]  

### 4.2.3 Reverse words with spaces 
[151. Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/)     
*Handle the Spaces - head, trailing, between*  
Input: "the sky is blue"  
Output: "blue is sky the"  
1. Method1: Stack  
2. Method2: Double shift trick    
 







# 5. Replacement  
## 5.1 replace given 
s1 -> s2   
### 5.1.1. Case 1(s1.size() >= s2.size()):     
1. Solution     
slow: all letters on the left hand side are results.   
fast: scan all the letters.   

2. Example   
S, f  two pointer 
Den -> XX 
s   t   u  d  e  n  t  d  e n t   
s   t   u  X  X t   X X  t   
                            S   
                                F    

Corner case: Size of replacement longer than original.     

### 5.1.2. Case 2(s1.size() < s2.size()):   
1. Step 1: Scan left to right to find occurances of s1.  
2. Step 2: new size = n + 2 * (s2.size() - s1.size()) .    
3. Step 3: Two pointers same direction right to left:     
(1) slow: all letters on the rhs of slow are results.  
(2) fast: current index   


# Advanced Topics 
# 6. Shuffling(ABCD1234 -> A1B2C3D4)  



# 7. Permutation(DFS)   


# 8. Decoding/Encoding(aaabbbc -> a3b3c1)  



# 9. Sliding window using two pointers   







