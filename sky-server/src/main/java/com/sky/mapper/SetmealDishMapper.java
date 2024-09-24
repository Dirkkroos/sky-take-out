package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {


    List<Long> getByIds(List<Long> ids);

    void batchInsert(List<SetmealDish> setmealDishes);

    void batchDeleteBySetId(List<Long> ids);

    @Select("select * from sky_take_out.setmeal_dish where setmeal_id = #{id}")
    List<SetmealDish> getBySetmealId(Long id);

    @Delete("delete from sky_take_out.setmeal_dish where setmeal_id=#{setmealId}")
    void deleteBySetmealId(Long setmealId);

}
