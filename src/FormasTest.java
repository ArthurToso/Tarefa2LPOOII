import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FormasTest {

    @Test
    public void testCircunferencia(){
        Circunferencia c = new Circunferencia(5);
        assertEquals(78.53981633974483, c.area(), 0.0001);
        assertThrows(RuntimeException.class, () -> new Circunferencia(-5));
    }

    @Test
    public void testRetangulo(){
        Retangulo r = new Retangulo(4, 6);
        assertEquals(24, r.area());
        assertEquals(20, r.perimetro());
        assertThrows(RuntimeException.class, () -> new Retangulo(-4, 6));
    }

    @Test
    public void testTriangulo(){
        Triangulo t = new Triangulo(5, 10);
        assertEquals(25, t.area());
        assertThrows(RuntimeException.class, () -> new Triangulo(-5, 10));
    }

}