package basicoperations.domain;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordsConjucture {
    private Set<String> uniqueWords;


    public UniqueWordsConjucture() {
        uniqueWords = new HashSet<>();
    }

    public void addWord(final String word) {
        uniqueWords.add(word);
    }

    public void removeWord(final String word) {
        uniqueWords.remove(word);
    }

    public boolean verifyWord(final String word) {
        return uniqueWords.contains(word);
    }

    public void showUniqueWords() {
        System.out.println(uniqueWords);
    }

    @Override
    public String toString() {
        return "UniqueWordsConjucture{" +
                "uniqueWords=" + uniqueWords +
                '}';
    }

    public static void main(String[] args) {
        UniqueWordsConjucture uniqueWordsConjucture = new UniqueWordsConjucture();
        uniqueWordsConjucture.addWord("Batata");
        uniqueWordsConjucture.addWord("Batata");
        uniqueWordsConjucture.addWord("Cenoura");
        uniqueWordsConjucture.addWord("Beterraba");
        uniqueWordsConjucture.addWord("Tomate");
        uniqueWordsConjucture.showUniqueWords();
        System.out.println();
        uniqueWordsConjucture.removeWord("Cenoura");
        uniqueWordsConjucture.showUniqueWords();
        System.out.println();
        String word = "Beterraba";
        System.out.printf("Word \"%s\" present: %s\n", word, uniqueWordsConjucture.verifyWord(word));
    }
}

