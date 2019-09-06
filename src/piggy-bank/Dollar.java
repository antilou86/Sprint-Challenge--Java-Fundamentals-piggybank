package piggy-bank;

public class Dollar extends coin {
    private static int dollar = 100;
    private static int count = 0;

    public Dollar {
        count++;
        System.out.println("$1 added for a total of "+ count);
    }
    public Dollar(int num){
        count+=num;
        System.out.println("$"+num+" added for a total of "+ count);
    }


    @Override
    public int getContent() {
        return count;
    }
    @Override
    public int getTotal(){
        return count*100;
    }

    @Override
    public int getValue() {
        return 100;
    }

    @Override
    public void remove(int num) {
        count-=num;
    }

    @Override
    public String toString() {
        return "$"+count;
    }
}
}