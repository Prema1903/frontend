
package com.prema;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookRepo extends JpaRepository<Book,String> {
    @Query(value="Select sub_doc from book where sub_code=:subCode",nativeQuery = true)
    public byte[] findSubDocBySubCode(@Param("subCode") String subCode);
}
  