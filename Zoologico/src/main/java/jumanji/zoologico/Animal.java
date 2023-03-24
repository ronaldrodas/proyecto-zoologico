package jumanji.zoologico;

import java.util.ArrayList;
import java.util.Scanner;

public class Animal {
    protected String codigo;
    protected String especie;
    protected String nombreCien;
    protected String nombre; 
    protected String sexo;
    protected String edad;
    
    static ArrayList<Animal> animales = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public Animal() {
    }

    public Animal(String codigo, String especie, String nombreCien,String nombre, String sexo, String edad) {//contructo parametrizado clase padre
        this.codigo = codigo;
        this.nombreCien = nombreCien;
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getCodigo() {           // metodo get y set de todas las variables de la clase  animal
        return codigo;
    }

    public String getNombreCien() {         
        return nombreCien;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEspecie() {
        return especie;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEdad() {
        return edad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombreCien(String nombreCien) {
        this.nombreCien = nombreCien;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
 

 public void mostrarAnimal() {  //metodo que imprime en pantalla todos los animales del zoologico
     System.out.println("Total animales: " + animales.size());
            System.out.println("                            ************LISTA ANIMALES*************");
                    for (Animal animal : animales) {
                        System.out.println(animal);
                    }
 }
    
 public void ingresarAnimal() {       //metodo crea menu y permite ingresas los tipos de animales
    OUTER:
     while (true) {
                        
                        System.out.println("========= MENU =========");
                        System.out.println("1. Ingresar animal Domestico");
                        System.out.println("2. Ingresar animal salvaje");
                        System.out.println("3. Regresar a menu principal"); 
                        int choice = scanner.nextInt();
                        switch (choice) {
                            case 1 ->  {                                
                                   System.out.println("Uso:");
                                   String uso = scanner.next();
                                   System.out.println("Codigo:");
                                   codigo = scanner.next();
                                   System.out.println("Escriba la especie del animal: ");
                                   especie = scanner.next();
                                   System.out.println("Escriba el nombre cientifico del animal: ");
                                   nombreCien = scanner.next();
                                   System.out.println("Escriba el nombre del animal: ");
                                   nombre = scanner.next();
                                   System.out.println("Escriba el sexo del animal: ");
                                   sexo = scanner.next();
                                   System.out.println("Escriba la edad del animal: ");
                                   edad = scanner.next();
                                   animales.add(new AnimalDomestico(uso, codigo, especie, nombreCien, nombre, sexo, edad));
                                   System.out.println("*********Animal agregado existosamente*********");
                                }
                            case 2 ->  {                               
                                  System.out.println("Nivel de peligrosidad:");
                                  String nivelPeligrosidad = scanner.next();
                                  System.out.println("Codigo:");
                                  codigo = scanner.next();
                                  System.out.println("Escriba la especie del animal: ");
                                  especie = scanner.next();
                                  System.out.println("Escriba el nombre cientifico del animal: ");
                                  nombreCien = scanner.next();
                                  System.out.println("Escriba el nombre del animal: ");
                                  nombre = scanner.next();                                 
                                  System.out.println("Escriba el sexo del animal: ");
                                  sexo = scanner.next();
                                  System.out.println("Escriba la edad del animal: ");
                                  edad = scanner.next();
                                  animales.add(new AnimalSalvaje(nivelPeligrosidad, codigo, especie, nombreCien, nombre, sexo, edad));
                                  System.out.println("*********Animal agregado existosamente*********");
                                }
                            case 3 -> {
                                break OUTER;
                                }
                            default -> System.out.println("Opcion incorrecta");
                            }
                           }
                        }     

    @Override
    public String toString() {
        return "Animal{" + "codigo=" + codigo + ", especie=" + especie + ", nombreCientifico = " + nombreCien + ", nombre = " + nombre+ ", sexo=" + sexo + ", edad=" + edad + '}';
    }

 

}

