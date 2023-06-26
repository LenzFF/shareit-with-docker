package ru.practicum.shareit.item.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class CommentDto {

    private long id;

    @NotBlank
    @Size(max = 1000)
    private String text;

    private String authorName;

    private long itemId;

    private LocalDateTime created = LocalDateTime.now();
}
