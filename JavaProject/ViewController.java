package com.spring.moviecatalong.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ViewController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getIndex(HttpServletRequest request, HttpServletResponse HttpServletResponse){
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }  

    @RequestMapping(value = "/Favourites", method = RequestMethod.GET)
    public ModelAndView getFavourites(HttpservletRequuest request, HttpServletResponse response){
        ModelandView mav = new ModelandView("Favourites");
        return mav;
    }


    @RequestMapping(value = "/Watch-Later", method = RequestMethod.GET)
    public ModelAndView getWatchLater(HttpServletRequest request, HttpsrvletResponse response){
        ModelAndView mav = new modelAndCiew("Watch-Later");
        return mav;
    }

    @RequestMapping(value = "/Watched", method = RequestMethod.GET)
    public ModelAndView getWatched(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mav = new ModelAndView("Watched");
        return mav;
    }

}
