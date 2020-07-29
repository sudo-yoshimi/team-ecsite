package jp.co.internous.ocean.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.internous.ocean.model.domain.MstUser;
import jp.co.internous.ocean.model.form.UserForm;
import jp.co.internous.ocean.model.mapper.MstUserMapper;
import jp.co.internous.ocean.model.session.LoginSession;

@Controller
@RequestMapping("/ocean/user")
public class UserController {
	
	@Autowired
	MstUserMapper mstMapper;
	
	@Autowired
	LoginSession loginSession;
			
	@RequestMapping("/")
	public String index(Model m) {
		m.addAttribute("loginSession", loginSession);
		return "register_user";
	}
	
	//ユーザー名重複機能
	@ResponseBody
	@RequestMapping("/duplicatedUserName")
	public String dupUserName(@RequestBody UserForm form) {
		//DBに同じユーザー名があるかチェックし、0以上あれば重複（1）とする。
		List<MstUser> data = mstMapper.findByUserName(form.getUserName());
		String check = (data.size() > 0) ? "1" : "0";

		return check;
	}
	
	//新規登録
	@RequestMapping("/register")
	public String register(@RequestBody UserForm form) {
		MstUser user = new MstUser();
		
		user.setUserName(form.getUserName());
		user.setPassword(form.getPassword());
		user.setFamilyName(form.getFamilyName());
		user.setFirstName(form.getFirstName());
		user.setFamilyNameKana(form.getFamilyNameKana());
		user.setFirstNameKana(form.getFirstNameKana());
		user.setGender(form.getGender());
		mstMapper.insert(user);
		
		return "register_user";
	}
}