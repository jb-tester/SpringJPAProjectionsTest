package com.mytests.spring.springJPA.projections.data;

import javax.persistence.*;

/**
 * Created by irina on 2/20/2017.
 */
@Entity
@Table(name = "chins", schema = "jbtests")
public class ChinsEntity {
    private int id;
    private String name;
    private String color;
    private String birthday;
    private Integer weight;
    private String sex;
    private boolean forSale;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "birthday")
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "weight")
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "forSale")
    public boolean getForSale() {
        return forSale;
    }

    public void setForSale(boolean forSale) {
        this.forSale = forSale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChinsEntity that = (ChinsEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (forSale ? !forSale==(that.forSale) : !that.forSale) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (forSale ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Chinchilla " +
                "id: " + id +
                " name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", birthday='" + birthday + '\'' +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                ", forSale=" + forSale +
                ' ';
    }
}
