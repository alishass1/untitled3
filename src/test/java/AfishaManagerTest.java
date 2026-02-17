
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {

    @Test
    public void testAddAndFindAll() {
        AfishaManager manager = new AfishaManager();


        Film film1 = new Film("Бладшот", "боевик");
        Film film2 = new Film("Вперёд", "мультфильм");
        Film film3 = new Film("Отель «Белград»", "комедия");
        Film film4 = new Film("Джентльмены", "боевик");
        Film film5 = new Film("Человек-невидимка", "ужасы");
        Film film6 = new Film("Тролли. Мировой тур", "мультфильм");
        Film film7 = new Film("Номер один", "комедия");


        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);


        Film[] expected = {film1, film2, film3, film4, film5, film6, film7};

        Film[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithDefaultLimit() {
        AfishaManager manager = new AfishaManager();

        Film film1 = new Film("Бладшот", "боевик");
        Film film2 = new Film("Вперёд", "мультфильм");
        Film film3 = new Film("Отель «Белград»", "комедия");
        Film film4 = new Film("Джентльмены", "боевик");
        Film film5 = new Film("Человек-невидимка", "ужасы");
        Film film6 = new Film("Тролли. Мировой тур", "мультфильм");
        Film film7 = new Film("Номер один", "комедия");

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);


        Film[] expected = {film7, film6, film5, film4, film3};

        Film[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithCustomLimit3() {
        AfishaManager manager = new AfishaManager(3);

        Film film1 = new Film("Бладшот", "боевик");
        Film film2 = new Film("Вперёд", "мультфильм");
        Film film3 = new Film("Отель «Белград»", "комедия");
        Film film4 = new Film("Джентльмены", "боевик");
        Film film5 = new Film("Человек-невидимка", "ужасы");
        Film film6 = new Film("Тролли. Мировой тур", "мультфильм");
        Film film7 = new Film("Номер один", "комедия");

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);


        Film[] expected = {film7, film6, film5};

        Film[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLessThanLimit() {
        AfishaManager manager = new AfishaManager(10);

        Film film1 = new Film("Бладшот", "боевик");
        Film film2 = new Film("Вперёд", "мультфильм");
        Film film3 = new Film("Отель «Белград»", "комедия");

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);


        Film[] expected = {film3, film2, film1};

        Film[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testEmptyManager() {
        AfishaManager manager = new AfishaManager();

        Film[] expected = {};
        Film[] actualAll = manager.findAll();
        Film[] actualLast = manager.findLast();

        Assertions.assertArrayEquals(expected, actualAll);
        Assertions.assertArrayEquals(expected, actualLast);
    }
}