package com.example.demo.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {
	
	@Autowired
	//CodeGroupDao codeGroupDao;
	//CodeGroupDao dao  = new CodeGroupDao();
	CodeGroupDao dao; //이미 만들어진 객체를 집어 넣음, 소프트웨어의 결합도가 높음 (=DI, 객체 주입)
 	
//	public List<CodeGroupDto> selectList() {
//		
//		List<CodeGroupDto> list = dao.selectList();
//
//		return list;
//	}
	//위의 구문과 같은 내용임, 아래 구문을 더 많이 사용함
	public List<CodeGroupDto> selectList() { return dao.selectList();}

}
