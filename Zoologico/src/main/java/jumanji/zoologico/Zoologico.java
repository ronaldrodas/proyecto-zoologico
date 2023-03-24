package jumanji.zoologico;

import static jumanji.zoologico.Animal.animales;

public class Zoologico { 
   
    public static void main(String[] args) {  // se instacian los animales con sus caracteristicas
        animales.add(new AnimalSalvaje("Alto", "1","Felino","Leon","Paco", "macho", "4"));
        animales.add(new AnimalSalvaje("Alto", "2","Mamifero","Elefante","Dumbo", "macho", "7"));
        animales.add(new AnimalDomestico("mascota", "3","Canino","Perro","Tarzan", "macho", "3"));
        animales.add(new AnimalDomestico("mascota", "4","Felino","Gato","Lulu", "hembra", "2"));
        animales.add(new AnimalSalvaje("Bajo", "5","Panthera tigris","Tigre","Amelia", "hembra", "2"));
        animales.add(new AnimalSalvaje("Alto", "2","Mamifero","Oso","Chocolate", "macho", "6"));
        animales.add(new AnimalDomestico("mascota", "3","Canino","Perro","Canino", "macho", "5"));
        animales.add(new AnimalDomestico("mascota", "4","Felino","Gato","Hamsa", "hembra", "1"));
        animales.add(new AnimalSalvaje("Bajo", "1","Panthera tigris","Tigre","Tiger", "macho", "1"));
        animales.add(new AnimalSalvaje("altamente peligroso", "2","Mamifero","Oso","Avellana", "hembra", "6"));
        animales.add(new AnimalDomestico("mascota", "3","Accipitriformes","Aguila","Oreo", "macho", "3"));
        DeptoLogistica add = new DeptoLogistica(); //se crea un objeto de la clase DeptoLogistica y se invoca el metodo menu
        add.menu();
}
}  