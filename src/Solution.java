import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.*; 

public class Solution {
    public static void main(String[] args) throws IOException {
    	String test = "bbbcccdddaaa";
    	int[] array = { 4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10 };
    	
    	
    	
    	int stop = -1;
    }
    
    public int[] shortestToChar(String S, char C) {
        int n = S.length();
        int[] res = new int[n];
        int pos = -n;
        
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == C) pos = i;
            res[i] = i - pos;
        }
        
        for (int i = n - 1; i >= 0; i--) {
            if (S.charAt(i) == C)  pos = i;
            res[i] = Math.min(res[i], Math.abs(i - pos));
        }
        
        return res;
    }
    
    public static int[] numberOfLines(int[] widths, String S) {
        int lines = 1, length = 0;
        final int max_width = 100;
        
        for (int i = 0; i < S.length(); i++) {
            int increment = widths[S.charAt(i) - 97];
            if (length + increment >= max_width) {
                lines++;
                length -= 100;
            }
            
            length += increment;
        }
        
        return new int[] { lines, length };
    }
    
    // Test functions here
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] wordsArray = s.split("\\s+");
        for (int i = 0; i < wordsArray.length; i++) {
            wordsArray[i] = flip(wordsArray[i]);
            sb.append(wordsArray[i] + " ");
        }
        
        return sb.toString().trim();
    }
    
    public static String flip(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() -1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    
    public int maxDepth(Node root) {
    	if (root == null) { return 0; }
    	
    	return recurse(root, 1);
    }
    
    public int recurse(Node node, int level) {
    	if (node.children == null || node.children.isEmpty()) {
    		return level;
    	} 
    	
    	int depth = 0;
    	for (Node child : node.children) {
    		depth = Math.max(recurse(child, level + 1), depth);
    	}
    	
    	return depth;
    }
    
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
