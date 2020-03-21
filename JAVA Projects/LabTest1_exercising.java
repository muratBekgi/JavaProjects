public class LabTest1_exercising {
    public static void main(String [] args){

        Stock1 stock=new Stock1("ORCL", "Oracle Corporation");
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        System.out.println("Name is: "+stock.getName()+"\nSymbol is: "+stock.getSymbol());
        System.out.println("Price change percentage is: "+stock.getChangePercent()+"%");
    }
}

class Stock1{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock1(String symbol, String name){this.symbol=symbol; this.name=name;}

    public double getChangePercent(){return (previousClosingPrice-currentPrice)*100/currentPrice;}
    public String getSymbol(){return symbol;}
    public String getName(){return name;}

    public void setSymbol(String symbol){ this.symbol=symbol;}
    public void setName(String name){this.name=name;}
    public void setPreviousClosingPrice(double previousClosingPrice){this.previousClosingPrice=previousClosingPrice;}
    public void setCurrentPrice(double currentPrice){this.currentPrice=currentPrice;}
}
