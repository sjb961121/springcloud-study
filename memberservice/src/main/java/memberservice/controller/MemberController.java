package memberservice.controller;

import memberservice.entitiy.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class MemberController {

    @Autowired
    private RestTemplate restTemplate;

    //RestTemplate 负载均衡格式      http://微服务id/webapi地址
    @GetMapping("/borrow")
    @ResponseBody
    public String borrow(String sn){
        Book book = restTemplate.getForObject("http://book-service/bsn?sn=" + sn, Book.class);
        return book.getName()+":"+book.getDesc()+"借阅成功";
    }
}
