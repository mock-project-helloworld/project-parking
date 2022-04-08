package mock.prj.finalp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_id")
    private Long vehicleId;
    private String vehicleBrand;
    private String vehicleColor;
    private String vehicleType;
    private String license_plate;

    @OneToOne(mappedBy = "vehicleId")
    @JsonBackReference
    private Booking bookingId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "user_id")
    private User userId;
}
