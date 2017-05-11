

public class Libro extends ProductoMultimedia
{

    private int numeroPaginas;
    
    private boolean esDeFiccion;
    
    public Libro(String titulo, int anoDeCreacion, int numeroPaginas, boolean esDeFiccion)
    {
        super(titulo, anoDeCreacion);
        this.numeroPaginas = numeroPaginas;
        this.esDeFiccion = esDeFiccion;
    }

    public int getNumeroPaginas()
    {
        return numeroPaginas;
    }
    
    public boolean getFiccion()
    {
        return esDeFiccion;
    }
    
}
