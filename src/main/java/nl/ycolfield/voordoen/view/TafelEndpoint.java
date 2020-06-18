package nl.ycolfield.voordoen.view;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nl.ycolfield.voordoen.controller.TafelService;
import nl.ycolfield.voordoen.model.Tafel;

@RestController
public class TafelEndpoint {
	
	@Autowired
	TafelService tafelService;
		
	@GetMapping("/tafel")
	public Tafel testFunctie() {
		System.out.println("hij doet");
		//tafelService.getTafel();
		return new Tafel();
		
	}
	
	@PostMapping("/nwtafel")
	public String test(@RequestBody Tafel tafel){
		System.out.println("ff post checken");
		System.out.println(">>"+ tafel.getAantalPersonen());
		System.out.println(">>>>"+ tafel.getTafelnummer());
		return "return van Post";
	}
}










// Can interesse vraag zij vraag
// meer waarom heb je Repo ? DesignPattern Wat doet iedere laag
// Termen beter afhameren naar de Termen - Soms afgeleid
// Stappenplan Net te Groot
// Metafoor