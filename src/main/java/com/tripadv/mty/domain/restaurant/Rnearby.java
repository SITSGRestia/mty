package com.tripadv.mty.domain.restaurant;

/**
 * 餐厅附近
 */
public class Rnearby {

    private Integer rne_id;
    private String rne_name;

    public Rnearby() {
    }

    public Rnearby(Integer rne_id, String rne_name) {
        this.rne_id = rne_id;
        this.rne_name = rne_name;
    }

    public Integer getRne_id() {
        return rne_id;
    }

    public void setRne_id(Integer rne_id) {
        this.rne_id = rne_id;
    }

    public String getRne_name() {
        return rne_name;
    }

    public void setRne_name(String rne_name) {
        this.rne_name = rne_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rnearby rnearby = (Rnearby) o;

        if (rne_id != null ? !rne_id.equals(rnearby.rne_id) : rnearby.rne_id != null) return false;
        return rne_name != null ? rne_name.equals(rnearby.rne_name) : rnearby.rne_name == null;
    }

    @Override
    public int hashCode() {
        int result = rne_id != null ? rne_id.hashCode() : 0;
        result = 31 * result + (rne_name != null ? rne_name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Rnearby{" +
                "rne_id=" + rne_id +
                ", rne_name='" + rne_name + '\'' +
                '}';
    }
}
