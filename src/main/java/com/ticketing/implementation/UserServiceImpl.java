package com.ticketing.implementation;

import com.ticketing.dto.UserDTO;
import com.ticketing.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl  implements UserService {


    @Override
    public List<UserDTO> ListAllUSer() {
        return null;
    }

    @Override
    public UserDTO findByUserName(String username) {
        return null;
    }

    @Override
    public void save() {

    }

    @Override
    public UserDTO update(String username) {
        return null;
    }

    @Override
    public void delete(String username) {

    }
}
