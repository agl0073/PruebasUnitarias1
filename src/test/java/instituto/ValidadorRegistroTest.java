package instituto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorRegistroTest {

    // Traemos el "motor" que vamos a probar desde la carpeta main
    ValidadorRegistro validador = new ValidadorRegistro();

    @Test
    @DisplayName("Ejemplo: Un nombre válido debe ser aceptado")
    public void testNombreValido() {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.validarNombre("Carlos");

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

    // ESCRIBE TUS 5 RETOS A PARTIR DE AQUÍ

    // --- RETO 1: Nombre vacío ---
    @Test
    @DisplayName("Reto 1: Un nombre vacío debe ser rechazado")
    public void testNombreVacio() {
        boolean resultado = validador.validarNombre("");
        // Como el nombre es malo (vacío), esperamos que el sistema devuelva FALSE
        assertFalse(resultado, "Error: El sistema permitió un nombre vacío");
    }

    // --- RETO 2: Password justa (8 caracteres) ---
    @Test
    @DisplayName("Reto 2: Password de 8 caracteres debe ser aceptada")
    public void testPasswordJusta() {
        boolean resultado = validador.validarPassword("12345678");
        // 8 es el límite exacto, así que debe ser TRUE
        assertTrue(resultado, "Error: El sistema rechazó una contraseña de 8 caracteres");
    }

    // --- RETO 3: Password corta ---
    @Test
    @DisplayName("Reto 3: Password de 5 caracteres debe ser rechazada")
    public void testPasswordCorta() {
        boolean resultado = validador.validarPassword("Admin");
        // Menos de 8 es incorrecto, esperamos FALSE
        assertFalse(resultado, "Error: El sistema permitió una contraseña demasiado corta");
    }

    // --- RETO 4: Email sin arroba ---
    @Test
    @DisplayName("Reto 4: Email sin @ debe ser rechazado")
    public void testEmailSinArroba() {
        boolean resultado = validador.validarEmail("usuario.gmail.com");
        // Sin @ no es un email válido, esperamos FALSE
        assertFalse(resultado, "Error: El sistema aceptó un email sin el símbolo @");
    }

    // --- RETO 5: Edad límite (16 años) ---
    @Test
    @DisplayName("Reto 5: Usuario con 16 años exactos debe ser aceptado")
    public void testEdadMinima() {
        boolean resultado = validador.validarEdad(16);
        // 16 es la edad mínima legal, debe ser TRUE
        assertTrue(resultado, "Error: El sistema rechazó a un usuario de 16 años");
    }

}