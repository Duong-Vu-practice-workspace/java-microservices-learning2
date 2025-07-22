package vn.edu.ptit.duongvct.practice1.socialmedia.user_service.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import vn.edu.ptit.duongvct.practice1.socialmedia.user_service.domain.User;
import vn.edu.ptit.duongvct.practice1.socialmedia.user_service.dto.RequestUserDTO;
import vn.edu.ptit.duongvct.practice1.socialmedia.user_service.dto.UserDTO;
import vn.edu.ptit.duongvct.practice1.socialmedia.user_service.repository.UserRepository;
import vn.edu.ptit.duongvct.practice1.socialmedia.user_service.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public UserDTO createUser(RequestUserDTO dto) {
        User user = this.modelMapper.map(dto, User.class);
        return this.modelMapper.map(this.userRepository.save(user), UserDTO.class);
    }
}
