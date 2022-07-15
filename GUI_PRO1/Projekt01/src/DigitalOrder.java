public class DigitalOrder extends Order{
    private int indexDigitalOrder;
    private String adress;

    DigitalOrder(int indexDish, String adress){
        super(indexDish);
        this.adress = adress;
    }
}
