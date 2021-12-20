package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AADao {
	
	private String insert="insert into aa (aname) values (?)";
	
	@Autowired
	private JdbcTemplate jt;
	
	public void insert(AAVo vo) {
		System.out.println("ccc : "+vo.getAname());
		jt.update(insert, vo.getAname());
		System.out.println("okok");
	}
	
}
