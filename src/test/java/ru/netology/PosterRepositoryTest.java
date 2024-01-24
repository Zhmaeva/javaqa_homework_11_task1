package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterItem;
import ru.netology.repository.PosterRepository;

public class PosterRepositoryTest {

    PosterItem posterItem1 = new PosterItem(1, "Бладшот", "боевик", "?", false);
    PosterItem posterItem2 = new PosterItem(2, "Вперёд", "мультфильм", "?", false);
    PosterItem posterItem3 = new PosterItem(3, "Отель Белград", "комедия", "?", false);
    PosterItem posterItem4 = new PosterItem(4, "Джентельмены", "боевик", "?", false);
    PosterItem posterItem5 = new PosterItem(5, "Человек-невидимка", "ужасы", "?", false);
    PosterItem posterItem6 = new PosterItem(6, "Тролли. Мировой тур", "мультфильм", "?", true);
    PosterItem posterItem7 = new PosterItem(7, "Номер один", "комедия", "?", true);

    @Test
    public void test() {
        PosterRepository repository = new PosterRepository();
        repository.save(posterItem1);
        repository.save(posterItem2);
        repository.save(posterItem3);
        repository.save(posterItem4);
        repository.save(posterItem5);
        repository.save(posterItem6);
        repository.save(posterItem7);
        repository.removeById(posterItem3.getPosterId());

        PosterItem[] expected = {posterItem1, posterItem2, posterItem4, posterItem5, posterItem6, posterItem7};
        PosterItem[] actual = repository.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }
}
