package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterItem;
import ru.netology.manager.PosterManager;
import ru.netology.repository.PosterRepository;

public class PosterManagerTest {

    PosterRepository repository = new PosterRepository();
    PosterManager manager = new PosterManager(repository);

    PosterItem posterItem1 = new PosterItem(1, "Бладшот", "боевик", "?", false);
    PosterItem posterItem2 = new PosterItem(2, "Вперёд", "мультфильм", "?", false);
    PosterItem posterItem3 = new PosterItem(3, "Отель Белград", "комедия", "?", false);
    PosterItem posterItem4 = new PosterItem(4, "Джентельмены", "боевик", "?", false);
    PosterItem posterItem5 = new PosterItem(5, "Человек-невидимка", "ужасы", "?", false);
    PosterItem posterItem6 = new PosterItem(6, "Тролли. Мировой тур", "мультфильм", "?", true);
    PosterItem posterItem7 = new PosterItem(7, "Номер один", "комедия", "?", true);

    @BeforeEach
    public void setup() {
        manager.addPoster(posterItem1);
        manager.addPoster(posterItem2);
        manager.addPoster(posterItem3);
        manager.addPoster(posterItem4);
        manager.addPoster(posterItem5);
        manager.addPoster(posterItem6);
        manager.addPoster(posterItem7);
    }

    @Test
    public void shouldFindAllItems() {
        PosterItem[] expected = {posterItem1, posterItem2, posterItem3, posterItem4, posterItem5, posterItem6, posterItem7};
        PosterItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastItems() {
        PosterItem[] expected = {posterItem7, posterItem6, posterItem5, posterItem4, posterItem3};
        PosterItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastItemsWithLength() {
        PosterItem[] expected = {posterItem7, posterItem6, posterItem5};
        PosterItem[] actual = manager.findLast(3);

        Assertions.assertArrayEquals(expected, actual);
    }

}
