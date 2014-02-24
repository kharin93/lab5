package src.ru.kharin.lab5.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import ru.kharin.lab5.Icosahedron;

public class IcosahedronTest {
    @Test
    public void testGetRadSphere(){
        System.out.print("Проверка метода getRadSphere()");
        Icosahedron i = new Icosahedron(3);
        assertEquals((Math.sqrt((5+Math.sqrt(5))/8))*3,i.getRadSphere(),0.00001);
    }
}
