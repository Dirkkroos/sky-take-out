package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.annotation.AutoFill;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.entity.Setmeal;
import com.sky.enumeration.OperationType;
import com.sky.vo.SetmealVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmaelMapper {
    @AutoFill(OperationType.INSERT)
    void insert(Setmeal setmeal);

    List<SetmealVO> select(SetmealPageQueryDTO setmealPageQueryDTO);

    @Select("select * from sky_take_out.setmeal where id=#{id}")
    Setmeal selectById(Long id);

    void batchDelete(List<Long> ids);

    void update(Setmeal setmeal);
}
