public class CountingTheOccurencesOfEachLetter {
    public static void main(String [] args){
        java.util.Scanner input=new java.util.Scanner(System.in);



        char [] List=new char[100];
int   counta=0,countb=0,countc=0,countd=0,counte=0,countf=0,countg=0,counth=0,counti=0,countj=0,countk=0,
        countl=0,countm=0,countn=0,counto=0,countp=0,countq=0,countr=0,counts=0,countt=0,countu=0,
        countv=0,countw=0, countx=0,county=0,countz=0;
//int totalLettes=0;
        for(int i=0; i<List.length;i++){

            int characters=(int)(97+Math.random()*(122-97+1));
            char ch=(char)characters;
        System.out.print(ch+" ");
             if(ch=='a'){
                counta++;
                }
             if(ch=='b'){
                countb++;
             }
              if(ch=='c'){
                 countc++;
             }
              if(ch=='d'){
                 countd++;
             }
              if(ch=='e'){
                 counte++;
             }
              if(ch=='f'){
                 countf++;
             }
             if(ch=='g'){
                 countg++;
             }
             if(ch=='h'){
                 counth++;
             }
              if(ch=='i'){
                 counti++;
             }
              if(ch=='j'){
                 countj++;
             }
              if(ch=='k'){
                 countk++;
             }
              if(ch=='l'){
                 countl++;
             }
              if(ch=='m'){
                 countm++;
             }
              if(ch=='n'){
                 countn++;
             }
             if(ch=='o'){
                 counto++;
             }
              if(ch=='p'){
                 countp++;
             }
              if(ch=='q'){
                 countq++;
             }
             if(ch=='r'){
                 countr++;
             }
              if(ch=='s'){
                 counts++;
             }
            if(ch=='t'){
                 countt++;
             }
              if(ch=='u'){
                 countu++;
             }
              if(ch=='v'){
                 countv++;
             }
              if(ch=='w'){
                 countw++;
             }
            if (ch=='x'){
                 countx++;
             }
             if(ch=='y'){
                 county++;
             }
             if(ch=='z'){
                 countz++;
             }



        }
        System.out.print("\nA is repeaded: "+counta+" times");
        System.out.print("\nB is repeaded: "+countb+" times");
        System.out.print("\nC is repeaded: "+counta+" times");
        System.out.print("\nD is repeaded: "+countb+" times");
        System.out.print("\nE is repeaded: "+counta+" times");
        System.out.print("\nF is repeaded: "+countb+" times");
        System.out.print("\nG is repeaded: "+counta+" times");
        System.out.print("\nH is repeaded: "+countb+" times");
        System.out.print("\nI is repeaded: "+counta+" times");
        System.out.print("\nJ is repeaded: "+countb+" times");
        System.out.print("\nK is repeaded: "+counta+" times");
        System.out.print("\nL is repeaded: "+countb+" times");
        System.out.print("\nM is repeaded: "+counta+" times");
        System.out.print("\nN is repeaded: "+countb+" times");
        System.out.print("\nO is repeaded: "+counta+" times");
        System.out.print("\nP is repeaded: "+countb+" times");
        System.out.print("\nQ is repeaded: "+counta+" times");
        System.out.print("\nR is repeaded: "+countb+" times");
        System.out.print("\nS is repeaded: "+counta+" times");
        System.out.print("\nT is repeaded: "+countb+" times");
        System.out.print("\nU is repeaded: "+counta+" times");
        System.out.print("\nV is repeaded: "+countb+" times");
        System.out.print("\nW is repeaded: "+counta+" times");
        System.out.print("\nX is repeaded: "+countb+" times");
        System.out.print("\nY is repeaded: "+counta+" times");
        System.out.print("\nZ is repeaded: "+countb+" times");


    }
}
