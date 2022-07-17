package com.cydeo.service.impl;

import com.cydeo.dto.TaskDTO;
import com.cydeo.entity.Task;
import com.cydeo.mapper.TaskMapper;
import com.cydeo.repository.TaskRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TaskServiceImplTest {

    @Mock
    TaskRepository taskRepository;

    @Mock
    TaskMapper taskMapper;

    @InjectMocks
    TaskServiceImpl taskService;

    @ParameterizedTest
    @ValueSource(longs={1L, 2L,3L, -5L})
    void findById_test(long id){
        Task task = new Task();
        when(taskRepository.findById(id)).thenReturn(Optional.of(task));
        when(taskMapper.convertToDTO(task)).thenReturn(new TaskDTO());
        taskService.findById(id);

        verify(taskRepository).findById(id);
        verify(taskMapper).convertToDTO(any(Task.class ));

        verify(taskRepository, never()).findById(-5L);
    }

    @Test //uses BDD mockito class
    void findById_bdd_test(){
        //Given
        Task task = new Task();
        given(taskRepository.findById(anyLong())).willReturn(Optional.of(task));

        given(taskMapper.convertToDTO(task)).willReturn(new TaskDTO());

        taskService.findById(anyLong());

        then(taskRepository).should().findById(anyLong());

        then(taskRepository).should(never()).findById(-5L);
    }

    //Diffblue Cover is a third-party plugin creates unit tests

}