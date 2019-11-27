package cn.cepri.myweb.controller;

import cn.cepri.myweb.model.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//simulation中的chart_1会访问此处Pie的数据
@RestController
public class Pie {
    @RequestMapping(value = "/pie", method = RequestMethod.POST)
    public List<Car> queryCarCategory() {
        System.out.println("Here comes the car!");

        Car car1 = new Car(335, "客运车");
        Car car2 = new Car(335, "危险品运输车");
        Car car3 = new Car(150, "网约车");
        Car car4 = new Car(200, "学生班车");

        List<Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);

        System.out.println("Go!");
        return list;
    }
}
