package com.example.demo.controllers;

import java.util.List;

import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.BjsDao;
import com.example.demo.models.Bjs;

@ShellComponent
@ShellCommandGroup("Bjs commands")
public class BjsController {
    @Autowired
    private BjsDao bjsDao;

    @ShellMethod("Get a list of Batch Jobs in Table: Bjs (Only Important Information)")
    public List<Bjs> getBjs(String sol_id) {
        return bjsDao.getBjs(sol_id);
    }
}