package dev.mmiv.runners.run;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        String title,
        LocalDateTime start,
        LocalDateTime end,
        Integer miles,
        Location location
) {}
