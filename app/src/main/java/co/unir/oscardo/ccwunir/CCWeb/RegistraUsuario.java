package co.unir.oscardo.ccwunir.CCWeb;

public class RegistraUsuario {

    private String NombreUsuario;
    private String Nombre;
    private String Apellido;
    private String Correo_Electronico;
    private String Pais;
    private String Region;
    private String Ciudad;
    private String Contrasena;

    public RegistraUsuario(String nombreUsuario, String nombre, String apellido, String correo_electronico, String pais, String region, String ciudad, String contrasena) {
        this.NombreUsuario = nombreUsuario;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Correo_Electronico = correo_electronico;
        this.Pais = pais;
        this.Region = region;
        this.Ciudad = ciudad;
        this.Contrasena = contrasena;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public void setCorreo_Electronico(String correo_Electronico) {
        Correo_Electronico = correo_Electronico;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        NombreUsuario = nombreUsuario;
    }
}
