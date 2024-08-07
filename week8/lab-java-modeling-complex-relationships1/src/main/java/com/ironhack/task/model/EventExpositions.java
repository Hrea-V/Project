package com.ironhack.task.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@Table(name = "events_expositions")
public class EventExpositions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Calendar date;
    private Integer duration;
    private String location;
    private String title;

    @OneToMany(mappedBy = "event_expositions")
    private List<GuestExpositions> guestExpositions;

    public EventExpositions(Calendar date, Integer duration, String location, String title, List<GuestExpositions> guestExpositions) {
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.title = title;
        this.guestExpositions = guestExpositions;
    }
}
