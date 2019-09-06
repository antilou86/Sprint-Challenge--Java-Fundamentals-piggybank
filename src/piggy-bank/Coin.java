package piggy-bank;

public abstract class Coin {
    public abstract int getContents();
    public abstract int getTotal();
    public abstract int getValue();
    public abstract void remove(int num);

    public int (int total){
        int ttl=total;

        if(ttl>this.getTotal()){
            ttl-=this.getTotal();
            this.remove(this.getContents());
        }else{
            int removed=ttl/this.getValue();
            ttl-=removed*getValue();
            this.remove(removed);
        }
        return ttl;
    }
}