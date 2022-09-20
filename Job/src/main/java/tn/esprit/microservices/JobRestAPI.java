package tn.esprit.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/api/jobs")
public class JobRestAPI {

	private String chaine ="hi there" ;
	@Autowired
	private JobService jobService;
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(chaine);
		return chaine;
	}

	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Job> updateCandidat(@PathVariable(value = "id")int id,
													@RequestBody Boolean etat)
	 {
		return new ResponseEntity<>(jobService.updateJob(id,etat), HttpStatus.OK);
	 }
	
}
