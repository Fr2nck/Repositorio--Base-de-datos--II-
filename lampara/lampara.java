package lampara;

// clase padre
public class lampara {

    // Atributos primarios
    private String color;
    private boolean encendida;
    
    // Constructor
    public lampara(String color) {
        this.color = color;
        this.encendida = false;
    }
    
    // Método para encender
    public void encender() {
        this.encendida = true;
        System.out.println("Lampara encendida");
    }

    // Métodos de acceso (getters)
    public String getcolor() {
        return color;
    }

    public boolean isencendida() {
        return encendida;
    }
}