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
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idR;
    private Date CheckedIn;
    private Integer NbOfBags;
    @ManyToOne
    private Flight flight;
    @ManyToOne
    private Agent agent;
    @ManyToOne
    private Passenger passenger;
}
