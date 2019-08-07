package com.xuefengshuai.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xuefengshuai.dao.VegeDao;
import com.xuefengshuai.domain.Type;
import com.xuefengshuai.domain.Vege;
@Service
public class VegeServiceImpl implements VegeService {
	@Resource
	private VegeDao dao;
	@Override
	public List<Vege> selects(String name) {
		// TODO Auto-generated method stub
		return dao.selects(name);
	}
	@Override
	public int del(Integer id) {
		// TODO Auto-generated method stub
		return dao.del(id);
	}
	@Override
	public Vege look(Integer id) {
		// TODO Auto-generated method stub
		return dao.look(id);
	}
	@Override
	public List<Type> getType() {
		// TODO Auto-generated method stub
		return dao.getType();
	}
	@Override
	public int update(Vege v) {
		// TODO Auto-generated method stub
		return dao.update(v);
	}
	@Override
	public int add(Vege v) {
		// TODO Auto-generated method stub
		return dao.add(v);
	}
	@Override
	public int deletePatch(String ids) {
		// TODO Auto-generated method stub
		return dao.deletePatch(ids);
	}

}
