package com.zion.school.controller;

import com.zion.school.model.AuthenticationBean;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Lenovo on 12-08-2021.
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class BasicAuthController {

    @GetMapping(path = "/basicauth")
    public AuthenticationBean helloWorldBean() {
        return new AuthenticationBean("You are authenticated");
    }


//    @RequestMapping(value = {"/logout"}, method = RequestMethod.GET)
//    public String fetchSignoutSite(HttpServletRequest request, HttpServletResponse response){
//
//        HttpSession session = request.getSession(false);
//        SecurityContextHolder.clearContext();
//
//        session = request.getSession(false);
//        if(session != null) {
//            session.invalidate();
//        }
//
//        for(Cookie cookie : request.getCookies()) {
//            cookie.setMaxAge(0);
//        }
//
//        return "logout successfully";
//    }

}