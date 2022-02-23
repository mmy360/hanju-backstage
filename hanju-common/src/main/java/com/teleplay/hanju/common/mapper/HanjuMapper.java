package com.teleplay.hanju.common.mapper;

import com.teleplay.hanju.common.entity.Hanju;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 电视剧表，包含电视剧所有信息 Mapper 接口
 * </p>
 *
 * @author 
 * @since 2022-02-15
 */
@Mapper
public interface HanjuMapper extends BaseMapper<Hanju> {

    public String getIdByName(String teleplayName);

    void updateByName(@Param("name") String name, @Param("alias") String alias);

    Hanju selectByName(@Param("name") String name);
}
