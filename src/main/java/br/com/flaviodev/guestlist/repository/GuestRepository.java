package br.com.flaviodev.guestlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.flaviodev.guestlist.model.Guest;

public interface GuestRepository extends JpaRepository<Guest, Long> {

}
