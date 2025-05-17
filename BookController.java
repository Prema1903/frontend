
package com.prema;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin("*")
@RequestMapping("book")
public class BookController {
 
    @Autowired
    BookService ser;
    @PostMapping
    public Book addBook(@RequestParam MultipartFile subDoc,@RequestParam String subCode,@RequestParam String subName)
    {
        try{
        Book book = new Book();
        book.setSubCode(subCode);
        book.setSubName(subName);
        book.setSubDoc(subDoc.getBytes());
        return ser.addBook(book);
        }
        catch(Exception ex)
        {
         return  new Book();
        }
    }
    
    @GetMapping
    public List<Book> getAllBook()
    {
        return ser.getAllBook();
    }
    
    @GetMapping("/{subCode}")
    public ResponseEntity<byte[]> getBook(@PathVariable String subCode)
    {
        byte[] data=ser.getDoc(subCode);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_PDF).body(data);
    }
}
