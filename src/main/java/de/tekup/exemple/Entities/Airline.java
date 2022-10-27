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
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAir;
    private String name;
    private Integer review;
    @OneToMany(cascade=CascadeType.ALL)
    private Set<Flight> flights;
}
