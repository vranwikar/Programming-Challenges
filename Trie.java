import java.io.*;

class TrieNode {

	char letter;
	boolean fullword;
	TrieNode[] links;
	
	public TrieNode(char letter, boolean fullword){
		this.letter = letter;
		this.fullword = fullword;
		links = new TrieNode[26];		
	}
	
}


class PrefixTree{
	
	TrieNode root = null;
	
	public PrefixTree()
	{
		root = this.createTrie();
	}
	
	public TrieNode createTrie()
	{
		return new TrieNode('\0',false);
	}
	
	public void insertWord(TrieNode root, String word)
	{
		int offset = 97;
		TrieNode current = root;
		char[] letters = word.toCharArray();
		int l = letters.length;
		for(int i=0; i< l; i++)
		{
			if(current.links[letters[i]-offset] == null)
				current.links[letters[i]-offset] = new TrieNode(letters[i], false);
			current = current.links[letters[i]-offset];
		}
		current.fullword=true;
	}
	
	public boolean search(TrieNode root, String word)
	{
		char[] letters = word.toCharArray();
		int l = letters.length;
		int offset = 97;
		TrieNode current = root;
		int i=0;
		for(i = 0; i < l; i++)
		{	
			if(current.links[letters[i]-offset] == null)
				return false;
			current = current.links[letters[i]-offset];
		}
		
		if(i==l && current==null)
			return false;
		if(current!=null && !current.fullword)
			return false;
		
		return true;
	
	}
	
	void printTree(TrieNode root, int level, char[] branch)
    {
        if (root == null)
            return;
       
        for (int i = 0; i < root.links.length; i++)
        {
            branch[level] = root.letter;
            printTree(root.links[i], level+1, branch);   
        }
       
        if (root.fullword)
        {
            for (int j = 1; j <= level; j++)
                System.out.print(branch[j]);
            System.out.println();
        }
    }
    
	
}

public class Trie{
	
	public static void main(String[] args) {
		
		PrefixTree trie = new PrefixTree();
		String[] words = {"an", "ant","all", "allot", "alloy", "aloe", "are", "ate", "be"};
		
		for(int i = 0; i<words.length;i++){
			trie.insertWord(trie.root, words[i]);
		}
		char[] branch = new char[50];
		trie.printTree(trie.root, 0, branch);
		String wd1 = "allp";
		boolean res = trie.search(trie.root, wd1);
		if(res)
			System.out.println("Trie contains string " + wd1);
		else
			System.out.println("No word found");
		
	}
	
}
