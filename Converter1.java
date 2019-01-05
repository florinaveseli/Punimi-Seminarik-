import java.awt.*; 
import javax.swing.*;
import java.util.Scanner;
import java.text.*;
public class Converter1 extends JPanel { 
   public Converter1() { 
  
      JFrame frame = new JFrame(); 
      frame.getContentPane().add(this); 
      int height = 200; 
      frame.setSize((3 * height)/2, height); 
      frame.setVisible(true); 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           }




  Converter objm = new Converter();
 

   Scanner sc = new Scanner(System.in);
   String input_money = sc.nextLine();
   String output_money = sc.nextLine();

   double valuta = sc.nextDouble();
   double amount = new Double(JOptionPane.showInputDialog("Please write the amount of money")).doubleValue();

 
   double money = objm.moneyConvertor(amount,valuta);
  
 
  
  
  
   public void paintComponent(Graphics g) { 
     DecimalFormat formatter = new DecimalFormat("0.00");
   int xpos = 50;
   int ypos = 50;
   
   int money1 = (int)money;
 
   int amount1 = (int)amount;
   int width2 = money1;
   int width1 = amount1 ;
   g.setColor(Color.red);
   g.fillOval(xpos,ypos,width1,width1);
   g.fillOval(xpos+350,ypos,width2,width2);
       
      g.setColor(Color.black); 
      int margin = 25; 
      int line_height = 80; 
      int first_line = 100; 
      int baseline = first_line + line_height; 
     
       g.drawString(amount+" " +input_money , xpos+width1/2,ypos+width1/2);
     
       g.drawString(formatter.format(money)+" "+ output_money,xpos+350+width2/2, ypos+width2/2);
   }

}