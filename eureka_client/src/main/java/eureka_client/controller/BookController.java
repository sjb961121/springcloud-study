package eureka_client.controller;

import eureka_client.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    @GetMapping("/bsn")
    public Book findBysn(String sn, HttpServletRequest request){
        Book book = null;
        if(sn.equals("1111")){
            book = new Book("1111", "测试图书1", String.valueOf(request.getLocalPort()));
        }else if(sn.equals("2222")){
            book = new Book("2222", "测试图书2", String.valueOf(request.getLocalPort()));
        }else if(sn.equals("3333")){
            book = new Book("3333", "测试图书3", String.valueOf(request.getLocalPort()));
        }
        return book;
    }

    @PostMapping("/create")
    public String createBook(@RequestBody Book book){
        return book.getName()+"创建成功";
//        return name+"创建成功";
    }

    @GetMapping("/search")
    public List<Book> search(Book book){
        List list=new ArrayList();
        if (book.getSn().equals("1111")&&book.getName().equals("x")){
            list.add(new Book("1111","xxxx",""));
        }
        return list;
    }
}
