package com.example.demo.services;

import com.example.demo.entities.City;
import com.example.demo.entities.Faculty;

import java.util.List;

public interface CityService {

    City getCity(Long id);
    List<City> getAllCities();
    City addCity(City city);
    City saveCity(City city);
    void deleteCity(Long id);

}
