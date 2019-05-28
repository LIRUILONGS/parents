package com.qst.interceptor;

import com.qst.pojo.User;
import org.springframework.ui.Model;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class role_Input_Interceptor  implements HandlerInterceptor {
    //在控制器处理请求方法前执行，返回值表示是否中断后续操作，T表示继续，F表示中断
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }
    //在控制器处理请求方法后，视图解析之前执行。可以通过该方法对请求域中的模型和视图做进一步的修改。
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

       Model model = (Model) request.getSession().getAttribute("molder");
        User user = (User) request.getSession().getAttribute("User");
        if (user.getRole().equals("管理员")){
            request.getRequestDispatcher("/role/login").forward(request,response);
        }

    }
    //在控制器处理请求方法执行后完成，即视图渲染结束后执行，可以通过此方法实现一些资源清理，记录日志等。
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
