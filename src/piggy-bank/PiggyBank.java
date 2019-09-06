package piggy-bank;
import java.text.DecimalFormat;

public class PiggyBank {
    //declares empty coin/dollar variables for me to work with
    private Quarter myQuarter;
    private Dollar myDollar;
    private Dime myDime;
    private Nickel myNickel;
    private Penny myPenny;

    //adds value based on money type
    public void add(Coin added){
        if(added instanceof Quarter){
            myQuarter=(Quarter)added;
        }else if(added instanceof Dollar){
            myDollar=(Dollar)added;
        }else if(added instanceof Dime){
            myDime=(Dime)added;
        }else if(added instanceof Nickel){
            myNickel=(Nickel)added;
        }else if(added instanceof Penny){
            myPenny=(Penny)added;
        }
    }

    //prints the bank amount
    public void printBank(){
        DecimalFormat fp = new DecimalFormat("$###,###.00");
        System.out.println("The Piggy Bank Holds "+fp.format(total()));
    }

    //gets current total and converts to dollar amount.
    private double total(){
        double total=0;
        total+=(myQuarter.getTotal()/100.0);
        total+=(myDollar.getTotal()/100.0);
        total+=(myDime.getTotal()/100.0);
        total+=(myPenny.getTotal()/100.0);
        total+=(myNickel.getTotal()/100.0);
        return total;
    }
    //checks how much of each coin exists in the bank and prints it to console.
    public void contents(){
        if(myDollar.getContent()>0)
            System.out.println(myDollar);
        if(myQuarter.getContent()>0)
            System.out.println(myQuarter);
        if(myDime.getContent()>0)
            System.out.println(myDime);
        if(myNickel.getContent()>0)
            System.out.println(myNickel);
        if(myPenny.getContent()>0)
            System.out.println(myPenny);
    }

    //tries to remove an amount and checks if the amount can be removed
    public void remove(double amount){
        int temp=(int)(amount*100);
        if(amount>total()) {
            System.out.println("You are broke, ask your parents for an allowance.");
        } else {
            temp = myDollar.check(temp);
            temp = myQuarter.check(temp);
            temp = myDime.check(temp);
            temp = myNickel.check(temp);
            temp = myPenny.check(temp);
            contents();
        }
    }
}