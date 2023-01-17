
//This interface defines the methods that the SentenceView class must implement
public interface SentenceViewInterface {

  /**
   * Get the text from the sentence field
   *
   * @return the sentence
   */
  String getSentence();

  /**
   * Set the text of the word count label to show the word count
   *
   * @param count the words' number in the sentence
   */
  void setWordCount(int count);

  /**
   * Set the text of the longest word label to show the longest word
   *
   * @param word represents the longest word in the sentence
   */
  void setLongestWord(String word);

  /**
   * Set the text of the most popular letter label to show the most popular letter
   *
   * @param letter represents the most popular letter in the sentence
   */
  void setMostPopularLetter(char letter);

  /**
   * Set the text of the sentence field to show the Pig Latin version of the sentence
   *
   * @param pigLatin represents the sentence in Pig Latin
   */
  void setPigLatin(String pigLatin);

}
