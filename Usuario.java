

public class Usuario
{

    private String cuentaCorreoElectronico;
    
    public Usuario(String cuentaCorreoElectronico)
    {
        this.cuentaCorreoElectronico = cuentaCorreoElectronico;
    }

    public String getNombreCuenta()
    {
        return cuentaCorreoElectronico;
    }
    
}
