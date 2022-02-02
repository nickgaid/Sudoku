package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameBoard extends JFrame implements MouseListener{
    private JPanel mainPanel = new JPanel (new GridLayout(1,2));
    private JPanel numbersPanel = new JPanel (new GridLayout (3,3));
    private JPanel crossBoard = new JPanel(new GridLayout(9, 9));;
    private JButton[][] buttonsInCross = new JButton[9][9];
    private JButton[][] buttonsToSelect = new JButton[3][3];

    public GameBoard() {
        super("Sudoku");
        for (int i = 0; i < buttonsInCross.length; i++) {
            for (int k = 0; k < buttonsInCross[0].length; k++) {
                buttonsInCross[i][k] = new JButton(String.valueOf(k+1));
                buttonsInCross[i][k].setFocusPainted(false);
                buttonsInCross[i][k].setContentAreaFilled(false);
                buttonsInCross[i][k].addMouseListener(this);
                buttonsInCross[i][k].setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));
                if( k == 5 || k == 2 ) {
                    buttonsInCross[i][k].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, Color.BLACK));
                }
                if ( i == 2 || i == 5 ){
                    buttonsInCross[i][k].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, Color.BLACK));

                }
                if ((i == 2 && k == 2) || (i == 2 && k == 5) || (i == 5 && k == 2) || (i == 5 && k == 5) ){
                    buttonsInCross[i][k].setBorder(BorderFactory.createMatteBorder(1,1,4,4,Color.BLACK));
                }

                crossBoard.add(buttonsInCross[i][k]);
            }
        }
        int counter = 1;
            for (int i = 0; i < buttonsToSelect.length; i++) {
                for (int k = 0; k < buttonsToSelect[0].length; k++) {
                    buttonsToSelect[i][k] = new JButton(String.valueOf(counter));
                    buttonsToSelect[i][k].setFocusPainted(false);
                    buttonsToSelect[i][k].setContentAreaFilled(false);
                    buttonsToSelect[i][k].addMouseListener(this);
                    numbersPanel.add(buttonsToSelect[i][k]);
                    counter++;
                }
            }
        mainPanel.add(crossBoard);
        mainPanel.add(numbersPanel);
        add(mainPanel);
        setLocationRelativeTo(null);
        setVisible(true);
        setPreferredSize(new Dimension(500,400));
        pack();
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
