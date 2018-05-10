// TODO: Adjust position of "label2" in "Welcome" class, set up JOptionPane for closing screen, implement card files

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
    
    public TitleScreen() {
        
      setTitle("Welcome!");
      setLayout(null);
      setSize(612, 408);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      getContentPane().setBackground(null);
      setVisible(true);
      
      // Fixed TODO: Moved instantiation above attributes
      label = new JLabel("Welcome to BlackJack!");
      label.setForeground(Color.black);
      label.setFont(new Font("Bodoni MT", Font.PLAIN, 24));
      label.setLocation(306, 204);
      label.setSize(300, 300);
      getContentPane().add(this);
      
      ImageIcon image = new ImageIcon("felt.jpg");
      label2 = new JLabel(image);
      label2.setLocation(0, 0);
      label2.setSize(image.getIconWidth(), image.getIconHeight());
      getContentPane().add(label2);
    }
    
    public void actionPerformed(ActionEvent e) {
        
    }
}

class Game extends JFrame implements ActionListener {
    
    public Game() {
        
    }
    
    public void actionPerformed(ActionEvent e) {
        
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
