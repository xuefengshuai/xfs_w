package com.xuefengshuai.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xuefengshuai.domain.Type;
import com.xuefengshuai.domain.Vege;
import com.xuefengshuai.service.VegeService;
import com.xuefengshuai.utils.Pages;

@Controller
public class VegeController {
	@Resource
	private VegeService service;
	@RequestMapping("list")
	/**
	 * 
	 * @Title: 全部查询 
	 * @Description: TODO
	 * @param model
	 * @param pageNum
	 * @param name
	 * @return
	 * @return: String
	 */
	public String  selects(Model model,@RequestParam(defaultValue = "0")Integer pageNum,@RequestParam(defaultValue = "")String name) {
		PageHelper.startPage(pageNum, 3);
		List<Vege> list = service.selects(name);
		model.addAttribute("name", name);
		PageInfo<Vege> info=new PageInfo<>(list);
		Pages.page(pageNum, info, model, "",name);
		model.addAttribute("list", list);
		return "list";
	}
	/**
	 * 
	 * @Title: 单独删除 
	 * @Description: TODO
	 * @param id
	 * @return
	 * @return: boolean
	 */
	@RequestMapping("del")
	@ResponseBody
	public boolean del(Integer id) {
		int i=service.del(id);
		return i>0;
	}
	/**
	 * 获得类型
	 * @Title: getType 
	 * @Description: TODO
	 * @return
	 * @return: List<Type>
	 */
	@RequestMapping("getType")
	@ResponseBody
	public List<Type> getType() {
		List<Type> t=service.getType();
		System.out.println(t);
		return t;
	}
	/**
	 * 跳转到添加页面
	 * @Title: toAdd 
	 * @Description: TODO
	 * @return
	 * @return: String
	 */
	@RequestMapping("toAdd")
	public String toAdd() {
		return"add";
	}
	@RequestMapping("deletePatch")
	@ResponseBody
	public boolean deletePatch(String ids) {
		int i=service.deletePatch(ids);
		return i>0;
	}
	@RequestMapping("update")
	@ResponseBody
	public boolean update(Vege v) {
		System.out.println(v);
		int i=service.update(v);
		return i>0;
		
	}
	@RequestMapping("add")
	@ResponseBody
	public boolean add(Vege v) {
		int i=service.add(v);
		return i>0;
		
	}
	@RequestMapping("look")
	public String look(Integer id,Model model) {
		Vege v=service.look(id);
		model.addAttribute("v", v);
		return "look";
	}
	@RequestMapping("toUpdate")
	public String toUpdate(Integer id,Model model) {
		Vege v=service.look(id);
		model.addAttribute("v", v);
		return "update";
	}
}
