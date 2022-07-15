public class Dish {
    private static int howManyDish = 0;
    private int indexDish;
    private int price;
    private String nameDish;
    private String description;
    private boolean isAvailable = true;


    Dish (int price, String nameDish){
        howManyDish++;
        this.indexDish = howManyDish;
        this.price = price;
        this.nameDish = nameDish;
    }

    Dish(int price, String nameDish, String description){
        this(price, nameDish);
        this.description = description;
    }

    public void isAvailable (boolean isAvailable ){
        this.isAvailable = isAvailable;

        if (this.isAvailable){
            System.out.println("Danie " + this.nameDish + " ustawione jako dostępne");
        } else {
            System.out.println("Danie " + this.nameDish + " jest teraz niedostępne");
        }

    }

    public void setDescription(String description){
        this.description = description;
    }

    public int getIndexDish() {
        return indexDish;
    }

    public int getPrice() {return price;}

    public void setPrice(int price) {this.price = price;}

    public String getNameDish() {
        return nameDish;
    }

    @Override
    public String toString() {
        return indexDish + ". " + nameDish + " " + price +"$ " + '\n'
                + description + '\n';

    }
}
