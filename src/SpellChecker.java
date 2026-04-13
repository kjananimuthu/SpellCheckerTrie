class SpellChecker {
    Trie trie = new Trie();

    void loadWords() {
        String[] words = {
            "apple", "banana", "cat", "dog", "elephant",
            "fish", "grape", "house", "india", "java"
        };

        for (String word : words) {
            trie.insert(word);
        }
    }

    boolean check(String word) {
        return trie.search(word.toLowerCase());
    }
}