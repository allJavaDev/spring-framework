package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name="item")
@Data
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String code;

    @ManyToMany (mappedBy = "itemList") //ownership is on cart but it can be reverse
    private List<Cart> cart;

    public Item(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
