package UI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameBoard extends JFrame {
    private JPanel mainPanel = new JPanel(new GridLayout(3,3));
    private ArrayList<JPanel> listPanel = new ArrayList<>();
    private ArrayList<JButton> buttons = new ArrayList<>();
    public void GameBoard (){
        buttons.add(new JButton("Button 1"));
        mainPanel.add(buttons.get(0));
        add(mainPanel);
    }
}
