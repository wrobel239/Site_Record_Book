package pl.coderslab.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/index")
public class HomePageController {

    @GetMapping("")
    @ResponseBody
    public String getIndexPage(){
        return "IndexPage";
    }
}
