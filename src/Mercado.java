import java.util.ArrayList;
import java.util.List;

public class Mercado{
    public static void main(String[] args) {        
        List <Product> item = new ArrayList<>();
        item.add(new Product("Tv Lg", 500));  
        ArrayList <List> classes = new ArrayList<>(4);
        classes.add(0, item); 
        System.out.println(classes.get(0));       
    }
}
