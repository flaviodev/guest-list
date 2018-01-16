package br.com.flaviodev.guestlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.flaviodev.guestlist.model.Guest;
import br.com.flaviodev.guestlist.repository.GuestRepository;

@Controller
public class GuestController {

	@Autowired
	private GuestRepository repository;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/guestList")
	public String guestList(Model model){

	    Iterable<Guest> guests = repository.findAll();
	    model.addAttribute("guests", guests);

		return "guestList";
	}
}
