package mock.prj.finalp.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long userId;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String username;
    private String role;
    private String licensePlate;
    private String vehicleColor;
    private String vehicleBrand;
    private String vehicleType;
    private Long slotId;
}
