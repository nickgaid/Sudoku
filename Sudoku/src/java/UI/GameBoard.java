package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameBoard extends JFrame implements MouseListener{
    private final JPanel mainPanel = new JPanel (new FlowLayout());
    private final JPanel numbersPanel = new JPanel (new GridLayout (3,3));
    private final JPanel[] crossBoard = new JPanel[9];
    private final JButton[][] buttonsInCross = new JButton[3][3];
    private final JButton[][] buttonsToSelect = new JButton[3][3];

    public GameBoard() {
        super("Sudoku");
        for (int j = 0; j < crossBoard.length; j++) {
            crossBoard[j] = new JPanel(new GridLayout(3, 3));
            crossBoard[j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            for (int i = 0; i < buttonsInCross.length; i++) {
                for (int k = 0; k < buttonsInCross[0].length; k++) {
                    switch (i) {
                        case 0 -> buttonsInCross[i][k] = new JButton(String.valueOf(k + 1));
                        case 1 -> buttonsInCross[i][k] = new JButton(String.valueOf(k + 4));
                        case 2 -> buttonsInCross[i][k] = new JButton(String.valueOf(k + 7));
                    }
                    buttonsInCross[i][k].setFocusPainted(false);
                    buttonsInCross[i][k].setContentAreaFilled(false);
                    buttonsInCross[i][k].addMouseListener(this);
                    buttonsInCross[i][k].setPreferredSize(new Dimension(60,60));
                    crossBoard[j].add(buttonsInCross[i][k]);
                }
            }
            mainPanel.add(crossBoard[j],BorderLayout.WEST);
        }
        int counter = 1;
            for (int i = 0; i < buttonsToSelect.length; i++) {
                for (int k = 0; k < buttonsToSelect[0].length; k++) {
                    buttonsToSelect[i][k] = new JButton(String.valueOf(counter));
                    buttonsToSelect[i][k].setFocusPainted(false);
                    buttonsToSelect[i][k].setContentAreaFilled(false);
                    buttonsToSelect[i][k].addMouseListener(this);
                    buttonsToSelect[i][k].setPreferredSize(new Dimension(50,50));
                    numbersPanel.add(buttonsToSelect[i][k]);
                    counter++;
                }
            }
        mainPanel.add(numbersPanel,BorderLayout.EAST);
        add(mainPanel);
        setPreferredSize(new Dimension(610,760));
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void mouseClicked(MouseEvent arg0) {
    }

    public void mousePressed(MouseEvent me) {
    }

    public void mouseReleased(MouseEvent me) {
    }

    public void mouseEntered(MouseEvent me) {
//
    }

    public void mouseExited(MouseEvent arg0) {

    }

    public static void main(String[] args) {
        new GameBoard();
    }
}
