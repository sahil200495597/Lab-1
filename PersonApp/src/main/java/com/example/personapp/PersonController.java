package com.example.personapp;

public class PersonController {

    private final Person model;

    public PersonController(Person model) {
        this.model = model;
    }

    public void handleSubmitButton() {

        System.out.println("Button clicked. Person Information: " + model.toString());

    }
}
