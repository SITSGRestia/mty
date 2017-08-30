package com.tripadv.mty.domain.page;

public class HotelPage extends Page {
    private Integer[] hotelBrands;
    private Integer hotelCategory;
    private Integer[] hotelsServices;
    private Integer[] hotelStyles;
    private Integer hotScore;
    private Integer[] hotStars;
    private String cityName;
    private String hotelName;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer[] getHotelBrands() {
        return hotelBrands;
    }

    public void setHotelBrands(Integer[] hotelBrands) {
        this.hotelBrands = hotelBrands;
    }

    public Integer getHotelCategory() {
        return hotelCategory;
    }

    public void setHotelCategory(Integer hotelCategory) {
        this.hotelCategory = hotelCategory;
    }

    public Integer[] getHotelsServices() {
        return hotelsServices;
    }

    public void setHotelsServices(Integer[] hotelsServices) {
        this.hotelsServices = hotelsServices;
    }

    public Integer[] getHotelStyles() {
        return hotelStyles;
    }

    public void setHotelStyles(Integer[] hotelStyles) {
        this.hotelStyles = hotelStyles;
    }

    public Integer getHotScore() {
        return hotScore;
    }

    public void setHotScore(Integer hotScore) {
        this.hotScore = hotScore;
    }

    public Integer[] getHotStars() {
        return hotStars;
    }

    public void setHotStars(Integer[] hotStars) {
        this.hotStars = hotStars;
    }

}
