package de.tekup.exemple.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idP;
    private String FirstName;
    private String Lastname;
    private String Email;
    private String PhoneNumber;
    @OneToMany(cascade=CascadeType.ALL)
    private Set<Reservation>reservations;
}
