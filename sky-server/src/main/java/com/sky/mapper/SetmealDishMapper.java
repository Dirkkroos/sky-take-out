package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {


    List<Long> getByIds(List<Long> ids);

    void batchInsert(List<SetmealDish> setmealDishes);

    void batchDeleteBySetId(List<Long> ids);
}
