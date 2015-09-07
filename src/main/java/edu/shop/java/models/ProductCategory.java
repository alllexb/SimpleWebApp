package edu.shop.java.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="tb_product_category")
public class ProductCategory extends Model{

    private static final long serialVersionUID = 6872655937147977360L;

    @Column(name = "title", length = 50)
    private String title;

    @OneToMany(mappedBy = "productCategory", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Product> products = new HashSet<>();

    public ProductCategory() {
        super();
    }

    public ProductCategory(Long id) {
        super(id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Product> getProducts() {
        return products;
    }
}
