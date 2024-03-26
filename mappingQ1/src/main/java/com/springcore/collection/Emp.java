package com.springcore.collection;

import java.util.Map;

public class Emp {
    private Map<String, String> courses;

    public Emp() {
        // Default constructor
    }

    public Emp(Map<String, String> courses) {
        this.courses = courses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }
}