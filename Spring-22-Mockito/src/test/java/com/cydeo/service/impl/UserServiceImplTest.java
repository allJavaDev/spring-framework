package com.cydeo.service.impl;

import com.cydeo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class) //Mockito is providing Extension class to Junit 5 (@ExtendWidth)
class UserServiceImplTest {
    @Mock
    UserRepository userRepository;
    @InjectMocks
    UserServiceImpl userService;
    @Test
    public void testDeleteByUsername(){
        userService.deleteByUserName("mikesmith@cydeo.com");
        verify(userRepository).deleteByUserName("mikesmith@cydeo.com");
        verify(userRepository).findAll();
//        verify(userRepository, times(2)).deleteByUserName("mikesmith@cydeo.com");
//        verify(userRepository, atLeastOnce()).deleteByUserName("mikesmith@cydeo.com");
//        verify(userRepository, atMost(5)).deleteByUserName("mikesmith@cydeo.com");
//        verify(userRepository, atLeast(3)).deleteByUserName("mikesmith@cydeo.com");
//
    }

    @Test
    public void testDeleteByUsernameOrdering(){
        userService.deleteByUserName("mikesmith@cydeo.com");
        InOrder inOrder=inOrder(userRepository);
        inOrder.verify(userRepository).deleteByUserName("mikesmith@cydeo.com");
        inOrder.verify(userRepository).findAll(); //in reverse order it would fail
    }





}