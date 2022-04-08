package mock.prj.finalp.services;

import mock.prj.finalp.dto.UserDTO;
import mock.prj.finalp.model.User;

public interface UserService {
    User findById(Long id);

    void save(UserDTO dto );
}
