package ru.netology.manager;

import ru.netology.domain.PosterItem;
import ru.netology.repository.PosterRepository;

public class PosterManager {
    private PosterRepository repository;

    public PosterManager(PosterRepository repository) {
        this.repository = repository;
    }

    // добавление нового фильма
    public void addPoster(PosterItem item) {
        repository.save(item);
    }

    // вывод всех фильмов в порядке добавления
    public PosterItem[] findAll() {
        PosterItem[] allPosters = repository.getItems();
        PosterItem[] tmp = new PosterItem[allPosters.length];
        for (int i = 0; i < allPosters.length; i++) {
            tmp[i] = allPosters[i];
        }
        allPosters = tmp;

        return allPosters;
    }

    // вывод 5 штук последних добавленных фильмов в обратном от добавления порядке
    public PosterItem[] findLast() {
        PosterItem[] allPosters = repository.getItems();
        PosterItem[] lastPosters = new PosterItem[Math.min(allPosters.length, 5)];
        for (int i = 0; i < lastPosters.length; i++) {
            lastPosters[i] = allPosters[allPosters.length - 1 - i];
        }

        return lastPosters;
    }

    // вывод установленного лимит* штук последних добавленных фильмов в обратном порядке
    public PosterItem[] findLast(int length) {
        PosterItem[] allPosters = repository.getItems();
        PosterItem[] lastPosters = new PosterItem[Math.min(allPosters.length, length)];
        for (int i = 0; i < lastPosters.length; i++) {
            lastPosters[i] = allPosters[allPosters.length - i - 1];
        }

        return lastPosters;
    }
}
