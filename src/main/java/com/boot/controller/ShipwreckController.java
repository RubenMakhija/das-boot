package com.boot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Shipwreck;

@RestController
@RequestMapping("api/v1/shipwrecks")
public class ShipwreckController {
	
	@GetMapping
	public List<Shipwreck> listShipwrecks() {
		return ShipwreckStub.list();
	}
	
	@GetMapping("/{id}")
	public Shipwreck getShipwreck(@PathVariable("id") Long id){
		return ShipwreckStub.get(id);
	}

	@PostMapping
	public Shipwreck crateShipwreck(@RequestBody @Valid Shipwreck wreck) {
		return ShipwreckStub.create(wreck);
	}
	
	@PutMapping("/{id}")
	public Shipwreck updateShipwreck(@PathVariable("id") Long id, @RequestBody Shipwreck wreck) {
		return ShipwreckStub.update(id, wreck);
	}
	
	@DeleteMapping("/{id}")
	public Shipwreck deleteShipwreck(@PathVariable Long id) {
		return ShipwreckStub.delete(id);
	}
}
