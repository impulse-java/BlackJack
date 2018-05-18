// TODO: Set up "Score" category in "Game" class, finish up betting logic in "Game" class, assign values to cards and make dealing function

package source;

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Files {
   
   int[] cValue = new int[52];
   ImageIcon[] arr = new ImageIcon[53];
   
   public Files() {
       
       arr[0] = new ImageIcon("Back.jpg");
       arr[1] = new ImageIcon("AS.jpg");
       arr[2] = new ImageIcon("2S.jpg");
       arr[3] = new ImageIcon("3S.jpg");
       arr[4] = new ImageIcon("4S.jpg");
       arr[5] = new ImageIcon("5S.jpg");
       arr[6] = new ImageIcon("6S.jpg");
       arr[7] = new ImageIcon("7S.jpg");
       arr[8] = new ImageIcon("8S.jpg");
       arr[9] = new ImageIcon("9S.jpg");
       arr[10] = new ImageIcon("10S.jpg");
       arr[11] = new ImageIcon("JS.jpg");
       arr[12] = new ImageIcon("QS.jpg");
       arr[13] = new ImageIcon("kS.jpg");
       arr[14] = new ImageIcon("AC.jpg");
       arr[15] = new ImageIcon("2C.jpg");
       arr[16] = new ImageIcon("3C.jpg");
       arr[17] = new ImageIcon("4C.jpg");
       arr[18] = new ImageIcon("5C.jpg");
       arr[19] = new ImageIcon("6C.jpg");
       arr[20] = new ImageIcon("7C.jpg");
       arr[21] = new ImageIcon("8C.jpg");
       arr[22] = new ImageIcon("9C.jpg");
       arr[23] = new ImageIcon("10C.jpg");
       arr[24] = new ImageIcon("JC.jpg");
       arr[25] = new ImageIcon("QC.jpg");
       arr[26] = new ImageIcon("KC.jpg");
       arr[27] = new ImageIcon("AD.jpg");
       arr[28] = new ImageIcon("2D.jpg");
       arr[29] = new ImageIcon("3D.jpg");
       arr[30] = new ImageIcon("4D.jpg");
       arr[31] = new ImageIcon("5D.jpg");
       arr[32] = new ImageIcon("6D.jpg");
       arr[33] = new ImageIcon("7D.jpg");
       arr[34] = new ImageIcon("8D.jpg");
       arr[35] = new ImageIcon("9D.jpg");
       arr[36] = new ImageIcon("10D.jpg");
       arr[37] = new ImageIcon("JD.jpg");
       arr[38] = new ImageIcon("QD.jpg");
       arr[39] = new ImageIcon("KD.jpg");
       arr[40] = new ImageIcon("AH.jpg");
       arr[41] = new ImageIcon("2H.jpg");
       arr[42] = new ImageIcon("3H.jpg");
       arr[43] = new ImageIcon("4H.jpg");
       arr[44] = new ImageIcon("5H.jpg");
       arr[45] = new ImageIcon("6H.jpg");
       arr[46] = new ImageIcon("7H.jpg");
       arr[47] = new ImageIcon("8H.jpg");
       arr[48] = new ImageIcon("9H.jpg");
       arr[49] = new ImageIcon("10H.jpg");
       arr[50] = new ImageIcon("JH.jpg");
       arr[51] = new ImageIcon("QH.jpg");
       arr[52] = new ImageIcon("KH.jpg");
       
   }
   
   
    
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
        if(e.getSource() == deal) {
           
            }
    }
}

class Game extends JFrame implements ActionListener {
    
    public JLabel bgLabel;
    public JButton lt;
    public JButton rtn;
    public JButton deal;
    public JTextField betField;
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
      
      betField = new JTextField(120);
      betField.setLocation(220, 40);
      betField.setText("");
      betField.setSize(120, 20);
      getContentPane().add(betField);
      
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
       if(e.getSource() == deal){
            int random = (int)(Math.random()*52)
            arr[random] =   
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
