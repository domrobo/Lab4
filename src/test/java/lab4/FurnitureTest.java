package lab4;

import org.junit.jupiter.api.Test;
import typesPackage.Word;

import static org.junit.jupiter.api.Assertions.*;

class FurnitureTest {

    @Test
    void testEqualsSameObjects() {
        Furniture f1 = new Furniture(new Word("Стіл"), new Word("Дуб"), 2500.0, 15, new Word("Коричневий"));
        Furniture f2 = new Furniture(new Word("Стіл"), new Word("Дуб"), 2500.0, 15, new Word("Коричневий"));

        assertEquals(f1, f2);
    }

    @Test
    void testEqualsDifferentPrice() {
        Furniture f1 = new Furniture(new Word("Стіл"), new Word("Дуб"), 2500.0, 15,new Word("Коричневий"));
        Furniture f2 = new Furniture(new Word("Стіл"), new Word("Дуб"), 3000.0, 15, new Word("Коричневий"));

        assertNotEquals(f1, f2);
    }
}

