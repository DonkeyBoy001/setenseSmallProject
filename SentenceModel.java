import java.util.HashMap;
import java.util.Map;

//This is the model for the playing with sentence,
//which stores the sentence and performs the necessary operations
//It implements the SentenceModelInterface
public class SentenceModel implements SentenceModelInterface {
  //The sentence that is currently stored in the model
  private String sentence;
  //The number of words in the sentence
  private int wordCount;
  //The longest word in the sentence
  private String longestWord;
  //The most popular letter in the sentence
  private char mostPopularLetter;
  //The pig latin version of the sentence
  private String pigLatin;

  //Default Constructor
  public SentenceModel() {
    sentence = "";
    wordCount = 0;
    longestWord = "";
    mostPopularLetter = ' ';
    pigLatin = "";
  }

  //Constructor with a sentence as parameter
  //When the sentence is set
  //process the sentence to get the wordCount, longestWord, mostPopularLetter and pigLatin
  public SentenceModel(String sentence) throws IllegalArgumentException {
    if (sentence == null) {
      throw new IllegalArgumentException("The sentence cannot be null");
    }
    this.sentence = sentence;
    processSentence();
  }

  //Returns the sentence
  public String getSentence() {
    return sentence;
  }

  //Get the wordCount
  public int getWordCount() {
    return wordCount;
  }

  //Get the longestWord
  public String getLongestWord() {
    return longestWord;
  }

  //Get the mostPopularLetter
  public char getMostPopularLetter() {
    return mostPopularLetter;
  }

  //Get the pigLatin
  public String getPigLatin() {
    return pigLatin;
  }

  //Set the sentence
  public void setSentence(String sentence) {
    this.sentence = sentence;
    processSentence();
  }

  //Process the sentence to get the wordCount, longestWord, mostPopularLetter and pigLatin
  private void processSentence() {
    //Remove the punctuation
    // and split the sentence into words
    String[] words = sentence.replaceAll("[^a-zA-Z ]", "").split("\\s+");

    //1. Count the number of words
    wordCount = words.length;

    //2. Find the longest word
    longestWord = "";
    for (String word : words) {
      if (word.length() > longestWord.length()) {
        longestWord = word;
      }
    }

    //3. Find the most popular letter
    Map<Character, Integer> letterCounts = new HashMap<>();
    for (String word : words) {
      for (char letter : word.toLowerCase().toCharArray()) {
        if (letterCounts.containsKey(letter)) {
          letterCounts.put(letter, letterCounts.get(letter) + 1);
        } else {
          letterCounts.put(letter, 1);
        }
      }
    }
    int maxCount = 0;
    for (char letter : letterCounts.keySet()) {
      if (letterCounts.get(letter) > maxCount) {
        maxCount = letterCounts.get(letter);
        mostPopularLetter = letter;
      }
    }

    //4. Convert the sentence to pig latin
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      // Check if the word starts with a vowel or consonant cluster
      if (word.matches("^[aeiouAEIOU].*")) {
        // The word starts with a vowel, so we just add "yay" to the end
        word = word + "yay";
      } else if (word.matches("^[^aeiouAEIOU].*")) {
        // The word starts with a consonant cluster, so we move the cluster to the end and add "ay"
        String cluster = word.replaceAll("^([^aeiouAEIOU]+)(.*)", "$1");
        String rest = word.replaceAll("^([^aeiouAEIOU]+)(.*)", "$2");
        word = rest + cluster + "ay";
      }
      // Replace the original word with the Pig Latin version in the words array
      words[i] = word;
    }
    pigLatin = String.join(" ", words);
  }

}
