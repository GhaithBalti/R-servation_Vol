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
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idC;
    private String name;
    @OneToMany(cascade=CascadeType.ALL)
    private Set<Airport>airports;

}
