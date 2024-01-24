package ru.netology.repository;

import ru.netology.domain.PosterItem;

public class PosterRepository {
    private PosterItem[] items = new PosterItem[0];

    public void save(PosterItem item) {
        PosterItem[] tmp = new PosterItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public void removeById(int id) {
        PosterItem[] tmp = new PosterItem[items.length - 1];
        int copyToIndex = 0;
        for (PosterItem item : items) {
            if (item.getPosterId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
            items = tmp;
        }
    }

    public PosterItem[] getItems() {
        return items;
    }


}

