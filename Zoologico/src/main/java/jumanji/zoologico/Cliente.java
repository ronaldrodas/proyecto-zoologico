package jumanji.zoologico;

class Cliente {
  private String nombre;
private int id;
  private int edad;
  private String membresia;

    public Cliente() {
    }

    public Cliente(String nombre, int id, int edad, String membresia) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.membresia = membresia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getMembresia() {
        return membresia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }




}