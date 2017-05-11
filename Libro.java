

public class Libro extends ProductoMultimedia
{

    private int numeroPaginas;
    
    private boolean esDeFiccion;

	private static final int NUMERO_ANOS_BASE_PARA_OBTENER_PRECIO = 2010;
    
    public Libro(String titulo, int anoDeCreacion, int numeroPaginas, boolean esDeFiccion)
    {
        super(titulo, anoDeCreacion);
        this.numeroPaginas = numeroPaginas;
        this.esDeFiccion = esDeFiccion;
		precio = (numeroPaginas / 100) * (anoDeCreacion  - NUMERO_ANOS_BASE_PARA_OBTENER_PRECIO);
    }

    public int getNumeroPaginas()
    {
        return numeroPaginas;
    }
    
    public boolean getFiccion()
    {
        return esDeFiccion;
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
