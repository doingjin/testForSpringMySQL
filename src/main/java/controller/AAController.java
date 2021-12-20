package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.AAService;
import model.AAVo;

@Controller
public class AAController {
	
	@Autowired
	private AAService ava;
	
	@RequestMapping("/check.do")
	public String signup(AAVo vo, Model model) throws Exception{
		System.out.println("name: "+vo.getAname());
		ava.insert(vo);
		
		return "redirect:index.jsp";
	}

}
