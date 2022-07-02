package com.cydeo.repository.impl;

import com.cydeo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class) //Mockito is providing Extension class to Junit 5 (@ExtendWidth)
class UserServiceImplTest {
    @Mock
    UserRepository userRepository;
    @InjectMocks
    UserServiceImpl userService;
    @Test
    public void testDeleteByUsername(){
        userService.deleteByUserName("mikesmith@cydeo.com");
        Mockito.verify(userRepository).deleteByUserName("mikesmith@cydeo.com");
    }

}