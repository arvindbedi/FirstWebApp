package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.RoomRepo;
import com.example.demo.model.Room;



@Controller
public class RoomController {
	@Autowired
	RoomRepo repo;
	@RequestMapping("/")
	public String room()
	{
		return "Room.jsp";
	}
	@RequestMapping("addRoom")
	public String addRoom(Room room)
	{
		repo.save(room);
		return "Room.jsp";
	}
}
