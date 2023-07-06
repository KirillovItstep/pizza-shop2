package org.itstep.order;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderDto {
    private Long pizza_id;
    private Long client_id;
    private Integer count;
}
