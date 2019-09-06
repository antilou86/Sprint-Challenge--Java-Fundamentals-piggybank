package piggyBank;

public class Nickle extends Coin {
    private static double nickle = 0.5;
    private static int count = 0;

    public Nickle {
        count++;
        System.out.println("1 nickle added for a total of "+ count);
    }
    public Nickle(int num){
        count+=num;
        System.out.println(num+" nickles added for a total of "+ count +" nickles in the bank");
    }

    @Override
    public int getContent() {
        return count;
    }
    @Override
    public int getTotal(){
        return count*nickle;
    }
    @Override
    public int getValue() {
        return nickle;
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
            return count + (count>1?" Nickles":" Nickle");
        }
    }
}