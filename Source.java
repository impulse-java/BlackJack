// TODO: Set up "Score" category in "Game" class, finish up betting logic in "Game" class, integrate cards into "Game" class

package source;

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Files {
   
   // Club Cards
   public static ImageIcon imageAC = new ImageIcon("AC.jpg");
   public static ImageIcon image2C = new ImageIcon("2C.jpg");
   public static ImageIcon image3C = new ImageIcon("3C.jpg");
   public static ImageIcon image4C = new ImageIcon("4C.jpg");
   public static ImageIcon image5C = new ImageIcon("5C.jpg");
   public static ImageIcon image6C = new ImageIcon("6C.jpg");
   public static ImageIcon image7C = new ImageIcon("7C.jpg");
   public static ImageIcon image8C = new ImageIcon("8C.jpg");
   public static ImageIcon image9C = new ImageIcon("9C.jpg");
   public static ImageIcon image10C = new ImageIcon("10C.jpg");
   public static ImageIcon imageJC = new ImageIcon("JC.jpg");
   public static ImageIcon imageQC = new ImageIcon("QC.jpg");
   public static ImageIcon imageKC = new ImageIcon("KC.jpg");
   
   // Diamond Cards
   public static ImageIcon imageAD = new ImageIcon("AD.jpg");
   public static ImageIcon image2D = new ImageIcon("2D.jpg");
   public static ImageIcon image3D = new ImageIcon("3D.jpg");
   public static ImageIcon image4D = new ImageIcon("4D.jpg");
   public static ImageIcon image5D = new ImageIcon("5D.jpg");
   public static ImageIcon image6D = new ImageIcon("6D.jpg");
   public static ImageIcon image7D = new ImageIcon("7D.jpg");
   public static ImageIcon image8D = new ImageIcon("8D.jpg");
   public static ImageIcon image9D = new ImageIcon("9D.jpg");
   public static ImageIcon image10D = new ImageIcon("10D.jpg");
   public static ImageIcon imageJD = new ImageIcon("JD.jpg");
   public static ImageIcon imageQD = new ImageIcon("QD.jpg");
   public static ImageIcon imageKD = new ImageIcon("KD.jpg");
   
   // Heart Cards
   public static ImageIcon imageAH = new ImageIcon("AH.jpg");
   public static ImageIcon image2H = new ImageIcon("2H.jpg");
   public static ImageIcon image3H = new ImageIcon("3H.jpg");
   public static ImageIcon image4H = new ImageIcon("4H.jpg");
   public static ImageIcon image5H = new ImageIcon("5H.jpg");
   public static ImageIcon image6H = new ImageIcon("6H.jpg");
   public static ImageIcon image7H = new ImageIcon("7H.jpg");
   public static ImageIcon image8H = new ImageIcon("8H.jpg");
   public static ImageIcon image9H = new ImageIcon("9H.jpg");
   public static ImageIcon image10H = new ImageIcon("10H.jpg");
   public static ImageIcon imageJH = new ImageIcon("JH.jpg");
   public static ImageIcon imageQH = new ImageIcon("QH.jpg");
   public static ImageIcon imageKH = new ImageIcon("KH.jpg");
   
   // Ace Cards
   public static ImageIcon imageAS = new ImageIcon("AS.jpg");
   public static ImageIcon image2S = new ImageIcon("2S.jpg");
   public static ImageIcon image3S = new ImageIcon("3S.jpg");
   public static ImageIcon image4S = new ImageIcon("4S.jpg");
   public static ImageIcon image5S = new ImageIcon("5S.jpg");
   public static ImageIcon image6S = new ImageIcon("6S.jpg");
   public static ImageIcon image7S = new ImageIcon("7S.jpg");
   public static ImageIcon image8S = new ImageIcon("8S.jpg");
   public static ImageIcon image9S = new ImageIcon("9S.jpg");
   public static ImageIcon image10S = new ImageIcon("10S.jpg");
   public static ImageIcon imageJS = new ImageIcon("JS.jpg");
   public static ImageIcon imageQS = new ImageIcon("QS.jpg");
   public static ImageIcon imageKS = new ImageIcon("KS.jpg");
   
   // Back and Display cards
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
    public static int tempScore = 5256;
    public static int userScore = 0;
    
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
    public JLabel hsLabel;
    public JTextField eName;
    public JLabel hs1;
    public JButton enter;
    public JButton exit;
    public String temp1 = "AAA";
    
    public EndScreen() {
      // End Screen constructor, almost done as well, just need to have names written to file.
      
      hsLabel = new JLabel("HIGH SCORE: ");
      hsLabel.setForeground(Color.black);
      hsLabel.setFont(new Font("Bodoni MT", Font.PLAIN, 24));
      hsLabel.setLocation(220, 20);
      hsLabel.setSize(300, 300);
      getContentPane().add(hsLabel);
      
      nameLabel = new JLabel("Enter your name: ");
      nameLabel.setForeground(Color.black);
      nameLabel.setFont(new Font("Bodoni MT", Font.PLAIN, 24));
      nameLabel.setLocation(220, -128);
      nameLabel.setSize(300, 300);
      getContentPane().add(nameLabel);
      
      hs1 = new JLabel(temp1 + " - " + Game.tempScore);
      hs1.setForeground(Color.black);
      hs1.setFont(new Font("Bodoni MT", Font.PLAIN, 24));
      hs1.setLocation(240, 60);
      hs1.setSize(300, 300);
      getContentPane().add(hs1);
      
      eName = new JTextField(120);
      eName.setLocation(220, 40);
      eName.setText("");
      eName.setSize(120, 20);
      getContentPane().add(eName);
      
      enter = new JButton("Enter");
      enter.setLocation(350, 40);
      enter.setSize(85, 21);
      enter.addActionListener(this);
      getContentPane().add(enter); 
      
      exit = new JButton("Exit");
      exit.setLocation(505, 338);
      exit.setSize(85, 21);
      exit.addActionListener(this);
      getContentPane().add(exit); 
      
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
        if(e.getSource() == enter) {
            String tempStr = eName.getText();
            if(Game.userScore > Game.tempScore) {
                hs1.setText(tempStr + " - " + Game.userScore);
                JOptionPane.showMessageDialog(null, "You have the new high-score!");
                return;
            }
            else {
                JOptionPane.showMessageDialog(null, "You didn't beat the new high-score... ");
            }
        }
        if(e.getSource() == exit) {
            JOptionPane.showMessageDialog(null, "Your scores will not be saved...");
            System.exit(0);
        }
    }
}

public class Source {

    public static void main(String[] args) {
        TitleScreen wizard = new TitleScreen();
    }
    
}
