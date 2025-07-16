package vn.edu.ptit.duongvct.practice1.socialmedia.user_service.service.impl;

import org.springframework.stereotype.Service;
import vn.edu.ptit.duongvct.practice1.socialmedia.user_service.dto.UserDTO;
import vn.edu.ptit.duongvct.practice1.socialmedia.user_service.repository.UserRepository;
import vn.edu.ptit.duongvct.practice1.socialmedia.user_service.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO createUser() {
        return null;
    }
}
