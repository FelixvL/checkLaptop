package nl.ycolfield.voordoen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nl.ycolfield.voordoen.model.Tafel;

@Service
@Transactional
public class TafelService {
	@Autowired
	TafelRepository tafelRepository;

	public void getTafel() {
		System.out.println("In Service");
		Tafel t = new Tafel();
		t.aantalPersonen = 5;
		t.setTafelnummer("A23");
		tafelRepository.save(t);
	}
	
}
