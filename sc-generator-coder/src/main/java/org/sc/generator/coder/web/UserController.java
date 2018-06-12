package org.sc.generator.coder.web;

import java.util.List;

import javax.annotation.Resource;

import org.sc.generator.coder.core.Result;
import org.sc.generator.coder.core.ResultGenerator;
import org.sc.generator.coder.model.User;
import org.sc.generator.coder.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * Created by cuiwenbin on 2018/06/11.
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;

	@PostMapping("/add")
	public Result add(User user) {
		userService.save(user);
		return ResultGenerator.genSuccessResult();
	}

	@PostMapping("/delete")
	public Result delete(@RequestParam Integer id) {
		userService.deleteById(id);
		return ResultGenerator.genSuccessResult();
	}

	@PostMapping("/update")
	public Result update(User user) {
		userService.update(user);
		return ResultGenerator.genSuccessResult();
	}

	@PostMapping("/detail")
	public Result detail(@RequestParam Integer id) {
		User user = userService.findById(id);
		return ResultGenerator.genSuccessResult(user);
	}

	@SuppressWarnings("all")
	@PostMapping("/list")
	public PageInfo list(@RequestParam(defaultValue = "0") Integer page,
			@RequestParam(defaultValue = "0") Integer size) {
		PageHelper.startPage(page, size);
		List<User> list = userService.findAll();
		PageInfo pageInfo = new PageInfo(list);

		String str = ResultGenerator.genSuccessResult(pageInfo).getData().toString();
		System.out.println(str);
		return pageInfo;
	}

	@PostMapping("/getOne")
	public Result getOne() {
		User user = userService.findById(1);
		return ResultGenerator.genSuccessResult(user);
	}

}
