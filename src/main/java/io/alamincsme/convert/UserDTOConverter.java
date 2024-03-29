package io.alamincsme.convert;

import io.alamincsme.dto.UserDTO;
import io.alamincsme.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDTOConverter {

    @Autowired
    private ModelMapper modelMapper;
    public UserDTO convertUserToUserDTO (User user) {
        UserDTO userDTO =  modelMapper.map(user , UserDTO.class);
        userDTO.setFullName(user.getFirstName() + " " + user.getLastName());
        return userDTO ;
    }

    public User convertUserDTOToUser (UserDTO userDTO) {
        return modelMapper.map(userDTO , User.class);
    }
}
