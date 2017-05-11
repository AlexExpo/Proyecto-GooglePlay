import java.util.ArrayList;

public class GooglePlay
{

    private ArrayList<Usuario> listaUsuarios;
    
    private ArrayList<Producto> listaProductos;
    
    public GooglePlay()
    {
        listaUsuarios = new ArrayList<>();
        listaProductos = new ArrayList<>();
    }

    public int getNumeroUsuarios()
    {
        return listaUsuarios.size();
    }
    
    public int getNumeroProductos()
    {
        return listaProductos.size();
    }
    
    public void addUsuario(Usuario usuario)
    {
        listaUsuarios.add(usuario);
    }
    
    public void addProducto(Producto producto)
    {
        listaProductos.add(producto);
    }
    
}
