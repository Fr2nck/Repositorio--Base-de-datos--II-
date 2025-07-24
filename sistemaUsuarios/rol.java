package sistemaUsuarios;
public class rol {
    // atributos de la clase rol   
    private String idRol;
    private String nomRol;
    private String desRol;

    // constructor de la clase rol
    public rol(String idRol, String nomRol, String desRol) {
        this.idRol = idRol;
        this.nomRol = nomRol;
        this.desRol = desRol;
    }

    // metodos getter para obtener los valores de los atributos
    public String getIdRol() {
        return idRol;
    }
    public String getNomRol() {
        return nomRol;
    }
    public String getDesRol() {
        return desRol;
    }

    // metodo toString para mostrar el nombre y descripcion del rol
    @Override
    public String toString() {
        return nomRol + " - " + desRol;
    }
}