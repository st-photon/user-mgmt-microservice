package com.photon.user.helpers;

import com.photon.user.dto.UserDTO;
import com.photon.user.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class UserMapperHelper {

    public UserDTO map(User user) {
        final UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getUserId());
        userDTO.setUserEmailId(user.getUserEmailId());
        userDTO.setUserDOB(user.getUserDOB());
        userDTO.setUserFirstName(user.getUserFirstName());
        userDTO.setUserLastName(user.getUserLastName());
        userDTO.setUserGender(user.getUserGender());
        return userDTO;
    }
}
