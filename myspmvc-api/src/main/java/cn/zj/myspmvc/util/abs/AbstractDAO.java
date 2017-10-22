package cn.zj.myspmvc.util.abs;


import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class AbstractDAO {
//	@Resource
//	protected DataSource dataSource;
	@Resource
	protected JdbcTemplate jdbcTemplate;
}
