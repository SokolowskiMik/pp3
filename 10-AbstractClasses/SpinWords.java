import java.util.*;

public class SpinWords {

  public String spinWords(String sentence) {
    List<String> reversedWords = new ArrayList<String>();
    
    String[] splitWords = sentence.split(" ");
    
    for (String word:splitWords) {
      if (word.length() >= 5) {
        StringBuilder reversedWord = new StringBuilder(word);
        reversedWord.reverse();
        word = reversedWord.toString();
      }
      reversedWords.add(word);
    }
    return String.join(" ",reversedWords);
    
  }
}