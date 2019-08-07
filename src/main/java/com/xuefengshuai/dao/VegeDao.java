package com.xuefengshuai.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.xuefengshuai.domain.Type;
import com.xuefengshuai.domain.Vege;

public interface VegeDao {
	/**
	 * 
	 * @Title: 全部查询selects 
	 * @Description: TODO
	 * @param name
	 * @return
	 * @return: List<Vege>
	 */
	List<Vege> selects(@Param("name")String name);
	/**
	 * 单删
	 * @Title: del 
	 * @Description: TODO
	 * @param id
	 * @return
	 * @return: int
	 */
	@Delete("delete from vege where id=#{id}")
	int del(Integer id);
	/**
	 * 查看
	 * @Title: look 
	 * @Description: TODO
	 * @param id
	 * @return
	 * @return: Vege
	 */
	Vege look(Integer id);
	/**
	 * 回显查看
	 * @Title: getType 
	 * @Description: TODO
	 * @return
	 * @return: List<Type>
	 */
	@Select("select * from type")
	List<Type> getType();
	int update(Vege v);
	/**
	 * 添加
	 * @Title: add 
	 * @Description: TODO
	 * @param v
	 * @return
	 * @return: int
	 */
	int add(Vege v);
	@Delete("delete from vege where id in (${ids})")
	int deletePatch(@Param("ids")String ids);
}
