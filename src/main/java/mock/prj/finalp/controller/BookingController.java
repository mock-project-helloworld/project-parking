package mock.prj.finalp.controller;

import mock.prj.finalp.dto.SlotDTO;
import mock.prj.finalp.dto.UserDTO;
import mock.prj.finalp.model.Slot;
import mock.prj.finalp.model.User;
import mock.prj.finalp.services.SlotService;
import mock.prj.finalp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parking")
public class BookingController {
    @Autowired
    SlotService slotService;
    @Autowired
    UserService userService;

    //KienHQ
    @GetMapping("/slot/{id}")
    public ResponseEntity<?> checkStatus(@RequestBody @PathVariable("id") Long id) {
        Slot slot = slotService.findById(id);
        if (slot.getStatus().equals("free")) {
            return new ResponseEntity<>(slot, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    //KienHQ
    @GetMapping("/user/{id}")
    public ResponseEntity<?> checkUser(@RequestBody @PathVariable("id") Long id) {
        User user = userService.findById(id);
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    //KienHQ
    @PostMapping(value = "/booking", produces = {"application/json", MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> booking(@RequestBody UserDTO userDTO) {
        userService.save(userDTO);
        return new ResponseEntity<>(userDTO, HttpStatus.CREATED);
    }
}
