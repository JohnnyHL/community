package com.sjl.community.controller;

import com.sjl.community.dto.QuestionDto;
import com.sjl.community.mapper.QuestionMapper;
import com.sjl.community.mapper.UserMapper;
import com.sjl.community.model.Question;
import com.sjl.community.model.User;
import com.sjl.community.service.QuestionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author song
 * @create 2020/2/16 16:19
 */
@Controller
public class PublishController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("/publish")
    public String publish() {
        return "publish";
    }

    /**
     * 发布问题
     * @param id
     * @param title
     * @param description
     * @param tags
     * @param model
     * @param request
     * @return
     */
    @PostMapping("/publish")
    public String doPublish(
            @RequestParam(value = "id", required = false) Long id,
            @RequestParam(value = "title", required = false) String title,
            @RequestParam(value = "description", required = false) String description,
            @RequestParam(value = "tags", required = false) String tags,
            Model model,
            HttpServletRequest request) {
        //从session中获取user
        User user = (User) request.getSession().getAttribute("user");

        model.addAttribute("title", title);
        model.addAttribute("description", description);
        model.addAttribute("tags", tags);

        //错误信息
        if (user == null) {
            model.addAttribute("error", "用户未登陆");
            return "publish";
        }
        //判断是否填入信息
        if (StringUtils.isBlank(title)) {
            model.addAttribute("error", "标题不能为空");
            return "publish";
        }
        if (StringUtils.isBlank(description)) {
            model.addAttribute("error", "描述信息不能为空");
            return "publish";
        }
        if (StringUtils.isBlank(tags)) {
            model.addAttribute("error", "标签不能为空");
            return "publish";
        }

        //添加数据
        Question question = new Question();
        question.setId(id);
        question.setTitle(title.trim());
        question.setDescription(description);
        question.setTags(tags);
        question.setCreator(user.getId());

        questionService.createOrUpdateQuestion(question);

        //发布成功，返回主页面
        return "redirect:/";
    }


    /**
     * 修改问题
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/publish/{id}")
    public String edit(@PathVariable("id") Long id, Model model){
        //通过问题id查找问题，存入作用域
        QuestionDto question = questionService.findById(id);
        model.addAttribute("id", question.getId());
        model.addAttribute("title", question.getTitle());
        model.addAttribute("description", question.getDescription());
        model.addAttribute("tags", question.getTags());
        return "publish";
    }
}