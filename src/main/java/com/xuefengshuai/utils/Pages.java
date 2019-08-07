package com.xuefengshuai.utils;

import org.springframework.ui.Model;

import com.github.pagehelper.PageInfo;

public class Pages {

	public static void page(int pageNum, PageInfo info, Model model,String url,String name) {
		//如果當前頁<=1  上一页就是1
		if(pageNum<=1){
			info.setPrePage(1);
		}
		
		//如果当前页>=最后一页  尾页=总页数
		if(pageNum>=info.getPages()){
			info.setNextPage(info.getPages());
		}
		
		
		String fenye = "当前是" + pageNum + "/" + info.getPages() + "页--共" + 
						info.getTotal() + "条数据&nbsp;&nbsp;  <a href='list?pageNum=1"+"&name="+name+""+url+"'>首页</a>&nbsp;&nbsp;"
						+ "<a href='list?pageNum="+info.getPrePage()+"&name="+name+""+url+"'>上一页</a>&nbsp;&nbsp;"
						+ "<a href='list?pageNum="+info.getNextPage()+"&name="+name+""+url+"'>下一页</a>&nbsp;&nbsp;"
						+ "<a href='list?pageNum="+info.getPages()+"&name="+name+""+url+"'>尾页</a>";


		model.addAttribute("fenye", fenye);

	}

}
