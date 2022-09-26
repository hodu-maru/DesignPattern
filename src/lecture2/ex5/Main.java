package lecture2.ex5;

import java.util.ArrayList;
import java.util.Iterator;

class CartForSongs{
    ArrayList<Song> cart = new ArrayList<Song>();

    double calculateTotalPrice(){
        double total = 0;
        Iterator<Song> itr = cart.iterator();

        while(itr.hasNext()){
            Song s = itr.next();
            total += s.getPrice();
        }
        return total;
    }
    void add(Song item){
        cart.add(item);
    }
}
class Song {
    private DiscountMode mode;

    void setMode(DiscountMode mode){
        this.mode = mode;
    }

    double getPrice(){
        return 10.0 - (10.0 * this.mode.getDiscountRate());
    }
}

abstract class DiscountMode{
    abstract double getDiscountRate();
}

class NonDiscounted extends DiscountMode{
    @Override
    double getDiscountRate() {
        return 0;
    }
}
class OnSale extends DiscountMode{
    @Override
    double getDiscountRate() {
        return 0.1;
    }
}

class  TodayEvent extends DiscountMode{
    @Override
    double getDiscountRate() {
        return 0.3;
    }
}

public class Main{
    public static void main(String args[]){
        Song s1 = new Song();
        s1.setMode(new NonDiscounted());
        Song s2 = new Song();
        s1.setMode(new NonDiscounted());
        Song s3 = new Song();
        s1.setMode(new OnSale());
        Song s4 = new Song();
        s1.setMode(new TodayEvent());

        CartForSongs cart = new CartForSongs();

        cart.add(s1);
        cart.add(s2);
        cart.add(s3);
        cart.add(s4);

        System.out.println(cart.calculateTotalPrice());


    }

}

