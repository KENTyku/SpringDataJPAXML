package com.ardecs.SpringDataJpaXml;

import com.ardecs.SpringDataJpaXml.Entity.*;
import com.ardecs.SpringDataJpaXml.Repository.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)//специальный класс JUnit,требуется для поддержки контекста в JUnit
@ContextConfiguration(locations = {"classpath:META-INF/test-context.xml"})
//указываем конфиг для работы автокофигурации контекста в тесте
public class SpringDataJpaXmlTests {
    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderPositionRepository orderPositionRepository;
    private OrderPositionId id;

    @Test
    public void testCrud() {


//        Client client = new Client("Yuri", "9051111111");
        Client client=clientRepository.findById((long) 33).get();
        clientRepository.save(client);
        Order order = new Order("11.11.2011", client);
//        orderRepository.save(order);
        Product product = productRepository.findByName("Sony");
        id = new OrderPositionId(order, product);
        OrderPosition orderPosition = new OrderPosition(id, 5);
        List<OrderPosition> list = new ArrayList<>();
        list.add(orderPosition);

        product = productRepository.findByName("iPhone");
        id = new OrderPositionId(order, product);
        orderPosition = new OrderPosition(id, 2);
        list.add(orderPosition);

        order.setOrderPositions(list);
        orderRepository.save(order);

//show all orders for client
        List<Order> ordersList =  orderRepository.findAllOrder(33);
        for (Order item :ordersList) {
            System.out.println(item.getId());

        }


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
