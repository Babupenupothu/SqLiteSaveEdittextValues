package com.example.sqlitesaveedittextvalues;

public class DataModel {

    public String name;
    public String county;
    public String city;
    public String company;

    public String getName() {
        return name;
    }

    public String getCounty() {
        return county;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setCounty(String county) {
        this.county = county;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
