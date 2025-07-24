package sistemaUsuarios;
import java.time.LocalDate;

public class sistemaUsuarios {
    public static void main(String[] args) {

        // crear un objeto de la clase rol
        rol administrador = new rol(
            "ROL0001",
            "Administrador",
            "Administrador del sistema"
            );
        
        // mostrar los datos del rol
        System.out.println("Rol creado:");
        System.out.println(administrador);

        // crear un usuario con el rol creado
        usuario usuario01 = new usuario(
            "USU0001",
            administrador,
            "12345678",
            "Carlos",
            "Ramirez",
            "Lopez",
            "carlos.ramirez@empresa.com",
            "admin123",
            LocalDate.of(1990, 5, 20),
            "987654321",
            'A'
            );
        
        // mostrar los datos del usuario
        System.out.println("Usuario creado:");
        System.out.println(usuario01);
    }
}