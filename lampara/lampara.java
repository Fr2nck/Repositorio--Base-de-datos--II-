package lampara;
public class lampara {

    // Atributos
        String color;
        boolean encendida;
        
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
}