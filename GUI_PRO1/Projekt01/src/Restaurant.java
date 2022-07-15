public class Restaurant {
    Kitchen kitchen = new Kitchen();
    Menu menu = new Menu();
    int table;
    int [] freeTable = new int[table];


    public Restaurant(int tables){

        this.table = table;
        for (int e: freeTable){
            e = 0;
        }
    }

    public int getFreeTable(){
        for (int i = 0; i < freeTable.length; i++) {
            if (freeTable[i] == 0) return i;
        }
        return -1;
    }
    public int getTables() {
        return table;
    }
}
