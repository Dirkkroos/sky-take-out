package com.sky.service;

import com.sky.annotation.AutoFill;
import com.sky.dto.DishDTO;
import com.sky.enumeration.OperationType;
import org.springframework.stereotype.Service;

public interface DishService {

    void saveWithFlavor(DishDTO dishDTO);
}
