/*Name: Zongling Guo
 * ID: 002652774
 * e-mail: guo.zon@northeastern.edu*/

//Main class to test the program running properly

import javax.swing.*;

import java.awt.*;

public class Main extends JFrame {
  public static void main(String[] args) {
    // Initialize model, view, and controller
    SentenceModel model = new SentenceModel();
    SentenceView view = new SentenceView();
    SentenceController controller = new SentenceController(model, view);

    // Start the controller
    controller.go();
    //Exit program
    //controller.exitProgram();
  }
}



