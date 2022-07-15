public class IndexExsist extends Exception {

    @Override
    public String getMessage() {
        return "Danie o podanym indeksie istnieje. Zmień index";
    }
}