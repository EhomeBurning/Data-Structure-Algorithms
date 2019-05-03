//Assumption:
//1. charset only contains 26 lower case
class TrieNode {
    // 'a', 'b', ... , 'z'
    TrieNode[] children; // size 26 array, each index -> character.
    boolean isWord; // confirm is word or prefix.
}

class TrieNode {
    Map<Character, TrieNode> children;
    boolean isWord;
}

public class Solution {
    TrieNode root;
    public boolean seachWord(String word) {
        // sanity check applied
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            int pos = word.charAt(i) - 'a';
            if (cur.children[pos] != null) {
                cur = cur.children[pos];
            } else {
                return false;
            }
        }
        return cur.isWord; // IMPORTANT!
    }
    
    public boolean insert(String word) {
        // sanity check applied
        if (search(word)) {
            return false;
        }
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            int pos = word.charAt(i) - 'a';
            if (cur.children[pos] == null) {
                cur.children[pos] = new TrieNode;
            }
            cur = cur.children[pos];
            cur.numWords++;
        }
        return true; // IMPORTANT!
    }
    
    // Delete Method1: Stack. Store all the path of the node. if(node has no children && !isWord)can be deleted.
    
    // Delete Method2: Recursion. when return from the deeper level, do deletion.
    
    // Deelete Method3: add TrieNode parent, int numWords.
    class TrieNode {
        TrieNode[] children;
        boolean isWord;
        TrieNode parent;
        int numWords;
    }
    
    public boolean delete(String word) {
        // sanity check applied
        if (search(word)) {
            return false;
        }
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            int pos = word.charAt(i) - 'a';
            if (cur.children[pos].numWords == 1) {
                cur.children[pos] = null;
                return true;
            }
            cur.children[pos].numWords--;
            cur = cur.children[pos];
        }
        return true; // IMPORTANT!
    }
}






