// TODO: Set up JOptionPane for closing screen, implement card files, set up betting logic for "Game" class

package source;

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Files {
    
}

class Cards {
    public ImageIcon img;
}

class TitleScreen extends JFrame implements ActionListener {
    
    public JLabel label;
    public JLabel label2;
    public JButton button;
    
    public TitleScreen() {
        
      
      
      label = new JLabel("Welcome to BlackJack!");
      label.setForeground(Color.black);
      label.setFont(new Font("Bodoni MT", Font.PLAIN, 24));
      label.setLocation(175, 20);
      label.setSize(300, 300);
      getContentPane().add(label);
      
      button = new JButton("Let's Play!");
      button.setLocation(250, 224);
      button.setSize(100, 25);
      button.addActionListener(this);
      getContentPane().add(button);
              
      ImageIcon image = new ImageIcon("felt.jpg");
      label2 = new JLabel(image);
      label2.setLocation(0, 0);
      label2.setSize(image.getIconWidth(), image.getIconHeight());
      getContentPane().add(label2);
      
      setTitle("Welcome!");
      setLayout(null);
      setSize(612, 408);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      getContentPane().setBackground(null);
      setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            Game gamePortal = new Game();
        }
    }
}

class Game extends JFrame implements ActionListener {
    
    public JLabel label, label2, label3, label4;
    public JButton button;
    public int score;
    
    public Game() {
      button = new JButton("Leave Table");
      button.setLocation(465, 10);
      button.setSize(125, 25);
      button.addActionListener(this);
      getContentPane().add(button);  
      
      ImageIcon image = new ImageIcon("felt.jpg");
      label = new JLabel(image);
      label.setLocation(0, 0);
      label.setSize(image.getIconWidth(), image.getIconHeight());
      getContentPane().add(label);  
      
      setTitle("BlackJack");
      setLayout(null);
      setSize(612, 408);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      getContentPane().setBackground(null);
      setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            EndScreen scoreTable = new EndScreen();
        }
    }
}

class EndScreen extends JFrame implements ActionListener {
    
    public EndScreen() {
        
    }
    public void actionPerformed(ActionEvent e) {
        
    }
}

public class Source {

    public static void main(String[] args) {
        TitleScreen wizard = new TitleScreen();
    }
    
}
