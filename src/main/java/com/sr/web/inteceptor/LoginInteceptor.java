package com.sr.web.inteceptor;

import com.sr.service.inte.UserService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInteceptor extends HandlerInterceptorAdapter {

    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String id = "111@qq.com";
        String pd = "123456";
        String loginId = request.getParameter("inputEmail");
        String password = request.getParameter("inputPassword");
        if(loginId!=null && password != null){
            if ( loginId.equals(id) && password.equals(pd)) {
                return true;
            }
            request.setAttribute("errorMsg","用户不存在或者用户名密码不匹配");
        }
        request.setAttribute("inputEmail",loginId);
        request.setAttribute("inputPassword",password);
        request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
        return false;/* User user = userService.getUserByLoginId(loginId);
        if(user != null ){
            if(password.equals(user.getPassword())){
                response.sendRedirect("/WEB-INF/pages/mainJsp.jsp");
                return true;
            }
        }
        request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request,response);
        return false;*/
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}