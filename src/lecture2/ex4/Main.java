package lecture2.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class CartForSongs {
    ArrayList<Song> cart = new ArrayList<Song>();

    public double calculateTotalPrice(){
        double total = 0;
        Iterator<Song> itr = cart.iterator();

        while(itr.hasNext()){
            Song s = itr.next();

            total += s.getPrice() * s.getDiscountMode();
        }
        return total;
    }
    public void add(Song s){
        cart.add(s);
    }


}
abstract class Song{
    private String mode;

    public void setMode(String mode){
        this.mode = mode;
    }
    public double getPrice(){
        return 10.0;
    }
    public abstract double getDiscountMode();
}

class NonDiscount extends Song{
    @Override
    public double getDiscountMode() {
        return 1;
    }
}

class OnSale extends Song{
    @Override
    public double getDiscountMode() {
        return 0.9;
    }
}
class TodayEvent extends Song{
    @Override
    public double getDiscountMode() {
        return 0.7;
    }
}
public class Main {
    public static void main(String args[]) {

        Song[] songs = {new NonDiscount(), new NonDiscount(), new OnSale(), new TodayEvent()};

        CartForSongs c = new CartForSongs();

        for (int i = 0; i < songs.length; i++) {
            c.add(songs[i]);
        }

        System.out.println(c.calculateTotalPrice());

    }
}
