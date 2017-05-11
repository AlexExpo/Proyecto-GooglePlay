
public abstract class ProductoMultimedia extends Producto
{
    
    private String titulo;
    
    protected int anoDeCreacion;
    
    public ProductoMultimedia(String titulo, int anoDeCreacion)
    {
        this.titulo = titulo;
        this.anoDeCreacion = anoDeCreacion;
    }

    public String getTitulo()
    {
        return titulo;
    }
    
    public int getAno()
    {
        return anoDeCreacion;
    }

	abstract double getPrecio();
    
}
