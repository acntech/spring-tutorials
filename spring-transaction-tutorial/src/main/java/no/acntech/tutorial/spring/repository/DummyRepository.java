package no.acntech.tutorial.spring.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.springframework.transaction.annotation.Propagation.MANDATORY;

@Transactional(propagation = MANDATORY)
@Repository
public class DummyRepository {

    public List<String> findInfo() {
        return Arrays.asList("Hey", "Ho");
    }
}
