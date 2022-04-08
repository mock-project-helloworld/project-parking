package mock.prj.finalp.services.impl;

import mock.prj.finalp.dto.SlotDTO;
import mock.prj.finalp.dto.UserDTO;
import mock.prj.finalp.model.ParkingLot;
import mock.prj.finalp.model.Slot;
import mock.prj.finalp.model.SlotType;
import mock.prj.finalp.model.User;
import mock.prj.finalp.repositories.SlotRepository;
import mock.prj.finalp.repositories.UserRepository;
import mock.prj.finalp.services.SlotService;
import mock.prj.finalp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    SlotService slotService;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void save(UserDTO dto) {
//        User user = new User();
//        user.setUserId(dto.getUserId());
//        user.setName(dto.getName());
//        user.setEmail(dto.getEmail());
//        user.setPhone(dto.getPhone());
//        user.setAddress(dto.getAddress());
//        user.setUsername(dto.getUsername());
//        user.setRole(dto.getRole());
//        user.setLicensePlate(dto.getLicensePlate());
//        user.setVehicleColor(dto.getVehicleColor());
//        user.setVehicleBrand(dto.getVehicleBrand());
//        user.setVehicleType(dto.getVehicleType());
//
//        Slot slot = slotService.findById(dto.getSlotId());
//        if (slot.getStatus().equals("free")) {
//            slot.setStatus("booked");
//            slot.setSlotId(dto.getSlotId());
//            user.setSlotId(slot);
//        }
//
//        userRepository.save(user);
//    }
    }
}
