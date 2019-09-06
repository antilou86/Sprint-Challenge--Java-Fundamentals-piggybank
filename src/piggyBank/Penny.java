package piggyBank;

public class Penny extends Coin {
    private static double penny = 0.01;
    private static int count = 0;

    public Penny {
        count++;
        System.out.println("1 Penny added for a total of "+ count);
    }
    public Penny(int num){
        count+=num;
        System.out.println(num+" Pennies added for a total of "+ count +" Pennies in the bank");
    }


    @Override
    public int getContent() {
        return count;
    }
    @Override
    public int getTotal(){
        return count*penny;
    }
    @Override
    public int getValue() {
        return penny;
    }
    @Override
    public void remove(int num) {
        count-=num;
    }
    @Override
    public String toString() {
        if (count == 0) {
            return "";
        } else {
            return count + (count>1?" Pennies":" Penny");
        }
    }
}