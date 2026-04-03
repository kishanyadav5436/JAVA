package com.ticket.bookingsystem.model;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record Ticket(
    UUID id,
    @NotBlank(message = "Name is required") String name,
    @NotNull(message = "Age is required") @Positive(message = "Age must be positive") Integer age,
    @NotBlank(message = "From is required") String from,
    @NotBlank(message = "To is required") String to) {
}