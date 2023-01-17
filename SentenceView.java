import java.awt.event.ActionListener;

import javax.swing.*;

// The view class, which displays the sentence and the information obtained from the model
public class SentenceView extends JPanel implements SentenceViewInterface {
  // The sentence field
  private final JTextField sentenceField;
  // The word count label
  private final JLabel wordCountLabel;
  // The longest word label
  private final JLabel longestWordLabel;
  // The most popular letter label
  private final JLabel mostPopularLetterLabel;
  // The Pig Latin label
  private final JButton submitButton;
  // The Pig Latin label
  private final JButton pigLatinButton;

  // Constructor
  public SentenceView() {
    // Create the frame
    JFrame frame = new JFrame("Playing with Sentences");

    // Create the text field for entering the sentence
    sentenceField = new JTextField(20);

    // Create the labels for displaying information about the sentence
    JLabel sentenceLabel = new JLabel("Enter a Sentence:");
    wordCountLabel = new JLabel("Word Count: ");
    longestWordLabel = new JLabel("Longest Word: ");
    mostPopularLetterLabel = new JLabel("Most Popular Letter: ");


    // Create the buttons for submitting the sentence and displaying the Pig Latin version
    submitButton = new JButton("Submit");
    pigLatinButton = new JButton("Transfer to Pig Latin");

    // Layout the components using a panel
    JPanel panel = new JPanel();
    panel.add(sentenceLabel);
    panel.add(sentenceField);
    panel.add(submitButton);
    panel.add(wordCountLabel);
    panel.add(longestWordLabel);
    panel.add(mostPopularLetterLabel);

    panel.add(pigLatinButton);
    frame.add(panel);

    // Set the size and location of the frame
    frame.setSize(400, 200);
    frame.setLocationRelativeTo(null);

    // Set the default close operation and make the frame visible
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  // Get the text from the sentence field
  public String getSentence() {
    return sentenceField.getText();
  }

  // Set the text of the word count label to show the word count
  public void setWordCount(int count) {
    wordCountLabel.setText("Word Count: " + count);
  }

  // Set the text of the longest word label to show the longest word
  public void setLongestWord(String word) {
    longestWordLabel.setText("Longest Word: " + word);
  }

  // Set the text of the most popular letter label to show the most popular letter
  public void setMostPopularLetter(char letter) {
    mostPopularLetterLabel.setText("Most Popular Letter: " + letter);
  }

  // Set the text of the sentence field to show the Pig Latin version of the sentence
  public void setPigLatin(String pigLatin) {
    sentenceField.setText(pigLatin);
  }

  // Add the action listener to the submit button
  public void addSubmitListener(ActionListener listener) {
    submitButton.addActionListener(listener);
  }

  // Add the action listener to the Pig Latin button
  public void addPigLatinListener(ActionListener listener) {
    pigLatinButton.addActionListener(listener);
  }

}
