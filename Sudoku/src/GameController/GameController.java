package com.sudoku;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.io.BufferedWriter;
import java.io.*;
import java.nio.file.*;

public class GameController extends JFrame implements ActionListener, MouseListener{

    private JPanel minespan = new JPanel(new GridLayout(9,9));
    public static void main(String[] args) {
        System.out.println("Main 2");
    }
}
