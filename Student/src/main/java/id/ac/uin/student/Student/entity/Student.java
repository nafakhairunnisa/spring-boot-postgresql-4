package id.ac.uin.student.Student.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Column(nullable = false, name = "first_name")
    private String firstName;

    @NotEmpty
    @Column(nullable = false, name = "last_name")
    private String lastName;

    @Past(message = "Birth date should be less than current date")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birthDate;

    @NotEmpty
    @Column(nullable = false, name = "email", unique = true)
    private String email;

    @NotEmpty
    @Column(nullable = false, name = "phone_number", unique = true)
    private String phoneNumber;

    @NotEmpty
    @Column(nullable = false, name = "jurusan", unique = true)
    private String jurusan;
}
