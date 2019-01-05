class Konvertori1 {
static String c1;
static String c2;
static double valuta;
public static void main(String [] args){
   c1 = args[0];
   c2 = args[1];
  valuta = new Double(args[2]).doubleValue();
  Konvertori obj = new Konvertori(300,200);

 
}

 public static double moneyConverter(double amount,double valuta){
 return amount*valuta ;
 }
 
 public static String getc1() {
    return c1;
  }
  
  public static String getc2() {
    return c2;
  }
  
  public static double getvaluta() {
    return valuta;
  }

}