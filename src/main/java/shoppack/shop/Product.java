package shoppack.shop;

public class Product {
    private String name;
    private int stock;
    private int price;
    private int sell = 0;
    private int thissell;

    public Product(String name,int stock,int price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getProductName(){
        return name;
    }

    public int getProductStock(){
        return stock;
    }

    public int getPrice(){
        return price;
    }

    public void setSell(int q){
        sell=q;
    }

    public int getSell(){
        return sell;
    }

    public int getThisSell(){
        return thissell;
    }

    public void updateStock(int quantity){
        stock -= quantity;
        thissell = quantity;
        sell+=quantity;
    }
    public int calculatePrice(){
        return sell*price;
    }

}
