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
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAg;
    private String firstName;
    private String lastName;
    private String Email;
    private String password;
    @OneToMany (cascade=CascadeType.ALL)
    private Set<Reservation>reservations;

}
