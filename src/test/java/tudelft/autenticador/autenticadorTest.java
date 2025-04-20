package tudelft.autenticador;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//ACTIVIDADES:
//Agregar los escenarios de prueba para tener un Testing Estructural en la cual se tengan en consideración tener un Coverage de un 100%

public class autenticadorTest {

    @Test
    public void test_usuario_null() {
        Autenticador auth = new Autenticador();
        assertFalse(auth.autenticar(null, "1234"));
    }

    @Test
    public void test_contraseña_null() {
        Autenticador auth = new Autenticador();
        assertFalse(auth.autenticar("admin", null));
    }

    @Test
    public void test_contraseña_corta() {
        Autenticador auth = new Autenticador();
        assertFalse(auth.autenticar("admin", "123"));
    }

    @Test
    public void test_usuario_no_valido() {
        Autenticador auth = new Autenticador();
        assertFalse(auth.autenticar("Cesar", "1234"));
    }

    @Test
    public void test_contraseña_incorrecta() {
        Autenticador auth = new Autenticador();
        assertFalse(auth.autenticar("admin", "7845"));
    }

    @Test
    public void test_usuarios_contraseñas_validas() {
        Autenticador auth = new Autenticador();
        assertTrue(auth.autenticar("admin", "1234"));
        assertTrue(auth.autenticar("usuario", "1234"));
        assertTrue(auth.autenticar("invitado", "1234"));
    }
}
