package br.com.flaviodev.guestlist.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.flaviodev.guestlist.model.Guest;
import br.com.flaviodev.guestlist.repository.GuestRepository;

@Service
public class GuestService {

	@Autowired
	private GuestRepository repository;

	public Iterable<Guest> getAll() {
		Iterable<Guest> convidados = repository.findAll();
		return convidados;
	}

	public void save(Guest guest) {
		repository.save(guest);
	}
}