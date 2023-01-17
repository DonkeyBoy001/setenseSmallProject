
// The controller class, which connects the model and the view and handles user input
public class SentenceController implements SentenceControllerInterface {
  // Declare model and view objects
  private final SentenceModel model;
  private final SentenceView view;

  // Constructor
  public SentenceController(SentenceModel model, SentenceView view) {
    this.model = model;
    this.view = view;
  }

  // Method to start the controller
  // Let the view know that the controller is ready to receive input
  public void go() {
    handleSubmitButtonClick();
    handlePigLatinButtonClick();
  }

  //Private method to handle the submit button click
  private void handleSubmitButtonClick() {
    // This could involve calling the model's methods to obtain the required information
    // and updating the view to display the required information of the sentence

    // Add an action listener to the submit button
    view.addSubmitListener(e -> {
      // Get the sentence from the view
      String sentence = view.getSentence();

      // Update the model with the sentence
      model.setSentence(sentence);

      // Update the view with the word count, the longest word, and most popular letter
      view.setWordCount(model.getWordCount());
      view.setLongestWord(model.getLongestWord());
      view.setMostPopularLetter(model.getMostPopularLetter());
    });
  }

  //Private method to handle the Pig Latin button click
  private void handlePigLatinButtonClick() {
    // This could involve calling the model's toPigLatin() method to transform the sentence
    // and updating the view to display the transformed sentence

    // Add an action listener to the pig latin button
    view.addPigLatinListener(e -> {
      // Get the sentence from the view
      String sentence = view.getSentence();

      // Update the model with the sentence
      model.setSentence(sentence);

      // Update the view with the pig latin version of the sentence
      view.setPigLatin(model.getPigLatin());
    });
  }

  // Method to exit the program
  public void exitProgram() {
    System.exit(0);
  }

}

