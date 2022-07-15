import java.lang.ref.PhantomReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Order {
    protected static int howManyOrder = 0;
    protected int indexOrder;
    protected ArrayList<Dish> orderedDish = new ArrayList<>();

    protected Order(){
        howManyOrder++;
        this.indexOrder = howManyOrder;

        Date nowDate = new Date(); //moment tworzenia zamowienia
        SimpleDateFormat s1 = new SimpleDateFormat ("HHmm"); //wyciągam godzinę i minuty złożenia zamowienia
        String stringIndexOrder = "" + howManyOrder + s1.format(nowDate);
        this.indexOrder = Integer.parseInt(stringIndexOrder);  //zamiana string na int


    }

}
