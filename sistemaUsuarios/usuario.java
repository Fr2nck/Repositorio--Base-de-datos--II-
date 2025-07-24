package sistemaUsuarios;
import java.time.LocalDate;

// clase usuario que representa a un usuario del sistema
public class usuario {

    // atributos de la clase usuario
    private String idUsu;
    private rol rol;    // relacion con la clase rol
    private String dniUsu;
    private String nomUsu;
    private String apePatUsu;
    private String apeMatUsu;
    private String corUsu;
    private String conUsu;
    private LocalDate fecNacUsu;
    private String telUsu;
    private char estUsu;

    // constructor de la clase usuario
    public usuario(String idUsu, rol rol, String dniUsu, String nomUsu, String apePatUsu, String apeMatUsu, 
                   String corUsu, String conUsu, LocalDate fecNacUsu, String telUsu, char estUsu) {
        this.idUsu = idUsu;
        this.rol = rol;
        this.dniUsu = dniUsu;
        this.nomUsu = nomUsu;
        this.apePatUsu = apePatUsu;
        this.apeMatUsu = apeMatUsu;
        this.corUsu = corUsu;
        this.conUsu = conUsu;
        this.fecNacUsu = fecNacUsu;
        this.telUsu = telUsu;
        this.estUsu = estUsu;
    }

    // metodos getter para obtener los valores de los atributos
    public String getIdUsu() {
        return idUsu;
    }
    public rol getRol() {
        return rol;
    }
    public String getDniUsu() {
        return dniUsu;
    }
    public String getNomUsu() {
        return nomUsu;
    }
    public String getApePatUsu() {
        return apePatUsu;
    }
    public String getApeMatUsu() {
        return apeMatUsu;
    }
    public String getCorUsu() {
        return corUsu;
    }
    public String getConUsu() {
        return conUsu;
    }
    public LocalDate getFecNacUsu() {
        return fecNacUsu;
    }
    public String getTelUsu() {
        return telUsu;
    }
    public char getEstUsu() {
        return estUsu;
    }

    // metodo toString para mostrar el nombre + apellido del usuario junto con su rol
    @Override
    public String toString() {
        return nomUsu + " " + apePatUsu + " (" + rol + ")";
    }
}

