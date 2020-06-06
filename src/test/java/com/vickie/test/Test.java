package com.vickie.test;

import java.util.List;

import com.vickie.dao.TAdminDao;
import com.vickie.pojo.TAdmin;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TAdmin tAdmin=new TAdmin(1, "zs001", "123", "zhangsan", "zhangsan@123.com", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		TAdminDao tAdminDao=new TAdminDao(); 
//		System.out.println(tAdminDao.insert(tAdmin));
		List<TAdmin> tAdmins= tAdminDao.selectAll();
		System.out.println(tAdmins.size());
		TAdmin tAdmin= tAdmins.get(0);
		System.out.println("UserInfo==============");
		System.out.println("Id:"+tAdmin.getId());
		System.out.println("LoginAcct:"+tAdmin.getLoginAcct());
		System.out.println("UserName:"+tAdmin.getUserName());
		System.out.println("Email:"+tAdmin.getEmail());
		System.out.println("-------------------------");
	}

}
