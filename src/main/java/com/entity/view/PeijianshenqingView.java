package com.entity.view;

import com.entity.PeijianshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 配件申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
@TableName("peijianshenqing")
public class PeijianshenqingView  extends PeijianshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeijianshenqingView(){
	}
 
 	public PeijianshenqingView(PeijianshenqingEntity peijianshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, peijianshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
