package spring.data.access.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Cart {
    private int id;
    private String name;
    private ArrayList<Product> cartList;



}
