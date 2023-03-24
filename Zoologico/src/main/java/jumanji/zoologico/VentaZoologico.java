package jumanji.zoologico;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class VentaZoologico {
    private String nombre;
    private int precio;

    public VentaZoologico() {
    }

    
    public VentaZoologico(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrice(int precio) {
        this.precio = precio;
    }


public void vender(){   // se crea los productos y un menu para venderlos, al salir del menu crea el pdf con la cuenta de lo comprado
    ArrayList<VentaZoologico>producto= new ArrayList<>();
    
        producto.add(new VentaZoologico("Boleta de ingreso", 10000));
        producto.add(new VentaZoologico("Peluche de animales", 50000));
        producto.add(new VentaZoologico("Gorra con logo del zoologico", 15000));
        producto.add(new VentaZoologico("Gaseosa ", 5000));
        producto.add(new VentaZoologico("Palomitas de maiz", 3000));  
          Scanner scanner = new Scanner(System.in);
        ArrayList<VentaZoologico> lista = new ArrayList<>();
        ArrayList<Integer> cantidad = new ArrayList<>();  
        while (true) {
            System.out.println("========= MENU =========");
            for (int i = 0; i < producto.size(); i++) {
                VentaZoologico product = producto.get(i);
                System.out.println((i + 1) + ". " + product.getNombre() + " = $" + product.getPrecio() );
            }
            System.out.println("6. Regresar al menu principal");
            System.out.print("Selecciona el producto que quieres comprar: ");

            int option = scanner.nextInt();

            if (option >= 1 && option <= 5) {
                VentaZoologico product = producto.get(option - 1);
                System.out.print("Ingrese la cantidad: ");
                int cuantos = scanner.nextInt();
                lista.add(product);
                cantidad.add(cuantos);
                System.out.println("**** "+cuantos + " " + product.getNombre() + " agregado a la lista de compras ****");
            } else if (option == 6) {
                int total = 0;
                System.out.println("======= RECIBO =======");
                for (int i = 0; i < lista.size(); i++) {
                    VentaZoologico product = lista.get(i);
                    int cuantos = cantidad.get(i);
                    int precio = product.getPrecio() * cuantos;
                    System.out.println(cuantos + " " + product.getNombre() + " = $" + precio);
                    total += precio;
                }
                System.out.println("Total a pagar: $" + total);
                    try {
                    Document document = new Document();
                    PdfWriter.getInstance(document, new FileOutputStream("reportedeventas.pdf"));
                    document.open();
                    document.add(new Paragraph("REPORTE DE VENTAS"));
                    document.add(new Paragraph("======================="));
                    for (int i = 0; i < lista.size(); i++) {
                        VentaZoologico product = lista.get(i);
                        int cuantos= cantidad.get(i);
                        int precio = product.getPrecio() * cuantos;
                        document.add(new Paragraph(cuantos + " " + product.getNombre() + " = $ " + precio ));
                    }
                    document.add(new Paragraph("======================="));
                    document.add(new Paragraph("TOTAL: $ " + total ));
                    document.close();
                    System.out.println("Reporte de ventas generado: reportedeventas.pdf");
                } catch (FileNotFoundException | DocumentException e) {
                    e.printStackTrace();
                }
                break;
            
          }
        }
    }
}