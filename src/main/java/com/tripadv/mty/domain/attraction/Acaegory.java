package com.tripadv.mty.domain.attraction;
/*
    景点类型的实体类
 */
public class Acaegory {
    private Integer aca_id;
    private String aca_name;

    public Acaegory() {
    }


    public Acaegory(Integer aca_id, String aca_name) {
        this.aca_id = aca_id;
        this.aca_name = aca_name;
    }

    public Integer getAca_id() {
        return aca_id;
    }

    public void setAca_id(Integer aca_id) {
        this.aca_id = aca_id;
    }

    public String getAca_name() {
        return aca_name;
    }

    public void setAca_name(String aca_name) {
        this.aca_name = aca_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Acaegory acaegory = (Acaegory) o;

        if (aca_id != null ? !aca_id.equals(acaegory.aca_id) : acaegory.aca_id != null) return false;
        return aca_name != null ? aca_name.equals(acaegory.aca_name) : acaegory.aca_name == null;
    }

    @Override
    public int hashCode() {
        int result = aca_id != null ? aca_id.hashCode() : 0;
        result = 31 * result + (aca_name != null ? aca_name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Acaegory{" +
                "aca_id=" + aca_id +
                ", aca_name='" + aca_name + '\'' +
                '}';
    }
}
