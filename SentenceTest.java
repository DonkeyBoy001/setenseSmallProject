
//Junit Test class for Playing with sentences project

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SentenceTest {
  // 4 sentences to test
  private SentenceModel sentence1;
  private SentenceModel sentence2;
  private SentenceModel sentence3;
  private SentenceModel sentence4;

  @Before
  public void setUp() {
    // Initialize the sentences
    sentence1 = new SentenceModel("Hello World!");
    sentence2 = new SentenceModel("We are having pizza in the evening!");
    sentence3 = new SentenceModel("Excuse me, I have to leave.");
    sentence4 = new SentenceModel("The quick brown fox jumps over the lazy dog");
  }

  // Test the getSentence
  @Test
  public void getSentence() {
    assertEquals("Hello World!", sentence1.getSentence());
    assertEquals("We are having pizza in the evening!", sentence2.getSentence());
    assertEquals("Excuse me, I have to leave.", sentence3.getSentence());
    assertEquals("The quick brown fox jumps over the lazy dog", sentence4.getSentence());
  }

  // Test the getWordCount
  @Test
  public void getWordCount() {
    assertEquals(2, sentence1.getWordCount());
    assertEquals(7, sentence2.getWordCount());
    assertEquals(6, sentence3.getWordCount());
    assertEquals(9, sentence4.getWordCount());
  }

  // Test the getLongestWord
  @Test
  public void getLongestWord() {
    assertEquals("Hello", sentence1.getLongestWord());
    assertEquals("evening", sentence2.getLongestWord());
    assertEquals("Excuse", sentence3.getLongestWord());
    assertEquals("quick", sentence4.getLongestWord());
  }

  // Test the getMostPopularLetter
  @Test
  public void getMostPopularLetter() {
    assertEquals('l', sentence1.getMostPopularLetter());
    assertEquals('e', sentence2.getMostPopularLetter());
    assertEquals('e', sentence3.getMostPopularLetter());
    assertEquals('o', sentence4.getMostPopularLetter());
  }

  // Test the getPigLatin
  @Test
  public void getPigLatin() {
    assertEquals("elloHay orldWay",
            sentence1.getPigLatin());
    assertEquals("eWay areyay avinghay izzapay inyay ethay eveningyay",
            sentence2.getPigLatin());
    assertEquals("Excuseyay emay Iyay avehay otay eavelay",
            sentence3.getPigLatin());
    assertEquals("eThay uickqay ownbray oxfay umpsjay overyay ethay azylay ogday",
            sentence4.getPigLatin());
  }

  // Test the setSentence
  @Test
  public void setSentence() {
    sentence1.setSentence("This is a test sentence.");
    assertEquals("This is a test sentence.", sentence1.getSentence());
    assertEquals(5, sentence1.getWordCount());
    assertEquals("sentence", sentence1.getLongestWord());
    assertEquals('s', sentence1.getMostPopularLetter());
    assertEquals("isThay isyay ayay esttay entencesay",
            sentence1.getPigLatin());
  }
}