package lampara;
// Clase hija que hereda de Lampara
public class lamparaled extends lampara {

    // Atributo propio de LamparaLED
    private int intensidad;

    // Constructor que llama al constructor de la clase padre
    public lamparaled(String color, int intensidad) {
        super(color);
        this.intensidad = intensidad;
    }

    // Sobrescribimos el método encender()
    @Override
    public void encender() {
        System.out.println("Lampara led encendida con luz suave e intensidad: " + intensidad);
    }
}