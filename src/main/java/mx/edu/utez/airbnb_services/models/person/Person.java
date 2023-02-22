package mx.edu.utez.airbnb_services.models.person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.airbnb_services.models.user.User;

import javax.persistence.*;

@Entity
@Table(name = "people")
@NoArgsConstructor
//@AllArgsConstructor
@Setter
@Getter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullname;

    @Column(columnDefinition = "DATE", nullable = false)
    private String birthday;

    @OneToOne(mappedBy = "person",
            cascade = CascadeType.ALL,
            optional = false)
    private User user;

    public Person(Long id, String fullname, User user) {
        this.id = id;
        this.fullname = fullname;
        this.birthday = birthday;
        this.user = user;
        this.user.setPerson(this);
    }
}
