// TODO: Set up JOptionPane for closing screen, set up betting logic for "Game" class, set up "Score" category in "Game" class

package source;

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Files {
   ImageIcon image2C = new ImageIcon("2C.jpg");
   ImageIcon image2D = new ImageIcon("2D.jpg");
   ImageIcon image2H = new ImageIcon("2H.jpg");
   ImageIcon image2S = new ImageIcon("2S.jpg");
   ImageIcon image3C = new ImageIcon("3C.jpg");
   ImageIcon image3D = new ImageIcon("3D.jpg");
   ImageIcon image3H = new ImageIcon("3H.jpg");
   ImageIcon image3S = new ImageIcon("3S.jpg");
   ImageIcon image4C = new ImageIcon("4C.jpg");
   ImageIcon image4D = new ImageIcon("4D.jpg");
   ImageIcon image4H = new ImageIcon("4H.jpg");
   ImageIcon image4S = new ImageIcon("4S.jpg");
   ImageIcon image5C = new ImageIcon("5C.jpg");
   ImageIcon image5D = new ImageIcon("5D.jpg");
   ImageIcon image5H = new ImageIcon("5H.jpg");
   ImageIcon image5S = new ImageIcon("5S.jpg");
   ImageIcon image6C = new ImageIcon("6C.jpg");
   ImageIcon image6D = new ImageIcon("6D.jpg");
   ImageIcon image6H = new ImageIcon("6H.jpg");
   ImageIcon image6S = new ImageIcon("6S.jpg");
   ImageIcon image7C = new ImageIcon("7C.jpg");
   ImageIcon image7D = new ImageIcon("7D.jpg");
   ImageIcon image7H = new ImageIcon("7H.jpg");
   ImageIcon image7S = new ImageIcon("7S.jpg");
   ImageIcon image8C = new ImageIcon("8C.jpg");
   ImageIcon image8D = new ImageIcon("8D.jpg");
   ImageIcon image8H = new ImageIcon("8H.jpg");
   ImageIcon image8S = new ImageIcon("8S.jpg");
   ImageIcon image9C = new ImageIcon("9C.jpg");
   ImageIcon image9D = new ImageIcon("9D.jpg");
   ImageIcon image9H = new ImageIcon("9H.jpg");
   ImageIcon image9S = new ImageIcon("9S.jpg");
   ImageIcon image10C = new ImageIcon("10C.jpg");
   ImageIcon image10D = new ImageIcon("10D.jpg");
   ImageIcon image10H = new ImageIcon("10H.jpg");
   ImageIcon image10S = new ImageIcon("10S.jpg");
   ImageIcon imageAC = new ImageIcon("AC.jpg");
   ImageIcon imageAD = new ImageIcon("AD.jpg");
   ImageIcon imageAH = new ImageIcon("AH.jpg");
   ImageIcon imageAS = new ImageIcon("AS.jpg");
   ImageIcon imageJC = new ImageIcon("JC.jpg");
   ImageIcon imageJD = new ImageIcon("JD.jpg");
   ImageIcon imageJH = new ImageIcon("JH.jpg");
   ImageIcon imageJS = new ImageIcon("JS.jpg");
   ImageIcon imageKC = new ImageIcon("KC.jpg");
   ImageIcon imageKD = new ImageIcon("KD.jpg");
   ImageIcon imageKH = new ImageIcon("KH.jpg");
   ImageIcon imageKS = new ImageIcon("KS.jpg");
   ImageIcon imageQC = new ImageIcon("QC.jpg");
   ImageIcon imageQD = new ImageIcon("QD.jpg");
   ImageIcon imageQH = new ImageIcon("QH.jpg");
   ImageIcon imageQS = new ImageIcon("QS.jpg");
   ImageIcon imageback = new ImageIcon("Back.jpg");
   ImageIcon imagedisplay = new ImageIcon("Display.jpg");                                  
   
}

class TitleScreen extends JFrame implements ActionListener {
    
    public JLabel welcome;
    public JLabel bgLabel;
    public JButton lp;
    
    public TitleScreen() {
      // Title Screen constructor, practically finished, maybe a few finishing touches
        
      welcome = new JLabel("Welcome to BlackJack!");
      welcome.setForeground(Color.black);
      welcome.setFont(new Font("Bodoni MT", Font.PLAIN, 24));
      welcome.setLocation(175, 20);
      welcome.setSize(300, 300);
      getContentPane().add(welcome);
      
      lp = new JButton("Let's Play!");
      lp.setLocation(250, 224);
      lp.setSize(100, 25);
      lp.addActionListener(this);
      getContentPane().add(lp);
              
      ImageIcon image = new ImageIcon("felt.jpg");
      bgLabel = new JLabel(image);
      bgLabel.setLocation(0, 0);
      bgLabel.setSize(image.getIconWidth(), image.getIconHeight());
      getContentPane().add(bgLabel);
      
      setTitle("Welcome!");
      setLayout(null);
      setSize(612, 408);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      getContentPane().setBackground(null);
      setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == lp) {
            Game gamePortal = new Game();
            // Instantiates "Game" class that runs the code in the main class
        }
    }
}

class Game extends JFrame implements ActionListener {
    
    public JLabel bgLabel;
    public JButton lt;
    public JButton rtn;
    public JButton deal;
    public int score;
    
    public Game() {
      // Main constructor, all logic for running the game will be here
      
      lt = new JButton("Leave Table");
      lt.setLocation(465, 10);
      lt.setSize(125, 25);
      lt.addActionListener(this);
      getContentPane().add(lt);  
      
      rtn = new JButton("Return");
      rtn.setLocation(465, 45);
      rtn.setSize(125, 25);
      rtn.addActionListener(this);
      getContentPane().add(rtn); 
      
      deal = new JButton("Deal");
      deal.setLocation(10, 10);
      deal.setSize(125, 25);
      deal.addActionListener(this);
      getContentPane().add(deal); 
      
      ImageIcon image = new ImageIcon("felt.jpg");
      bgLabel = new JLabel(image);
      bgLabel.setLocation(0, 0);
      bgLabel.setSize(image.getIconWidth(), image.getIconHeight());
      getContentPane().add(bgLabel);  
      
      setTitle("BlackJack");
      setLayout(null);
      setSize(612, 408);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      getContentPane().setBackground(null);
      setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == lt) {
            EndScreen scoreTable = new EndScreen();
        }
        if(e.getSource() == rtn) {
            super.dispose();
        }
    }
}

class EndScreen extends JFrame implements ActionListener {
    
    public JLabel nameLabel;
    public JLabel bgLabel;
    public JLabel label2;
    public JButton button;
    public JTextField eName;
    public JLabel hs1;
    public JLabel hs2;
    public JLabel hs3;
    public String temp1 = "AAA";
    public String temp2 = "BBB";
    public String temp3 = "CCC";
    
    public EndScreen() {
      // End Screen constructor, almost done as well, just need to have names written to file.
      
      nameLabel = new JLabel("Enter your name: ");
      nameLabel.setForeground(Color.black);
      nameLabel.setFont(new Font("Bodoni MT", Font.PLAIN, 24));
      nameLabel.setLocation(220, 20);
      nameLabel.setSize(300, 300);
      getContentPane().add(nameLabel);
      
      label2 = new JLabel("HIGH SCORES: ");
      label2.setForeground(Color.black);
      label2.setFont(new Font("Bodoni MT", Font.PLAIN, 24));
      label2.setLocation(220, -128);
      label2.setSize(300, 300);
      getContentPane().add(label2);
      
      eName = new JTextField(120);
      eName.setLocation(250, 50);
      eName.setText("");
      eName.setSize(120, 20);
      getContentPane().add(eName);
      
      hs1.setLocation(12,75);
      hs1.setText("");
      hs1.setSize(120, 20);
      getContentPane().add(hs1);
      
      hs2.setLocation(12,75);
      hs2.setText("");
      hs2.setSize(120, 20);
      getContentPane().add(hs2);
      
      hs3.setLocation(12,75);
      hs3.setText("");
      hs3.setSize(120, 20);
      getContentPane().add(hs3);
      
      ImageIcon image = new ImageIcon("felt.jpg");
      bgLabel = new JLabel(image);
      bgLabel.setLocation(0, 0);
      bgLabel.setSize(image.getIconWidth(), image.getIconHeight());
      getContentPane().add(bgLabel);  
      
      setTitle("High Scores");
      setLayout(null);
      setSize(612, 408);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      getContentPane().setBackground(null);
      setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        
    }
}

public class Source {

    public static void main(String[] args) {
        TitleScreen wizard = new TitleScreen();
    }
    
}

