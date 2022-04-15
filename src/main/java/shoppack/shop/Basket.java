package shoppack.shop;

import java.util.ArrayList;


public class Basket {
    ArrayList<Item> basketItem = new ArrayList<>();

    public int addProduct(Product p,int qty){
        System.out.println(p.getProductName());
        Item newitem=null;
        int id=-1;
        int rid=-1;
        for (Item i:basketItem){
            id++;
            if (i.getProduc()==p){
                rid=id;
                newitem=i;
                break;
            }
        }

        if (newitem==null){
            rid=-1;
            newitem=new Item(p);
            basketItem.add(newitem);
        }
        newitem.addqty(qty);
        System.out.println("ID: "+ id);
        p.setSell(newitem.getsellqty());
        System.out.println("cItem number: "+basketItem.size());
        System.out.println("this sell: "+newitem.getProduc().getSell());
        System.out.println(calculateTotalPrice());
        return rid;
    }

    public int calculateTotalPrice(){
        int all=0;
        for(Item p : basketItem){
            all += p.getProduc().calculatePrice();
        }
        return all;
    }

    public void removeProduct(int id){
        Item i=basketItem.get(id);
        i.remove();
        i=null;
        basketItem.remove(id);
    }
}
