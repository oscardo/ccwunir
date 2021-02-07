package co.unir.oscardo.ccwunir.Clases;

public class Testing_Preguntas {
    private String Pregunta;
    private String Respuesta_1;
    private String Respuesta_2;
    private String Respuesta_3;
    private String Respuesta_4;
    private String Respuesta_Real;

    public Testing_Preguntas() {
    }

    public Testing_Preguntas(String pregunta, String respuesta_1, String respuesta_2, String respuesta_3, String respuesta_4, String respuesta_Real) {
        Pregunta = pregunta;
        Respuesta_1 = respuesta_1;
        Respuesta_2 = respuesta_2;
        Respuesta_3 = respuesta_3;
        Respuesta_4 = respuesta_4;
        Respuesta_Real = respuesta_Real;
    }

    public String getPregunta() {
        return Pregunta;
    }

    public void setPregunta(String pregunta) {
        Pregunta = pregunta;
    }

    public String getRespuesta_1() {
        return Respuesta_1;
    }

    public void setRespuesta_1(String respuesta_1) {
        Respuesta_1 = respuesta_1;
    }

    public String getRespuesta_2() {
        return Respuesta_2;
    }

    public void setRespuesta_2(String respuesta_2) {
        Respuesta_2 = respuesta_2;
    }

    public String getRespuesta_3() {
        return Respuesta_3;
    }

    public void setRespuesta_3(String respuesta_3) {
        Respuesta_3 = respuesta_3;
    }

    public String getRespuesta_4() {
        return Respuesta_4;
    }

    public void setRespuesta_4(String respuesta_4) {
        Respuesta_4 = respuesta_4;
    }

    public String getRespuesta_Real() {
        return Respuesta_Real;
    }

    public void setRespuesta_Real(String respuesta_Real) {
        Respuesta_Real = respuesta_Real;
    }
}
