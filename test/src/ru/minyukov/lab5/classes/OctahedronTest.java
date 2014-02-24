
package src.ru.kharin.lab5.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import ru.kharin.lab5.Octahedron;

public class OctahedronTest {
    @Test
    public void testGetPerimeter(){
        System.out.print("Проверка метода getPerimeter()");
        Octahedron o = new Octahedron(3);
        assertEquals(36,o.getPerimeter(),0.00001);
    }
}
