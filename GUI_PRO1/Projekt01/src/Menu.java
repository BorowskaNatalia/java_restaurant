import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.HashMap;
import java.util.stream.Stream;

public class Menu {
    static int howManyMenu = 0;
    private int indexMenu;
    HashMap<Integer, Dish> menu = new HashMap<>();
    HashMap<Integer, Dish> wycofaneDish = new HashMap<>();
    File menuFile = new File("menu" + indexMenu +".txt");

    Menu(){
        howManyMenu++;
        this.indexMenu = howManyMenu;
    }
    public void addDishToMenu(Dish dish){
        System.out.println("------------------DODAWANIE DANIA DO KARTY-----------------");
        System.out.println("Proba dodania do menu: "+ dish.getNameDish() );

        try {
            if (this.menu.get(dish.getIndexDish()) == null) {
                System.out.println("Udalo się dodać danie: " + dish.getNameDish());
                menu.put(dish.getIndexDish(), dish);
            } else {
                System.out.println("Nie udało się dodac dania: " + dish.getNameDish());
                System.out.println("------------------Nie udało się dodac dania------------------");
                throw new IndexExsist();
            }
        } catch (IndexExsist e){
            System.out.println(e.getMessage());
        }
        System.out.println("----------------------KONIEC DODAWANIA-----------------------------" + '\n');

    }

    public void remove(int indexDish){
        System.out.println("Usunięto danie: " + menu.get(indexDish).getNameDish());
        menu.remove(indexDish);
    }

    public void showMenu(){
        for( Dish e : menu.values()){
            System.out.println(e);
        }
    }

    public void printToTxt()  {
    try {
        if (!menuFile.exists()) {
            File menuFile = new File("menu" + indexMenu + ".txt");
        }
            FileWriter fw = new FileWriter(menuFile,false);  // append: fasle, bo dzięki temu nie dopisujemy a nadpisujemy plik
            Formatter fm = new Formatter(fw); //formatuje nam troszkę tekst
        // %s oznacza ciąg znakow, a \r \n powoduje ze to co zapisujemy zaczyna sie zawsze od nowej linii
        // \r jrst wymagane na windows

            Stream<Dish> streamDish = menu.values().stream();
            streamDish.forEach(x -> {
                fm.format("%s\r\n", x );
            });
            fm.close();
            fw.close();

    } catch (Exception e){
        System.out.println(e.getMessage());
    }

    }

}
