package kodlamaio.hrms.api.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.OccupationService;
import kodlamaio.hrms.entities.concretes.Occupations;
import java.util.List;

@RestController
@RequestMapping("/api/occupations")
public class OccupationsController {
	
	private OccupationService occupationService;
	
	@Autowired
	public OccupationsController(OccupationService occupationService) {
		super();
		this.occupationService = occupationService;
	}

	@GetMapping("/getall")
	public List<Occupations> getAll(){
		return this.occupationService.getAll();		
	}
}
