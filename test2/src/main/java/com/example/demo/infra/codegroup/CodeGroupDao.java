package com.example.demo.infra.codegroup;

import java.util.List;

public interface CodeGroupDao {

	public List<CodeGroupDto> selectList(); // 관례적으로 목록을 가져오는 함수 이름은 selectList를 주로 씀
	public CodeGroupDto selectOne(); // 데이터 하나만 리턴할 때에는 List가 아닌 Dto로가져옴
	
	
}
