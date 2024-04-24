package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HarishStudent {
    @JsonProperty("cggjvhg")
    private String name;
    @JsonProperty("gvkhgvhhgf")
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}