package com.alm.remindme.server.controller;

import com.alm.remindme.server.entity.Remind;
import com.alm.remindme.server.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
public class ReminderController {
    @Autowired
    private ReminderService service;

    @RequestMapping(value = "//reminders", method = RequestMethod.GET)
    @ResponseBody
    public List <Remind> getAllReminders() {
        List<Remind> list = service.getAll();

        return list;
    }
    @RequestMapping(value = "//reminders/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(@PathVariable("id") long remindID){

        return service.getByID(remindID);
    }
    @RequestMapping(value = "//reminders", method = RequestMethod.POST)
    @ResponseBody
    public Remind saveReminder(@RequestBody Remind remind){

        return service.save(remind);
    }

    @RequestMapping(value = "//reminders/{id}", method = RequestMethod.POST)
    @ResponseBody
    public void delete(@PathVariable("id") long id){
        service.remove(id);
    }

}


