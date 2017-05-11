

public class Pelicula extends ProductoMultimedia
{

    private int minutosDeDuracion;
    
    private int calidad;
    
    private static final int FULL_HD = 1080;
    
    private static final int HD = 480;

	private static final double PRECIO_PELICULAS_FULL_HD = 10;

	private static final double PRECIO_PELICULAS_NO_FULL_HD = 5;

	private static final int ANO_ANTIGUEDAD_PELICULA = 2000;

    public Pelicula(String titulo, int anoDeCreacion, int minutosDeDuracion, int calidad)
    {
        super(titulo, anoDeCreacion);
        this.minutosDeDuracion = minutosDeDuracion;
        this.calidad = calidad;
		if (getCalidad().equals("FullHD")) {
			precio = PRECIO_PELICULAS_FULL_HD;
		}
		else if (getCalidad().equals("HD")) {
			precio = PRECIO_PELICULAS_NO_FULL_HD;
		}
		if (getAno() < ANO_ANTIGUEDAD_PELICULA) {
			precio = precio / 2;
		}
    }
    
    public int getDuracion()
    {
        return minutosDeDuracion;
    }

    public String getCalidad()
    {
        String calidadDeLaPelicula = "";
        if (calidad == FULL_HD) {
            calidadDeLaPelicula = "FullHD";
        }
        else if (calidad == HD) {
            calidadDeLaPelicula = "HD";
        }
        return calidadDeLaPelicula;
    }

	public double getPrecio()
	{
		return precio;
	}

	public String getIdentificador()
	{
		return getTitulo();
	}
    
}
