package org.itstep.order_details;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.itstep.order.Order;
import org.itstep.pizza.Pizza;

import javax.persistence.*;

@Entity
@Data
@Table(name = "order_details")
public class OrderDetails {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pizza_id")
    private Pizza pizza;

    private Integer count; //Количество пицц в заказе

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    @JsonIgnore //Иначе не выведет в браузер JSON по причине рекурсии
    private Order order;

    @Override
    public String toString() {
        return "OrderDetails{" +
                "id=" + id +
                ", pizza=" + pizza.getId() +
                ", count=" + count +
                ", order=" + order.getId() +
                '}';
    }
}
