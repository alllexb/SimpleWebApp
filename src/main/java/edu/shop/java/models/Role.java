package edu.shop.java.models;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="tb_role")
public class Role extends Model{

    private static final long serialVersionUID = -5380958355394845918L;

//    @Min(value = 4)
//    @Column(name = "title", length = 25, insertable = false, updatable = false)
    @NotNull
    @Column(name = "title")
    @Enumerated(EnumType.STRING)
    private RoleList title;

    @Column(name = "description", length = 255)
    private String description;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();

    public Role() {
        super();
    }

    public Role(Long id) {
        super(id);
    }

    public RoleList getTitle() {
        return title;
    }

    public void setTitle(RoleList title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
