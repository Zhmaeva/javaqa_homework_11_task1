package ru.netology.domain;

public class PosterItem {
    private int posterId;
    private String posterName;
    private String posterGenre;
    private String posterPicture;
    private boolean premiere;

    public PosterItem(int posterId, String posterName, String posterGenre, String posterPicture, boolean premiere) {
        this.posterId = posterId;
        this.posterName = posterName;
        this.posterGenre = posterGenre;
        this.posterPicture = posterPicture;
        this.premiere = premiere;
    }

    public int getPosterId() {
        return posterId;
    }

}
