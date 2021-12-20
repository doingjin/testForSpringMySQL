package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AAService")
public class AAServiceImpl implements AAService {
	
	@Autowired
	private AADao dao;
	
	public void insert(AAVo vo) {
		System.out.println("serviceimpl+"+vo.getAname());
		dao.insert(vo);
	}
	
	
}
