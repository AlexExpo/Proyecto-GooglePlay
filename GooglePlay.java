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
    
    /**
     * Metodo que vende a un usuario un producto del que 
     * disponga nuestra clase GooglePlay. En caso de no 
     * existir el producto o que le usurio tampoco exista, 
     * el metodo devuelve -1. En caso de que los parametros 
     * sean correctos, el metodo devuelve el importe de la 
     * compra.
     */
    public double comprar(String correoDelUsuario, String identificadorProducto)
    {
        double importe = -1;
        boolean buscando = true;

		for (int contador = 0; contador < listaUsuarios.size() && buscando; contador++) {
			if (listaUsuarios.get(contador).getNombreCuenta().equals(correoDelUsuario)) {
				for (int contador2 = 0; contador2 < listaProductos.size() && buscando; contador2++) {
					if (listaProductos.get(contador2).getIdentificador().equals(identificadorProducto)) {
						importe = listaProductos.get(contador2).getPrecio();
						buscando = false;
						if (listaProductos.get(contador2) instanceof Aplicacion) {
							((Aplicacion) listaProductos.get(contador2)).aumentarNumeroDeVentas();
						}
					}
				}
				buscando = false;
			}
		}
        
        return importe;
    }
    
}






