import java.util.ArrayList;
import java.util.Scanner;

public class Animal {
    //attributes
    private String name;
    private boolean isItDog;

    //constructor
    public Animal(String name, boolean isItDog) {
        this.name = name;
        this.isItDog = isItDog;
    }
    //2 getters

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public boolean getDog() {
        return isItDog;
    }

    public void setDog() {
        this.isItDog = isItDog;
    }
    @Override
    public String toString() {
        return name + " is a dog = " + isItDog;
    }

    }
