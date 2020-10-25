package memberservice.client;

import memberservice.entity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient("book-service")
public interface BookService {

    @GetMapping("/bsn")
    public Book findBysn(@RequestParam("sn") String sn);

    @PostMapping("/create")
    public String createBook(@RequestBody Book book);

    @GetMapping("/search")
    public List<Book> search(@RequestParam Map book);


}
