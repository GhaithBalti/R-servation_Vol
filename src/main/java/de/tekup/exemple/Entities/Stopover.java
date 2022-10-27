package de.tekup.exemple.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stopover {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idS;
    private Date ArrivalHour;
    private Date DepartureHour;
    @ManyToOne
    private Flight flight;
    @OneToOne
    private Airport airport;
}
