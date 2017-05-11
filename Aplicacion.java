
public  class Aplicacion extends Producto
{
    
    private String nombre;
    
    private double tamano;
    
    private Categoria categoria;

    private int numeroDeVentas;

	private static final double PRECIO_BASE_APLICACIONES = 0.99;

	private static final double PRECIO_BASE_JUEGOS = 5;

	private static final double PRECIO_BASE_APLICACION_PRODUCTIVIDAD = 10;

	private static final double PRECIO_BASE_APLICACION_MULTIMEDIA_Y_COMUNICACIONES = 2;
    
    public Aplicacion(String nombre, double tamano, Categoria categoria)
    {
        this.nombre = nombre;
        this.tamano = tamano;
        this.categoria = categoria;
		precio = PRECIO_BASE_APLICACIONES;
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

	public void aumentarNumeroDeVentas()
	{
		numeroDeVentas++;
	}

	public double getPrecio()
	{
		double precioADevolver = precio;
		if (numeroDeVentas >= 2) {
			if (getCategoria().equals("Juegos")) {
				precioADevolver = PRECIO_BASE_JUEGOS;
			}
			if (getCategoria().equals("Productividad")) {
				precioADevolver = PRECIO_BASE_APLICACION_PRODUCTIVIDAD;
			}
			if (getCategoria().equals("Multimedia") || getCategoria().equals("Comunicaciones")) {
				precioADevolver = PRECIO_BASE_APLICACION_MULTIMEDIA_Y_COMUNICACIONES;
			}
		}
		return precioADevolver;
	}

	public String getIdentificador()
	{
		return getNombre();
	}
    
}




