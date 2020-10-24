package services;

import interfaces.Course;

public class Html implements Course {

    private Api api;

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours Html : 5");

    }

    public Html(Api api) {
        this.api = api;
    }
}
