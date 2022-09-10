package entites;

public class OrderItem {
    private Integer quantity;
    private double subTotal;    

    public OrderItem(Integer quantity, int posicao){

    }
    public double subTotal(){
        return subTotal;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

}
