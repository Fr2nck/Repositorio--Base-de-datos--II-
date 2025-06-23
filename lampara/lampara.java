package lampara;
public class lampara {
    // Atributos
    private String color;
    private boolean encendida;
    
    // Constructor
    public lampara(String color) {
        this.color = color;
        this.encendida = false;
    }
    
    // Métodos
    public void encender() {
        this.encendida = true;
        System.out.println("Lámpara encendida");
    }
    // Métodos públicos para acceder a los atributos (si es necesario)
    public String getcolor() {
        return color;
    }

    public boolean isencendida() {
        return encendida;
    }
}
