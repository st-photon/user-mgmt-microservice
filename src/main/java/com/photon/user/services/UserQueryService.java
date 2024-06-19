package com.photon.user.services;

import com.photon.user.dto.UserDTO;

public interface UserQueryService {

    UserDTO fetchById(int userId);
}
