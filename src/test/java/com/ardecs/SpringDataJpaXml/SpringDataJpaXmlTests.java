package com.ardecs.SpringDataJpaXml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

@RunWith(SpringJUnit4ClassRunner.class)//специальный класс JUnit,требуется для поддержки контекста в JUnit
@ContextConfiguration(locations = {"classpath:META-INF/test-context.xml"})//указываем конфиг для работы автокофигурации контекста в тесте
public class SpringDataJpaXmlTests {
    @Autowired
    private CountryRepository countryRepository;


    @Test
    public void testCrud() {


        Country country1 = new Country("Germany");
        countryRepository.save(country1);
//        ArrayList<Country> countries = (ArrayList<Country>) countryRepository.findAll();
//        for (Country country : countries) {
//            System.out.println(country.toString());
//        }
//        Country country2=countryRepository.findById(Long.valueOf(76)).get();
//        country2.setCountryName("Test");
//        countryRepository.save(country2);
//        countryRepository.delete(country1);
//        System.out.println("TEST "+country2.toString());
//        countryRepository.deleteById(Long.valueOf(75));

    }

}
