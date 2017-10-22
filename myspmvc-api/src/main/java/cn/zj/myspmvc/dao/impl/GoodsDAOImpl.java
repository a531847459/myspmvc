package cn.zj.myspmvc.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import cn.zj.myspmvc.dao.IGoodsDAO;
import cn.zj.myspmvc.util.abs.AbstractDAO;
import cn.zj.myspmvc.vo.Goods;
@Repository
public class GoodsDAOImpl extends AbstractDAO implements IGoodsDAO {
	@Override
	public boolean doCreate(Goods vo) throws SQLException {
		String sql="insert into goods(name,price,photo,dflag,iid) values(?,?,?,?,?)";
		int len=jdbcTemplate.update(sql, vo.getName(),vo.getPrice(),vo.getPhoto(),vo.getDflag(),vo.getIid());
		System.out.println(len);
		return len>0;
	}

	@Override
	public boolean doEdit(Goods vo) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doRemove(Long id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doRemove(Set<Long> ids) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Goods findById(Long id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> findAll(Long currentPage, Integer lineSize) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> findSplit(String column, String keyWord, Long currentPage, Integer lineSize) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getAllCount() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getSplitCount(String column, String keyWord) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
