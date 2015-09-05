package edu.shop.java.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role extends Model{

    private static final long serialVersionUID = -5380958355394845918L;

    private String title;
    private String description;

    public Role() {
        super();
    }

    public Role(Long id) {
        super(id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
