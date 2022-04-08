package mock.prj.finalp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SlotDTO {

    private Long slotId;
    private String slotName;
    private String status;
    private Double slotPrice;
    private Long userId;
    private Long slotTypeId;
    private Long parkingLotId;
}
