package edu.shop.java.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.GregorianCalendar;

@Entity
@Table(name="order")
public class Order extends Model{

    private static final long serialVersionUID = -844764279431695981L;

    private User user;

    private Product product;

    private GregorianCalendar calendar;

    public Order() {
        super();
    }

    public Order(Long id) {
        super(id);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public GregorianCalendar getCalendar() {
        return calendar;
    }

    public void setCalendar(GregorianCalendar calendar) {
        this.calendar = calendar;
    }
}
