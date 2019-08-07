package com.xuefengshuai.service;

import java.util.List;

import com.xuefengshuai.domain.Type;
import com.xuefengshuai.domain.Vege;

public interface VegeService {
	/**
	 * 全部查询
	 * @Title: selects 
	 * @Description: TODO
	 * @param name
	 * @return
	 * @return: List<Vege>
	 */
	List<Vege> selects(String name);
	/**
	 * 单删
	 * @Title: del 
	 * @Description: TODO
	 * @param id
	 * @return
	 * @return: int
	 */
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
	 * 下拉框回显
	 * @Title: getType 
	 * @Description: TODO
	 * @return
	 * @return: List<Type>
	 */
	List<Type> getType();

	int update(Vege v);

	int add(Vege v);

	int deletePatch(String ids);
}
