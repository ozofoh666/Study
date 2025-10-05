package org.example.controller;
import jakarta.annotation.Resource;
import org.example.entity.Order;
import org.example.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/orders")
public class TestController {
    @Resource
    private OrderService orderService;

    @GetMapping("/{id}")
    public String getOrderDetail(@PathVariable int id,Model model) {
        Order order = orderService.getOrderDetail(id);
        System.out.println(order.toString());
        model.addAttribute("id", order.getId());
        model.addAttribute("name", order.getName());
        model.addAttribute("orderTime", order.getOrderTime());
        model.addAttribute("orderGood", order.getOrderGood());
        return "index";
    }
}
