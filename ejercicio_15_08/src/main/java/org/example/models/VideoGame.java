package org.example.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class VideoGame {
    private final UUID id;
    private String title;
    private int hoursPlayer;
    private boolean completed;

    public VideoGame(UUID id, String title, int hoursPlayer, boolean completed) {
        this.id = id;
        this.title = title;
        this.hoursPlayer = hoursPlayer;
        this.completed = completed;
    }
}

