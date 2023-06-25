package ru.practicum.shareit.item.dto;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class CommentDto {
    private long id;

    private String text;

    private String authorName;

    private LocalDateTime created = LocalDateTime.now();
}
