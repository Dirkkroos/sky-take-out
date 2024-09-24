package com.sky.mapper;

import com.sky.annotation.AutoFill;
import com.sky.entity.Setmeal;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SetmaelMapper {
    @AutoFill(OperationType.INSERT)
    void insert(Setmeal setmeal);
}
