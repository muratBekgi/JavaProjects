public class LabTest_01 {
    public static void main(String[] args) {

    Stock information = new Stock("ORCL", "Oracle Corporation");
    information.setPreviousClosingPrice(34.5);
    information.setCurrentPrice(34.35);

        System.out.println("Symbol is: "+information.symbol);
        System.out.println("Name is: "+information.name);
        System.out.printf("Price-Change percentage is: %,.3f",information.getChangePercent());
        System.out.print("%");
    }
}

class Stock{
    String symbol;
    String name;
    private double previousClosingPrice;
    private double currentPrice;

    Stock(){}
    Stock(String newSymbol, String newName){symbol=newSymbol; name=newName;}

  public String getSymbol(){return symbol;}
  public String getName(){return name;}
  double getChangePercent(){return ((currentPrice-previousClosingPrice)*100/currentPrice);}

  public void setSymbol(String newSymbol){symbol=newSymbol;}
  public void setName(String newName){name=newName;}
  void setPreviousClosingPrice(double previousClosingPrice1){previousClosingPrice=previousClosingPrice1;}
  void setCurrentPrice(double currentPrice1){currentPrice=currentPrice1;}

}
