package ru.practicum.shareit.booking.dto;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public class BookingDto {
    private long id;

    private long itemId;

    private long bookerId;

    private LocalDateTime start;

    private LocalDateTime end;
}
