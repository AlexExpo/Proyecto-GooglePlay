
public  class Aplicacion extends Producto
{
    
    private String nombre;
    
    private double tamano;
    
    private Categoria categoria;
    
    public Aplicacion(String nombre, double tamano, Categoria categoria)
    {
        this.nombre = nombre;
        this.tamano = tamano;
        this.categoria = categoria;
    }

    public String getNombre()
    {
        return nombre;
    }
    
    public double getTamanoEnMB()
    {
        return tamano;
    }
    
    public String getCategoria()
    {
        String nombreCategoria = categoria + "";
        if (nombreCategoria.equals("JUEGOS")) {
            nombreCategoria = "Juegos";
        }
        else if (nombreCategoria.equals("COMUNICACIONES")) {
            nombreCategoria = "Comunicaciones";
        }
        else if (nombreCategoria.equals("PRODUCTIVIDAD")) {
            nombreCategoria = "Productividad";
        }
        else if (nombreCategoria.equals("MULTIMEDIA")) {
            nombreCategoria = "Multimedia";
        }
        return nombreCategoria;
    }
    
}




