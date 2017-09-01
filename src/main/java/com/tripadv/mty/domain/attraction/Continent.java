package com.tripadv.mty.domain.attraction;

/*
    各个大洲的实体类

 */
public class Continent {
    private Integer con_id;
    private String con_name;

    public Continent() {
    }

    public Continent(Integer con_id, String con_name) {
        this.con_id = con_id;
        this.con_name = con_name;
    }

    public Integer getCon_id() {
        return con_id;
    }

    public void setCon_id(Integer con_id) {
        this.con_id = con_id;
    }

    public String getCon_name() {
        return con_name;
    }

    public void setCon_name(String con_name) {
        this.con_name = con_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        if (con_id != null ? !con_id.equals(continent.con_id) : continent.con_id != null) return false;
        return con_name != null ? con_name.equals(continent.con_name) : continent.con_name == null;
    }

    @Override
    public int hashCode() {
        int result = con_id != null ? con_id.hashCode() : 0;
        result = 31 * result + (con_name != null ? con_name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "con_id=" + con_id +
                ", con_name='" + con_name + '\'' +
                '}';
    }
}
