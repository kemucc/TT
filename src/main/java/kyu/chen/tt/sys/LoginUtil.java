package kyu.chen.tt.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kyu_c on 2016/5/31.
 */

@Controller
@RequestMapping("")
public class LoginUtil {

    @RequestMapping(value = "")
    public String index(){
        return "index";
    }
}
