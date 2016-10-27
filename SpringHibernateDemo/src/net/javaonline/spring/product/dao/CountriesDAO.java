package net.javaonline.spring.product.dao;

import java.util.List;

import net.javaonline.spring.product.dto.Countries;

public interface CountriesDAO {

	public List<Countries> list(String name);

}
