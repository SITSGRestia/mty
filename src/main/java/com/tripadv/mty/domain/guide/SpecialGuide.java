package com.tripadv.mty.domain.guide;

import java.io.Serializable;

public class SpecialGuide implements Serializable {
    private Integer sg_id;
    private String sg_name;

    public SpecialGuide(Integer sg_id, String sg_name) {
        this.sg_id = sg_id;
        this.sg_name = sg_name;
    }

    public SpecialGuide() {
    }

    public Integer getSg_id() {
        return sg_id;
    }

    public void setSg_id(Integer sg_id) {
        this.sg_id = sg_id;
    }

    public String getSg_name() {
        return sg_name;
    }

    public void setSg_name(String sg_name) {
        this.sg_name = sg_name;
    }

    @Override
    public String toString() {
        return "SpecialGuide{" +
                "sg_id=" + sg_id +
                ", sg_name='" + sg_name + '\'' +
                '}';
    }
}
