package com.photon.user.services;

import com.photon.user.dto.UserDTO;
import com.photon.user.entity.User;
import com.photon.user.helpers.UserMapperHelper;
import com.photon.user.repository.UserRepositoryWrapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserQueryServiceImpl implements UserQueryService {

    private final UserRepositoryWrapper userRepositoryWrapper;

    private final UserMapperHelper userMapperHelper;

    @Transactional(readOnly = true)
    @Override
    public UserDTO fetchById(int userId) {
        final User user = this.userRepositoryWrapper.fetchById(userId);
        return userMapperHelper.map(user);
    }
}
