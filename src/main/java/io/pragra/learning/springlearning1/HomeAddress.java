package io.pragra.learning.springlearning1;

public class HomeAddress implements Iaddress{
    private String streetName;
    private int streetNumber;
    private String city;
    private String country;

    public HomeAddress(String streetName, int streetNumber, String city, String country) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "HomeAddress{" +
                "streetName='" + streetName + '\'' +
                ", streetNumber=" + streetNumber +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public String getAddress() {
        return toString();
    }
}
