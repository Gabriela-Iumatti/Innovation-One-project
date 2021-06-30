package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor; //avoid too much GET and SET method
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data //db
@Builder 
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // find in DB, increment method
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false) //constant required
    private PhoneType type;

    @Column(nullable = false) //constant required
    private String number;


}
