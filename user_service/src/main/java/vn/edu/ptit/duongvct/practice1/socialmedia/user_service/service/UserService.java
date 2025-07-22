package vn.edu.ptit.duongvct.practice1.socialmedia.user_service.service;

import vn.edu.ptit.duongvct.practice1.socialmedia.user_service.dto.RequestUserDTO;
import vn.edu.ptit.duongvct.practice1.socialmedia.user_service.dto.UserDTO;

public interface UserService {
    public UserDTO createUser(RequestUserDTO dto);
    public UserDTO editUser();
}
