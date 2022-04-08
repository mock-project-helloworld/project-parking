package mock.prj.finalp.services.impl;

import mock.prj.finalp.dto.SlotDTO;
import mock.prj.finalp.model.ParkingLot;
import mock.prj.finalp.model.Slot;
import mock.prj.finalp.model.SlotType;
import mock.prj.finalp.model.User;
import mock.prj.finalp.repositories.SlotRepository;
import mock.prj.finalp.repositories.UserRepository;
import mock.prj.finalp.services.SlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SlotServiceImpl implements SlotService {
    @Autowired
    SlotRepository slotRepository;

    @Autowired
    UserRepository userRepository;


    @Override
    public Slot findById(Long id) {
        return slotRepository.findById(id).orElse(null);
    }

    @Override
    public void save(SlotDTO dto) {
        Slot slot = findById(dto.getSlotId());
        if (slot != null) {
            slot.setSlotId(dto.getSlotId());
            slot.setSlotName(dto.getSlotName());
            dto.setStatus("booked");
            slot.setStatus(dto.getStatus());
            slot.setSlotPrice(dto.getSlotPrice());

            SlotType slotType = new SlotType();
            slotType.setSlotTypeId(dto.getSlotTypeId());
            slot.setSlotTypeId(slotType);

            ParkingLot parkingLot = new ParkingLot();
            parkingLot.setParkingLotId(dto.getParkingLotId());
            slot.setParkingLotId(parkingLot);
            slotRepository.save(slot);
        }
    }

}