package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private Like like;
    private Comment comment;
    private Share share;
    private Views numberOfViews;
    private Copyright copyright;
    private String postType;
    private Geo geo;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private int postponedId;
    // +get/set
}
