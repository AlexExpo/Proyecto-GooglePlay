

public class Pelicula extends ProductoMultimedia
{

    private int minutosDeDuracion;
    
    private int calidad;
    
    private static final int FULL_HD = 1080;
    
    private static final int HD = 480;

    public Pelicula(String titulo, int anoDeCreacion, int minutosDeDuracion, int calidad)
    {
        super(titulo, anoDeCreacion);
        this.minutosDeDuracion = minutosDeDuracion;
        this.calidad = calidad;
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
    
}
