package com.tripadv.mty.domain.restaurant;

import java.io.Serializable;

/**
 * 餐厅要求
 */
public class Rhobby implements Serializable{

    private Integer rho_id;
    private String rho_name;

    public Rhobby() {
    }

    public Rhobby(Integer rho_id, String rho_name) {
        this.rho_id = rho_id;
        this.rho_name = rho_name;
    }

    public Integer getRho_id() {
        return rho_id;
    }

    public void setRho_id(Integer rho_id) {
        this.rho_id = rho_id;
    }

    public String getRho_name() {
        return rho_name;
    }

    public void setRho_name(String rho_name) {
        this.rho_name = rho_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rhobby rhobby = (Rhobby) o;

        if (rho_id != null ? !rho_id.equals(rhobby.rho_id) : rhobby.rho_id != null) return false;
        return rho_name != null ? rho_name.equals(rhobby.rho_name) : rhobby.rho_name == null;
    }

    @Override
    public int hashCode() {
        int result = rho_id != null ? rho_id.hashCode() : 0;
        result = 31 * result + (rho_name != null ? rho_name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Rhobby{" +
                "rho_id=" + rho_id +
                ", rho_name='" + rho_name + '\'' +
                '}';
    }
}
