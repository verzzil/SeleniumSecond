package ru.itis.selenium.model;

public class PersonalData {

    private String name;
    private String specialization;
    private String gender;
    private String country;
    private String region;
    private String city;
    public String birth;
    private String message;

    public PersonalData(String name, String specialization, String gender, String country, String region, String city, String birth, String message) {
        this.name = name;
        this.specialization = specialization;
        this.gender = gender;
        this.country = country;
        this.region = region;
        this.city = city;
        this.birth = birth;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
