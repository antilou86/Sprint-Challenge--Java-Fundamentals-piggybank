package piggy-bank;

public abstract class Coin {
    public abstract int getContent();
    public abstract int getTotal();
    public abstract int getValue();
    public abstract void remove(int num);

    //checks if the requested remove amount is greater than the existing total.
    public int check(int total){
        int ttl=total;

        if(ttl>this.getTotal()){
            ttl-=this.getTotal();
            this.remove(this.getContent());
        }else{
            int removed=ttl/this.getValue();
            ttl-=removed*getValue();
            this.remove(removed);
        }
        return ttl;
    }
}