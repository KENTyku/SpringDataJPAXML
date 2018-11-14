package com.ardecs.SpringDataJpaXml;

import com.ardecs.SpringDataJpaXml.Entity.Country;
import com.ardecs.SpringDataJpaXml.Repository.CountryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//специальный класс JUnit,требуется для поддержки контекста в JUnit
@ContextConfiguration(locations = {"classpath:META-INF/test-context.xml"})//указываем конфиг для работы автокофигурации контекста в тесте
public class SpringDataJpaXmlTests {
    @Autowired
    private CountryRepository countryRepository;


    @Test
    public void testCrud() {


        Country country = new Country("Germany");
        countryRepository.save(country);
//        ArrayList<Country> countries = (ArrayList<Country>) countryRepository.findAll();
//        for (Country country : countries) {
//            System.out.println(country.toString());
//        }
//        Country country2=countryRepository.findById(Long.valueOf(76)).get();
//        country2.setCountryName("Test");
//        countryRepository.save(country2);
//        countryRepository.delete(country);
//        System.out.println("TEST "+country2.toString());
//        countryRepository.deleteById(Long.valueOf(75));

    }

}
