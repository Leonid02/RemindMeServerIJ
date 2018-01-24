package com.alm.remindme.server.service;

import com.alm.remindme.server.entity.Remind;
import com.alm.remindme.server.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReminderServiceImpl implements ReminderService{
    @Autowired
    private RemindRepository repository;
    public List<Remind> getAll(){
        return repository.findAll();
   }
    public Remind getByID(long id){
        return repository.getOne(id);
    }
    public Remind save(Remind remind){
        return repository.saveAndFlush(remind);
    }
    public void remove(long id){
        repository.deleteById(id);
    }
}
