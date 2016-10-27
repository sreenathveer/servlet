package net.javaonline.spring.product.controller;

import java.util.List;

import net.javaonline.spring.product.dao.CountriesDAO;
import net.javaonline.spring.product.dto.Countries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@Autowired
	private CountriesDAO countriesDao;
	
	@RequestMapping(value="/home")
    public ModelAndView homePage() {
        ModelAndView model = new ModelAndView("home");
        model.addObject("welcomeMessage", "From hi function");
        return model;
    }
	
	@RequestMapping(value="/locations", method=RequestMethod.GET)
    public ModelAndView getCountries(@RequestParam("term") String name) {
		List<Countries> countries = countriesDao.list(name);
        ModelAndView model = new ModelAndView("home");
        model.addObject("countries", countries);
        return model;
    }
}
