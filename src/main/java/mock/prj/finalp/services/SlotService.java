package mock.prj.finalp.services;

import mock.prj.finalp.dto.SlotDTO;
import mock.prj.finalp.model.Slot;

public interface SlotService {
    Slot findById(Long id);


    void save(SlotDTO slot);
}
