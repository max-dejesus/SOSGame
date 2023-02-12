import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// GUI needs: text, lines, check box, radio buttons

public class App  extends JFrame implements ItemListener {

    static boolean boolTest;

    public static boolean getBoolTest() { return boolTest; }

    private static void createAndShowGUI() {
        App s = new App();

        //Create and set up the window.
        JFrame frame = new JFrame("SOS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);
  
        JCheckBox checkbox = new JCheckBox("boolTest value");
        checkbox.addItemListener(s);

        JRadioButton radio = new JRadioButton("Simple");
        JRadioButton radio2 = new JRadioButton("General");

        ButtonGroup group = new ButtonGroup();
        group.add(radio);
        group.add(radio2);

        JPanel checkRow = new JPanel(new GridLayout(0,1)); 
        checkRow.add(checkbox);
        checkRow.add(radio);
        checkRow.add(radio2);

        
    
 
        //Display the window.
        frame.pack();
        frame.add(checkRow, BorderLayout.LINE_START);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
 
    public void itemStateChanged(ItemEvent e){
        if (e.getStateChange() == ItemEvent.DESELECTED){
            boolTest = false;
        }
        else { boolTest = true; }
        System.out.println(boolTest);
    }


    public static void main(String[] args) {
        int selection = 0;
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
