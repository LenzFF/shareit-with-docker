package ru.practicum.shareit.item.dto;

import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ItemDto {
    private long id;

    private String name;

    private String description;

    private Boolean available;

    private List<CommentDto> comments = new ArrayList<>();

    private long requestId;
}