package uy.edu.um.prog2.adt.Entities;

public class Driver {
    private String name;
    private int menciones;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMenciones() {
        return menciones;
    }

    public void setMenciones(int menciones) {
        this.menciones = menciones;
    }

    public void addMencion(){
        this.menciones++;
    }
}
