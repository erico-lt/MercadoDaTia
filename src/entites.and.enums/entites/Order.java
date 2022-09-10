import java.util.Date;

public class Order {
    private Date moment = new Date();
    private OrderStatus status;
    

    public void addItem(OrderItem item){
        OrderItem itens = item;
    }

    public void removeItem(OrderItem item){

    }

    /*public double total(){
        return quantity * price;
    }*/

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

}
