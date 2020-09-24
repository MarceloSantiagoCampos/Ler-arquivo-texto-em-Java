package com.entities;

import java.io.Serializable;

/*Serializable permite que o objeto de Product possa ser tranformado em uma sequencia de Bytes
* Com o intuito de gravar os arquivos (gravar em disco ou trafegar com eles em rede)
 */

public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Double price;
    private Integer quantity;

    public Product() {

    }

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
