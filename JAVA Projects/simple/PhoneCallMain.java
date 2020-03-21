abstract class PhoneCall
    {

        String phoneNumber;
        double price;

         PhoneCall(String phoneNumber)
        {
            this.phoneNumber =  phoneNumber;
            this.price = 0.0;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }

        public double getPrice() {
            return price;
        }

        public abstract void setPrice();

    }
    class IncomingPhoneCall extends PhoneCall {

        final static double RATE=0.02;
         IncomingPhoneCall(String phoneNumber){
            super(phoneNumber);
            setPrice();
        }
        public void setPrice() {
            price = 0.02;
        }
         void info(){
            System.out.println("Incoming phone call"+getPhoneNumber()+
                    " "+RATE+" per call.Total is $"+getPrice());
        }
          public String getPhoneNumber()
          {
              return phoneNumber;
          }
          public double getPrice()
          {
              return price;
          }

    }
    class OutgoingPhoneCall extends PhoneCall {

        final static double RATE = 0.04;
        private int minutes;
         OutgoingPhoneCall(String phoneNumber, int minutes){
            super(phoneNumber);
            this.minutes = minutes;
            setPrice();;
        }
        public void setPrice() {
            price = 0.04;
        }
        void info() {
            System.out.println("Outgoing phone call " + getPhoneNumber() + " "
                    + RATE + " per minute at " + minutes + " minutes. Total is $" + price*minutes);
        }
         public String getPhoneNumber()
         {
             return phoneNumber;
         }
         public double getPrice()
         {
             return price;
         }

    }


public class PhoneCallMain {
    public static void main(String [] args) {

        IncomingPhoneCall incomingPhoneCall=new IncomingPhoneCall("310-332-0908");
        OutgoingPhoneCall outgoingPhoneCall=new OutgoingPhoneCall("310-000-0102",20);

        incomingPhoneCall.info();
        outgoingPhoneCall.info();
    }
}
