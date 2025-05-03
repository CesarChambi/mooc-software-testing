package tudelft.discount;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

// Ejercicio 3:
// Aplicar descuentos

public class DiscountApplierTest {

    @Test
    public void aplicaCorrectamenteLosDescuentos() {
        Product productoHogar = new Product("Lampara", 100.0, "HOME");
        Product productoNegocio = new Product("Impresora", 200.0, "BUSINESS");

        List<Product> productos = Arrays.asList(productoHogar, productoNegocio);

        ProductDao daoSimulado = mock(ProductDao.class);
        when(daoSimulado.all()).thenReturn(productos);

        DiscountApplier aplicador = new DiscountApplier(daoSimulado);

        aplicador.setNewPrices();

        assertEquals(90.0, productoHogar.getPrice(), 0.01);
        assertEquals(220.0, productoNegocio.getPrice(), 0.01);
    }
}
