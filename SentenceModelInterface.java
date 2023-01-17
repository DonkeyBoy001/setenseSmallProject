/*Name: Zongling Guo
 * ID: 002652774
 * e-mail: guo.zon@northeastern.edu*/

//This interface is used to define the methods that the model must implement
public interface SentenceModelInterface {

  /**
   * Returns the sentence that is currently stored in the model.
   *
   * @return the sentence that is currently stored in the model
   */
  String getSentence();

  /**
   * Sets the sentence that is currently stored in the model.
   *
   * @param sentence the sentence that is currently stored in the model
   */
  void setSentence(String sentence);

  /**
   * Returns the number of words in the sentence that is currently stored in the model.
   *
   * @return the number of words in the sentence that is currently stored in the model
   */
  int getWordCount();

  /**
   * Returns the longest word in the sentence that is currently stored in the model.
   *
   * @return the longest word in the sentence that is currently stored in the model
   */
  String getLongestWord();

  /**
   * Returns the most popular letter in the sentence that is currently stored in the model.
   *
   * @return the most popular letter in the sentence that is currently stored in the model
   */
  char getMostPopularLetter();

  /**
   * Returns the pig latin version of the sentence that is currently stored in the model.
   *
   * @return the pig latin version of the sentence that is currently stored in the model
   */
  String getPigLatin();

}
