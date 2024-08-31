package Trie;

public class Trie {

    static class Node{
        Node[] links = new Node[26];
        boolean flag = false;

        boolean containsKey(char ch){
            return links[ch - 'a'] != null;
        }

        void put(char ch, Node n){
            links[ch - 'a'] = n;
        }

        Node get(char ch){
            return links[ch - 'a'];
        }

        void setEnd(){
            flag = true;
        }

        boolean isEnd(){
            return flag;
        }
    }

    private Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(!node.containsKey(c)){
                node.put(c,new Node());
            }

            node = node.get(c);
        }
        node.setEnd();
    }

    public boolean search(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(!node.containsKey(c)){
                return false;
            }
            node = node.get(c);
        }
        return node.isEnd();
    }

    public boolean startsWith(String prefix) {
        Node node = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if(!node.containsKey(c)){
                return false;
            }
            node = node.get(c);
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("apps");
        trie.insert("applet");
        trie.insert("melon");
        trie.insert("mango");
        System.out.println(trie.search("mango"));
        System.out.println(trie.search("applet"));
        System.out.println(trie.search("abrar"));
        System.out.println(trie.startsWith("ap"));
        System.out.println(trie.startsWith("la"));
    }
}
