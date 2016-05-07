package ym.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by jiangyongming on 5/5/16.
 */
@Entity
@Table(name = "poets", schema = "poet_db")
public class PoetsModel {
    private int id;
    private String name;
    private Set<PoetriesModel> poetries;


    @OneToMany
    public Set<PoetriesModel> getPoetries() {
        return poetries;
    }

    public void setPoetries(Set<PoetriesModel> poetries) {
        this.poetries = poetries;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PoetsModel that = (PoetsModel) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
