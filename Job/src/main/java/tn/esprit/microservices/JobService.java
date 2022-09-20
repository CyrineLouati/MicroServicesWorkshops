package tn.esprit.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JobService {
	@Autowired
	private JobRepository repoJob;
	
	public Job updateJob (int id,Boolean etat) {
		if (repoJob.findById(id).isPresent()) {
			Job existingJob = repoJob.findById(id).get();
			existingJob.setEtat(etat);
			if (etat)
				System.out.print("Job DISPONIBLE");
			else System.out.print("Job INDISPONIBLE");
			return repoJob.save(existingJob);
		}
		
		else return null;
	}
	
}
