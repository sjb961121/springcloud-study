package memberservice.controller;

import memberservice.client.BookService;
import memberservice.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MemberController {
    @Autowired
    private BookService bookService;

    @GetMapping("/borrow")
    @ResponseBody
    public String borrow(String sn){
        Book book=bookService.findBysn(sn);
        return book.getName()+":"+book.getDesc()+"借阅成功";
    }

    @GetMapping("/compensate")
    @ResponseBody
    public String compensate(){
        Book book=new Book();
        book.setSn("5555");
        book.setName("赔偿图书");
        String result = bookService.createBook(book);
        return result;
    }

    @GetMapping("/search")
    @ResponseBody
    public List<Book> search(){
        Map param=new HashMap();
        param.put("sn","1111");
        param.put("name","x");
        List<Book> list = bookService.search(param);
        return list;
    }

}
