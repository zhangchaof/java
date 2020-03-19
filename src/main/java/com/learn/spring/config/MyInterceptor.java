package com.learn.spring.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 作用:最常用的登录拦截、或是权限校验、或是防重复提交等
 * @program: java:MyInterceptor
 * @description: 自定义拦截器
 * @author: clark
 * @create: 2020-03-19 10:20
 **/
@Slf4j
public class MyInterceptor implements HandlerInterceptor {
    /**
     *
     * preHandle
     * 调用时间：Controller方法处理之前
     * 执行顺序：链式Intercepter情况下，Intercepter按照声明的顺序一个接一个执行
     * 若返回false，则中断执行，注意：不会进入afterCompletion
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        log.info("[**** MyInterceptor.preHandle() 拦截前****]" +
                handlerMethod.getBean().getClass().getSimpleName());
        // 放过拦截就返回true 否则拦住就返回false(不继续请求)
        return true;
    }

    /**
     * postHandle
     * 调用前提：preHandle返回true
     * 调用时间：Controller方法处理完之后，DispatcherServlet进行视图的渲染之前，也就是说在这个方法中你可以对ModelAndView进行操作
     * 执行顺序：链式Intercepter情况下，Intercepter按照声明的顺序倒着执行。
     * 备注：postHandle虽然post打头，但post、get方法都能处理
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        log.info("[**** MyInterceptor.postHandle() 控制器处理中****]" +
                handlerMethod.getBean().getClass().getSimpleName());
        log.info("[**** MyInterceptor.postHandle() ****] " + modelAndView);
    }

    /**
     * afterCompletion
     * 调用前提：preHandle返回true
     * 调用时间：DispatcherServlet进行视图的渲染之后
     * 多用于清理资源
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
            throws Exception {
        log.info("[**** MyInterceptor.afterCompletion()控制器处理后****]拦截处理完毕");
    }

}
