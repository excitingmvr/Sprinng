package com.example.demo.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
	@Autowired
	 CodeGroupService service;
	//CodeGroupService codeGroupService;

	@RequestMapping(value = "/codeGroupXdmList")
	public String codeGroupXdmList(Model model) throws Exception {       
		
		//List<CodeGroupDto> codeGroupDtos =service.selectList();
		
		//for (CodeGroupDto a : codeGroupDtos) {
			//System.out.println(a.getName());
		//}
		
		model.addAttribute("list", service.selectList()); //리턴 데이터 값 = list, 받아오자마자 바로 넘겨버림
																										//model = html에서 넘기려는 데이터가 model이라는 이름으로 존재한다는 뜻
		
		//model.addAttribute("list", codeGroupDtos); //의미 : list = codeGroupDtos
		//model 객체의 addAttribute 함수가 작업을 처리함
		
		return "codeGroupXdmList"; //
	}
	

}
