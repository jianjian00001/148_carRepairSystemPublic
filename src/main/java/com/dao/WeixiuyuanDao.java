package com.dao;

import com.entity.WeixiuyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeixiuyuanVO;
import com.entity.view.WeixiuyuanView;


/**
 * 维修员
 * 
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
public interface WeixiuyuanDao extends BaseMapper<WeixiuyuanEntity> {
	
	List<WeixiuyuanVO> selectListVO(@Param("ew") Wrapper<WeixiuyuanEntity> wrapper);
	
	WeixiuyuanVO selectVO(@Param("ew") Wrapper<WeixiuyuanEntity> wrapper);
	
	List<WeixiuyuanView> selectListView(@Param("ew") Wrapper<WeixiuyuanEntity> wrapper);

	List<WeixiuyuanView> selectListView(Pagination page,@Param("ew") Wrapper<WeixiuyuanEntity> wrapper);
	
	WeixiuyuanView selectView(@Param("ew") Wrapper<WeixiuyuanEntity> wrapper);
	
}
