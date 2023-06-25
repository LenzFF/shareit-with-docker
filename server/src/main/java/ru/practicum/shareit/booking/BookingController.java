package ru.practicum.shareit.booking;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.practicum.shareit.booking.dto.BookingDto;
import ru.practicum.shareit.booking.model.Booking;

import java.util.List;

@RestController
@RequestMapping(path = "/bookings")
@RequiredArgsConstructor
public class BookingController {
    private final BookingService bookingService;

    @PostMapping
    public Booking createBooking(@RequestHeader("X-Sharer-User-Id") long userId,
                                 @RequestBody BookingDto bookingDto) {
        return bookingService.create(bookingDto, userId);
    }

    @PatchMapping("/{bookingId}")
    public Booking changeStatus(@RequestHeader("X-Sharer-User-Id") long userId, @PathVariable long bookingId,
                                @RequestParam(value = "approved") boolean approved) {
        return bookingService.changeStatus(userId, bookingId, approved);
    }

    @GetMapping("/{bookingId}")
    public Booking get(@RequestHeader("X-Sharer-User-Id") long userId, @PathVariable long bookingId) {
        return bookingService.get(userId, bookingId);
    }

    @GetMapping
    public List<Booking> getUserBookingsByState(@RequestHeader("X-Sharer-User-Id") long userId,
                                                @RequestParam(value = "state", defaultValue = "ALL",
                                                        required = false) String state,
                                                @RequestParam(name = "from", defaultValue = "0") int from,
                                                @RequestParam(name = "size", defaultValue = "3") int size) {

        return bookingService.getUserBookingsByState(userId, state, from, size);
    }

    @GetMapping("owner")
    public List<Booking> getOwnerBookingsByState(@RequestHeader("X-Sharer-User-Id") long userId,
                                                 @RequestParam(value = "state", defaultValue = "ALL",
                                                         required = false) String state,
                                                 @RequestParam(name = "from", defaultValue = "0") int from,
                                                 @RequestParam(name = "size", defaultValue = "3") int size) {

        return bookingService.getOwnerBookingsByState(userId, state, from, size);
    }
}
