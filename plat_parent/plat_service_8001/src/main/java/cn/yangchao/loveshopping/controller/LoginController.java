package cn.yangchao.loveshopping.controller;

import cn.yangchao.loveshopping.domain.Employee;
import cn.yangchao.loveshopping.util.AjaxResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if ("yc".equals(employee.getName())&&"123".equals(employee.getPassword())){
            return AjaxResult.me();
        }
        //AjaxResult
        return AjaxResult.me().setSuccess(false).setMessage("密码或者用户名错误");
    }
}
