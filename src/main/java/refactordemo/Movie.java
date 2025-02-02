package refactordemo;
public class Movie  {
    public static final int  CHILDRENS = 2;
    public static final int  REGULAR = 0;
    public static final int  NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;

    public Movie(String name, int priceCode) {
        _title = name;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void  setPriceCode(int newPrice){
        _priceCode = newPrice;

    }

    public String getTitle(){
        return _title;
    }

}
