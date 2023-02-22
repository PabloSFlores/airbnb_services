package mx.edu.utez.airbnb_services.models.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.airbnb_services.models.person.Person;
import mx.edu.utez.airbnb_services.models.rent.Rent;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String uid;

    @Column(columnDefinition = "TEXT")
    private String image;

    //Relación con person
    @OneToOne
    @JoinColumn(name = "person_id",
            referencedColumnName = "id",
            unique = true)
    //@JsonIgnore
    private Person person;

    //Relación con rents
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Rent> rent;
}
