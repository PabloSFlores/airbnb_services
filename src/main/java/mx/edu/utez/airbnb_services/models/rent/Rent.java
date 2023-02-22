package mx.edu.utez.airbnb_services.models.rent;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.airbnb_services.models.department.Department;
import mx.edu.utez.airbnb_services.models.user.User;

import javax.persistence.*;

@Entity
@Table(name = "rents")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "DATE DEFAULT (CURRENT_DATE)")
    private String initial_date;

    @Column(columnDefinition = "DATE", nullable = false)
    private String final_date;

    //Relación departments
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    //Relación users
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
