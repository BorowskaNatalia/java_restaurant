import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
public class Main {
    public static void main(String [] args){
        System.out.println(420);
        Restaurant kokos = new Restaurant(7);

        Dish burger = new Dish(10, "Burger");
        Dish pizza = new Dish(15, "Pizza");
        burger.setDescription("Burger z pomidorem, serem, ogórkiem");
        pizza.setDescription("Pizza na cienkim ciescie z sosem pomidorowym oraz serem mozzarela");

        Menu menu1 = new Menu();

        menu1.addDishToMenu(burger);
        menu1.addDishToMenu(pizza);
        menu1.addDishToMenu(pizza);

        menu1.printToTxt();
        menu1.showMenu();
        Dish kluski = new Dish(7, "Kluski");
        kluski.setDescription("Kluski z niczym");
        menu1.addDishToMenu(kluski);
        menu1.remove(kluski.getIndexDish());



        menu1.printToTxt();



    }
}
