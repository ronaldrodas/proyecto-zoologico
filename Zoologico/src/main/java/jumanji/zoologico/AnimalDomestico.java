package jumanji.zoologico;

import jumanji.Interface.ComportamientoAnimal;

public class AnimalDomestico extends Animal implements ComportamientoAnimal{
    protected String uso;

    public AnimalDomestico() { //constructor sin parametros
    }

    public AnimalDomestico(String uso, String codigo, String especie, String nombreCien, String nombre, String sexo, String edad) {//constructor parametrizado AnimalDomestico que hereda de animal
        super(codigo, especie, nombreCien, nombre, sexo, edad);
        this.uso = uso;
    }

    public String getUso() {  // metodo get y set de la varible de la clase AnimalDomestico
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    @Override
    public String toString() {
        return "AnimalesDomesticos{" + "uso = " + uso  + ", codigo = " + codigo + ", especie = " + especie + ", nombreCientifico = " + nombreCien + ", nombre = " + nombre+ ", sexo = " + sexo + ", edad = " + edad + '}';
    }
     
 @Override
    public void comer(){
        System.out.println("dieta controlada");
    }

    @Override
    public void domir() {
        
    }
  
}