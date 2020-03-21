class PreferredCustomer {
    private String custName;
    private int custID;
    private String address;
    private String telNumber;
    private boolean mailStatus;
    private double purchase;
    private double discountPurchase;

    PreferredCustomer(String custName,String address, String telNumber, int custID,
                      boolean mailStatus, double purchase){
        this.custName=custName;
        this.custID=custID;
        this.address=address;
        this.telNumber=telNumber;
        this.mailStatus=mailStatus;
        this.purchase=purchase;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public void setMailStatus(boolean mailStatus) {
        this.mailStatus = mailStatus;
    }

    public void setPurchase(double purchase) {
        this.purchase = purchase;
    }

    public void setDiscountPurchase(double discountPurchase) {
        this.discountPurchase = discountPurchase;
    }

    public String getCustName() {
        return custName;
    }

    public int getCustID() {
        return custID;
    }

    public String getAddress() {
        return address;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public double getPurchase() {
        if(purchase>=500 && purchase<1000)
            discountPurchase = 5.0;
        if(purchase>=1000 && purchase<1500)
            discountPurchase=6.0;
        if(purchase>=1500 && purchase<2000)
            discountPurchase=7.0;
        if(purchase>=2000)
            discountPurchase=10.0;
        return purchase;

    }
    private double getDiscountPurchase() {
        return discountPurchase;
    }
    private boolean isMailStatus(){
        return mailStatus;
    }

    public String toString (){
        return "Cust Name: "+getCustName()+"\nCustID: "+getCustID()+"\nTelephone Number: "+getTelNumber()
                +"\nMail List Status: "+isMailStatus()+"\nPurchase: "+getPurchase()+"\nDiscount Percent: "
                +getDiscountPurchase()+"\nAddress:"+getAddress();

    }
}

   public class PreferredCustomerDemo{
      public static void main(String [] args){

          PreferredCustomer pc=new PreferredCustomer("Men Senli","San Diego","210434309",
                  123,true,600);
          System.out.println(pc.toString()+"\n");

          PreferredCustomer pc2=new PreferredCustomer("Nazar J","LA CA","43t34535",
                  4213, false, 2600);

          System.out.println(pc2.toString());

    }


}
