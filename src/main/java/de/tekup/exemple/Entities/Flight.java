package de.tekup.exemple.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer idF;
        private Integer FlightNumber;
        private String DepartureCity;
        private String ArrivalCity;
        private Date DateOfDeparture;
        private Date EstimationOfDepartureDate;
        @ManyToOne
        private  Airline airline;
        @OneToMany (cascade=CascadeType.ALL)
        private Set<Stopover> stopovers;
        @ManyToOne
        private Airport airport;
        @OneToMany (cascade=CascadeType.ALL)
        private Set<Reservation> reservations;


}
