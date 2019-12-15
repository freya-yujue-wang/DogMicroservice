package com.wyjsusan.DogMicroservice.repository;

import com.wyjsusan.DogMicroservice.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
