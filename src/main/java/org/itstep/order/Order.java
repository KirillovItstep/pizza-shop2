package org.itstep.order;

import lombok.Data;
import org.itstep.client.Client;
import org.itstep.order_details.OrderDetails;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;
    private String status; //new, approval, paid, delivered

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToOne(mappedBy = "order")
    OrderDetails orderDetails;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", client=" + client.getId() +
                //", orderDetails=" + orderDetails.getId() +
                '}';
    }
}
