package no.acntech.tutorial.spring.service;

import no.acntech.tutorial.spring.repository.DummyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DummyService {

    private final DummyRepository repository;

    @Autowired
    public DummyService(final DummyRepository repository) {
        this.repository = repository;
    }

    public List<String> findInfo() {
        return repository.findInfo();
    }
}
