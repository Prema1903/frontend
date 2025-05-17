
package com.prema;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.http.ResponseEntity;
@Service
public class BookService {
    @Autowired
    BookRepo rep;
    
    public Book addBook(Book b)
    {
        return rep.save(b);
    }
    
    public List<Book> getAllBook()
    {
       return rep.findAll();
    }
    public byte[] getDoc(String subCode)
    {
      return rep.findSubDocBySubCode(subCode);
    }
    
}
