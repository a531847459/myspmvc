package cn.zj.myspmvc.jdbc;

import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.zj.myspmvc.dao.IGoodsDAO;
import cn.zj.myspmvc.vo.Goods;

@ContextConfiguration(locations={"classpath:spring/spring-*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDemo {
	@Resource
	private DataSource dataSource;
	@Resource
	private IGoodsDAO goodsDAO;
	@Test
	public void TestConnect() {
		try {
			System.out.println(dataSource.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestAdd() throws SQLException {
		Goods vo=new Goods();
		vo.setName("razer");
		vo.setPrice(158.0);
		vo.setPhoto("no.photo");
		vo.setDflag(0);
		vo.setIid(1L);
		goodsDAO.doCreate(vo);
	}
}
