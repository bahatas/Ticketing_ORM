package com.ticketing.service;


import com.ticketing.dto.UserDTO;
import com.ticketing.entity.User;

import java.util.List;


public interface UserService {


    List<UserDTO> ListAllUSer();
    UserDTO findByUserName(String username);
    void save();
    UserDTO update(String username);
    void delete(String username);



}
