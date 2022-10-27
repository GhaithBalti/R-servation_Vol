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
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAirp;
    private String name;
    @OneToMany (cascade=CascadeType.ALL)
    private Set<Flight> flights;
    @ManyToOne
    private City city;

}
