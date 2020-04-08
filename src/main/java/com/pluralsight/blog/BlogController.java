package com.pluralsight.blog;

import com.pluralsight.blog.data.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.ModelMap;

@Controller
public class BlogController {
    private PostRepository postRepository;
    @RequestMapping("/")
    public String listPosts(ModelMap modelMap) {
        modelMap.put("title", "Blog Post 1");
        return "home";
    }

    public PostRepository(){

    }

}
