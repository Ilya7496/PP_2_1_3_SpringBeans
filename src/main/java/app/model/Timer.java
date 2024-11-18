package app.model;

import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class Timer {

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
