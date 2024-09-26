package com.sky.mapper;

import com.sky.annotation.AutoFill;
import com.sky.entity.DishFlavor;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishFlavorMapper {

    void insert(DishFlavor flavor);

    void BatchInsert(List<DishFlavor> flavors);

    @Delete("delete from sky_take_out.dish_flavor where dish_id=#{id}")
    void deleteByDishId(Long id);

    void deleteByDishIds(List<Long> ids);

    @Select("select * from sky_take_out.dish_flavor where dish_id = #{id}")
    List<DishFlavor> getById(Long id);

}
