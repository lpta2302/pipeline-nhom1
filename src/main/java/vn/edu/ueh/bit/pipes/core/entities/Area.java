package vn.edu.ueh.bit.pipes.core.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Area extends BaseEntity{
    private float price;
    private String name;
    private int deliveryTime;
}
