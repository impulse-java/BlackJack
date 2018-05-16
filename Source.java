// TODO: Set up JOptionPane for closing screen, implement card files, set up betting logic for "Game" class, set up "Score" category in "Game" class, setup final screen

package source;

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Files {
   ImageIcon image2C = new ImageIcon("2C.jpg")
   ImageIcon image2D = new ImageIcon("2D.jpg")
   ImageIcon image2H = new ImageIcon("2H.jpg")
   ImageIcon image2S = new ImageIcon("2S.jpg")
   ImageIcon image3C = new ImageIcon("3C.jpg")
   ImageIcon image3D = new ImageIcon("3D.jpg")
   ImageIcon image3H = new ImageIcon("3H.jpg")
   ImageIcon image3S = new ImageIcon("3S.jpg")
   ImageIcon image4C = new ImageIcon("4C.jpg")
   ImageIcon image4D = new ImageIcon("4D.jpg")
   ImageIcon image4H = new ImageIcon("4H.jpg")
   ImageIcon image4S = new ImageIcon("4S.jpg")
   ImageIcon image5C = new ImageIcon("5C.jpg")
   ImageIcon image5D = new ImageIcon("5D.jpg")
   ImageIcon image5H = new ImageIcon("5H.jpg")
   ImageIcon image5S = new ImageIcon("5S.jpg")
   ImageIcon image6C = new ImageIcon("6C.jpg")
   ImageIcon image6D = new ImageIcon("6D.jpg")
   ImageIcon image6H = new ImageIcon("6H.jpg")
   ImageIcon image6S = new ImageIcon("6S.jpg")
   ImageIcon image7C = new ImageIcon("7C.jpg")
   ImageIcon image7D = new ImageIcon("7D.jpg")
   ImageIcon image7H = new ImageIcon("7H.jpg")
   ImageIcon image7S = new ImageIcon("7S.jpg")
   ImageIcon image8C = new ImageIcon("8C.jpg")
   ImageIcon image8D = new ImageIcon("8D.jpg")
   ImageIcon image8H = new ImageIcon("8H.jpg")
   ImageIcon image8S = new ImageIcon("8S.jpg")
   ImageIcon image9C = new ImageIcon("9C.jpg")
   ImageIcon image9D = new ImageIcon("9D.jpg")
   ImageIcon image9H = new ImageIcon("9H.jpg")
   ImageIcon image9S = new ImageIcon("9S.jpg")
   ImageIcon image10C = new ImageIcon("10C.jpg")
   ImageIcon image10D = new ImageIcon("10D.jpg")
   ImageIcon image10H = new ImageIcon("10H.jpg")
   ImageIcon image10S = new ImageIcon("10S.jpg")
   ImageIcon imageAC = new ImageIcon("AC.jpg")
   ImageIcon imageAD = new ImageIcon("AD.jpg")
   ImageIcon imageAH = new ImageIcon("AH.jpg")
   ImageIcon imageAS = new ImageIcon("AS.jpg")
   ImageIcon imageJC = new ImageIcon("JC.jpg")
   ImageIcon imageJD = new ImageIcon("JD.jpg")
   ImageIcon imageJH = new ImageIcon("JH.jpg")
   ImageIcon imageJS = new ImageIcon("JS.jpg")
   ImageIcon imageKC = new ImageIcon("KC.jpg")
   ImageIcon imageKD = new ImageIcon("KD.jpg")
   ImageIcon imageKH = new ImageIcon("KH.jpg")
   ImageIcon imageKS = new ImageIcon("KS.jpg")
   ImageIcon imageQC = new ImageIcon("QC.jpg")
   ImageIcon imageQD = new ImageIcon("QD.jpg")
   ImageIcon imageQH = new ImageIcon("QH.jpg")
   ImageIcon imageQS = new ImageIcon("QS.jpg")
   ImageIcon imageback = new ImageIcon("Back.jpg")
   ImageIcon imagedisplay = new ImageIcon("Display.jpg")

       
     
       
                                   
                                   
                                   
                                   
                                   
       
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
    public JButton button, button2, button3;
    public int score;
    
    public Game() {
      button = new JButton("Leave Table");
      button.setLocation(465, 10);
      button.setSize(125, 25);
      button.addActionListener(this);
      getContentPane().add(button);  
      
      button2 = new JButton("Return");
      button2.setLocation(465, 45);
      button2.setSize(125, 25);
      button2.addActionListener(this);
      getContentPane().add(button2); 
      
      button3 = new JButton("Deal");
      button3.setLocation(10, 10);
      button3.setSize(125, 25);
      button3.addActionListener(this);
      getContentPane().add(button3); 
      
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
        if(e.getSource() == button2) {
            super.dispose();
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
