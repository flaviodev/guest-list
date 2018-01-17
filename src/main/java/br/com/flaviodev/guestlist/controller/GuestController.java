package br.com.flaviodev.guestlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

		model.addAttribute("guests", repository.findAll());

		return "guestList";
	}
	
	@RequestMapping(value = "/saveGuest", method = RequestMethod.POST)
	public String saveGuest(@RequestParam String name,
			@RequestParam String email,
			@RequestParam String phone,
			Model model){

		Guest guest = new Guest(name, email, phone);
		repository.save(guest);
		
	    model.addAttribute("guests", repository.findAll());
		
		return "guestList";
	}
	
}
