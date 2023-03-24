package jumanji.zoologico;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import static jumanji.zoologico.Animal.animales;
import static jumanji.zoologico.Animal.scanner;

public class DeptoLogistica {

     public void menu(){ //metodo que crea el menu principal 
       OUTER:
        while (true) {
            int choice = mostrarMenu();  
            switch (choice) {
                case 1 ->  {                     
                          Animal add = new Animal();
                          add.ingresarAnimal();
                                }
                case 2 ->  {                 
                        Animal add =new Animal();
                            add.mostrarAnimal();}
                 case 3 ->  {       
                        PlanTuristico[] planes =PlanTuristico.crearPlan();
                        mostrarPlanes(planes);
                         }            
                case 4 -> { 
                    VentaZoologico add =new VentaZoologico();
                        add.vender();      
                         }
                case 5 -> { crearPdfAnimales(animales);
                           System.out.println("============PDF creado correctamente===========");    
                         }        
                case 6 -> {
                    break OUTER;
                } 
                default -> {
                    System.out.println("Código no válido");
                }
            }
        }
    }
           
     public static int mostrarMenu() {
                      System.out.println("============MENU PRINCIPAL===========");
                      System.out.println("1. Ingresar animal");
                      System.out.println("2. Mostrar animales");
                      System.out.println("3. Mostrar planes turisticos");
                      System.out.println("4. Comprar Boletas y miscelaneos del zoologico");
                      System.out.println("5. Crear pdf con lista de animales");     
                      System.out.println("6. Salir");
                      return scanner.nextInt();
                     }
    
   static void crearPdfAnimales(ArrayList<Animal> animales)  {  //crea el pdf con la lista de animales y lo guarda en la carpeta raiz del proyecto
        try {
            Document document = new Document(PageSize.A4);
            PdfWriter.getInstance(document, new FileOutputStream("animales.pdf"));
            document.open();
            
            PdfPTable table = new PdfPTable(6);
            agregarEncabTabla(table);
            
            for (Animal animal : animales) {
                table.addCell(animal.getCodigo());
                table.addCell(animal.getEspecie());
                table.addCell(animal.getNombreCien());
                table.addCell(animal.getNombre());
                table.addCell(animal.getSexo());
                table.addCell(animal.getEdad());
            }        
            Paragraph title = new Paragraph("Lista de Animales", new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD));
            document.add(title);

            document.add(table);
            document.close();
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        }
    }
    
    private static void agregarEncabTabla(PdfPTable table) { //le agrega el encabezado a cada columna del pdf de lista de animales
        table.addCell("CODIGO");
        table.addCell("ESPECIE");
        table.addCell("NOMBRE CIENTIFIC");
        table.addCell("NOMBRE");
        table.addCell("SEXO");
        table.addCell("EDAD");     
    }
    
    public static void mostrarPlanes(PlanTuristico[] planes) {  //menu para ver los planes
        System.out.println("                   ************PLANES TURISTICOS*************");
        for (PlanTuristico plane : planes) {
            System.out.println();
            System.out.println("Nombre del plan: " + plane.getNombre());
            System.out.println("Duracion: " + plane.getDuracion());
            System.out.println("Precio: $ " + plane.getPrecio());
            System.out.println("Actividades: " + plane.getActividades());           
        }
    }



}
