package co.unir.oscardo.ccwunir.CCWeb;

/**
 *
 */
public class Contenido {
    private int Id;
    private String Nombre;
    private String Url;

    /**
     * @param id: código del contenido
     * @param nombre: nombre de la semana
     * @param url: URL del sitio web de referencia
     */
    public Contenido(int id, String nombre, String url){
        this.Id = id;
        this.Nombre = nombre;
        this.Url = url;
    }

    /**
     * @return ID
     */
    public int getId() {
        return Id;
    }


    /**
     * @param id del curso
     */
    public void setId(int id) {
        this.Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
