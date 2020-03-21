public class DeckOfCards {
    public static void main(String [] args){
        java.util.Scanner input=new java.util.Scanner(System.in);

        int [] deckOfCArds=new int[52];
        //                 0-12     13-25     26-38      39-51
        String [] suits={"Spades", "Hearts", "Diamonds", "Clubs"};
        String [] ranks={"Ace", "2","3","4","5","6","7","8","9","10","Jack","Queen","King"};



        for(int i=0; i<deckOfCArds.length; i++){
            deckOfCArds[i]=i;
        }

        for(int i=0; i<deckOfCArds.length;i++){
            int x=(int)(Math.random()*deckOfCArds.length);
            int temp=deckOfCArds[i];
            deckOfCArds[i]=deckOfCArds[x];
            deckOfCArds[x]=temp;
        }

        for(int i=0; i<4; i++){
            String suit=suits[deckOfCArds[i]/13];
            String rank=ranks[deckOfCArds[i]%13];
            System.out.println("Card number "+deckOfCArds[i]+": "+rank+" of "+suit);
        }
    }
}
