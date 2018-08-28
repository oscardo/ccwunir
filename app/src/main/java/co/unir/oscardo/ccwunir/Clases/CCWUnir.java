package co.unir.oscardo.ccwunir.Clases;

public class CCWUnir {

    private String Codigo;
    private String Nombre;
    private String Presentacion;
    private Temario Tema;
    private Testing []Testing;
    private Testing []Testing_Preguntas;
    private Video video;
    private String Version;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPresentacion() {
        return Presentacion;
    }

    public void setPresentacion(String presentacion) {
        Presentacion = presentacion;
    }

    public Temario getTema() {
        return Tema;
    }

    public void setTema(Temario tema) {
        Tema = tema;
    }

    public co.unir.oscardo.ccwunir.Clases.Testing[] getTesting() {
        return Testing;
    }

    public void setTesting(co.unir.oscardo.ccwunir.Clases.Testing[] testing) {
        Testing = testing;
    }

    public co.unir.oscardo.ccwunir.Clases.Testing[] getTesting_Preguntas() {
        return Testing_Preguntas;
    }

    public void setTesting_Preguntas(co.unir.oscardo.ccwunir.Clases.Testing[] testing_Preguntas) {
        Testing_Preguntas = testing_Preguntas;
    }


    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public CCWUnir() {

    }

    public CCWUnir(String codigo, String nombre, String version) {
        Codigo = codigo;
        Nombre = nombre;
        Version = version;
    }

    public CCWUnir(String codigo, String nombre, String presentacion, Temario tema, co.unir.oscardo.ccwunir.Clases.Testing[] testing, co.unir.oscardo.ccwunir.Clases.Testing[] testing_Preguntas, Video video, String version) {
        Codigo = codigo;
        Nombre = nombre;
        Presentacion = presentacion;
        Tema = tema;
        Testing = testing;
        Testing_Preguntas = testing_Preguntas;
        this.video = video;
        Version = version;
    }

    public CCWUnir(String codigo, Temario tema, co.unir.oscardo.ccwunir.Clases.Testing[] testing, co.unir.oscardo.ccwunir.Clases.Testing[] testing_Preguntas, Video video) {
        Codigo = codigo;
        Tema = tema;
        Testing = testing;
        Testing_Preguntas = testing_Preguntas;
        this.video = video;
    }


}

