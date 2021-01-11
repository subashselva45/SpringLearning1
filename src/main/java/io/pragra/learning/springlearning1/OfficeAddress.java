package io.pragra.learning.springlearning1;

public class OfficeAddress implements Iaddress {
    private String officeName;

    public OfficeAddress(String officeName) {
        this.officeName = officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    @Override
    public String toString() {
        return "OfficeAddress{" +
                "officeName='" + officeName + '\'' +
                '}';
    }

    @Override
    public String getAddress() {
        return toString();
    }
}
