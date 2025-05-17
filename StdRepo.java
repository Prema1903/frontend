

package com.prema;

import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface StdRepo extends CrudRepository<Std, String> {

    // No need to declare save() method, it is already provided by CrudRepository

    Optional<Std> findById(String email); // Correct return type
}
