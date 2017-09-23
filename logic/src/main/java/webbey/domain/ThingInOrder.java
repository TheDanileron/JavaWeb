package webbey.domain;


import com.sun.org.apache.xpath.internal.operations.Or;

import javax.persistence.*;

@Entity
public class ThingInOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne//Вещь в заказае содержит только одну вещь
    private Thing thing;

    @ManyToOne//Вещь в заказе содержит только один заказ
    private Order order;

    private int quantity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Thing getThing() {
        return thing;
    }

    public void setThing(Thing thing) {
        this.thing = thing;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
