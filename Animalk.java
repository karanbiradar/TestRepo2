package com.company;

public class Animalk {
    private int brain;
    private String name;
    private int body;
    private int size;
    private int weight;

    public int getBrain() {
        return brain;
    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public Animalk(String name, int brain, int body, int size, int weight){
        this.name=name;
        this.brain=brain;
        this.body=body;
        this.size=size;
        this.weight=weight;


    }
}
