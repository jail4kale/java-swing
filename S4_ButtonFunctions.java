import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class S4_ButtonFunctions {
    public static void main(String [] args) {
        guiClass guiObj = new guiClass();
    }
}

public class guiClass {
    private JFrame groot;
    // The label must be static so that a static function ButtonFunction can
    // change it's text. Static and non-static things are a whole other kettle of fish
    private static JLabel glabel;
    private JButton gbutton;

    private static boolean state = true;

    public guiClass() {
        groot = new JFrame("Functional Buttons!");
        groot.setLayout(new GridLayout(2,1));        // Height by Width
        groot.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        glabel = new JLabel("This is a label");

        gbutton = new JButton("I am a button");
        // Add function to the button
        gbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("The button was pressed");
                buttonFunction();
            }
        });

        groot.add(glabel);
        groot.add(gbutton);
        groot.setSize(200, 200);
        groot.setVisible(true);
    }
    public static void buttonFunction() {
        if (state == true) {
            glabel.setText("Hello");
            state = false;
        } else {
            glabel.setText("Bye");
            state = true;
        }
    }
}
