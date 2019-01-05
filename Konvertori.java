import javax.swing.*;
import java.awt.*;
import java.text.*;
public class Konvertori extends JPanel{
private int w;
private int  h;
private int xpos;
private int  ypos;


public Konvertori(int w, int h){
this.w   = w;
this.h=h;

JFrame obj = new JFrame();
obj.getContentPane().add(this);
obj.setSize(w,h);
obj.setTitle("Konvertori");
obj.setVisible(true);


}
Konvertori1 objk = new Konvertori1();
String input = objk.getc1();
String output = objk.getc2();
double valuta = objk.getvaluta();
double amount = new Double(JOptionPane.showInputDialog("Please write the amount of money")).doubleValue();


double money = objk.moneyConverter(amount,valuta);


 public void paintComponent(Graphics g){
 DecimalFormat formatter = new DecimalFormat("0.00");
  
  int xpos = 50;
  int ypos = 50;
   
 int money1 =(int)money;
 int amount1 = (int)amount;
 int width1 = money1+50;
 int width2 = amount1+50;
 
 g.setColor(Color.blue);
 g.fillOval(xpos,ypos,width2,width2);
 g.setColor(Color.red);
 g.fillOval(xpos+350,ypos, width1,width1);
 g.setColor(Color.black);
 
      int line_height = 80; 
      int first_line = 100; 
     
      int baseline = first_line + line_height;
      
 g.drawString(amount+" "+input,xpos+width1/2,ypos+width1/2);
 g.drawString(formatter.format(money)+" "+output,xpos+350+width2/2, ypos+width2/2);
 
 }
 
}
