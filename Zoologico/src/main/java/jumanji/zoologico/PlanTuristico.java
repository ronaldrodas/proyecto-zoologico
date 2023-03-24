package jumanji.zoologico;

public class PlanTuristico{
    private String nombre;
    private String duracion;
    private int precio;
    private String actividades;


    public PlanTuristico(String nombre, String duracion, int precio, String actividades) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
        this.actividades = actividades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public static PlanTuristico[] crearPlan() { // los planes turisticos que se van a ofrecer
        PlanTuristico[] planes = new PlanTuristico[5];

        planes[0] = new PlanTuristico("Visita Basica", "3 Horas", 20000, "ver los animales y tour guiado.");
        planes[1] = new PlanTuristico("Paquete Familiar", "3 Horas", 70000, "Entrada para dos adultos y dos niños, ver los animales y tour guiado.");
        planes[2] = new PlanTuristico("Zoo Adventura", "5 Horas", 150000, "Recorridos tras bambalinas, encuentros con animales");
        planes[3] = new PlanTuristico("Experiencia VIP", "1 Dia", 300000, "Tour privado, conocer y saludar a los animales, alojamiento en cabaña");
        planes[4] = new PlanTuristico("Abono Anual", "365 Dias ", 2000000, "Entrada ilimitada por un año, descuentos en mercadería, alojamiento en cabaña VIP");
        return planes;
    }

}