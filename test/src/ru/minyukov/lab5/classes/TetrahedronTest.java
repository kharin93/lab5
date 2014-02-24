package src.ru.kharin.lab5.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import ru.kharin.lab5.Tetrahedron;

public class TetrahedronTest {
    @Test
    public void testGetHeight(){
        System.out.print("Проверка метода getHeight()");
        Tetrahedron t = new Tetrahedron(3);
        assertEquals((Math.sqrt(6)/3)*3,t.getHeight(),0.00001);
    } 
}
