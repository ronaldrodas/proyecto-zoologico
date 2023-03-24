package jumanji.zoologico;

import java.util.ArrayList;
import java.util.List;

public class Habitat {  // portal de la 40
    private String nombre;    
    private List<Animal> animales;  // composición o agregación

    public Habitat(String nombre) {
        this.nombre = nombre;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public String getNombre() {
        return nombre;
    }
}