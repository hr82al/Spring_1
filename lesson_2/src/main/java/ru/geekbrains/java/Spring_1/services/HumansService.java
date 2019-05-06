package ru.geekbrains.java.Spring_1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.java.Spring_1.entities.Human;
import ru.geekbrains.java.Spring_1.repositories.HumansRepository;

import java.util.List;

@Service
public class HumansService {
    private HumansRepository humansRepository;

    public HumansService() {
    }

    @Autowired
    public void setHumansRepository(HumansRepository humansRepository) {
        this.humansRepository = humansRepository;
    }

    public Human getHumanById(int id) {
        return humansRepository.findById(id);
    }

    public List<Human> getHumansList() {
        return  humansRepository.getHumansList();
    }
}
