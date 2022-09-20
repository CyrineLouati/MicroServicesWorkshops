package tn.esprit.microservices.tn.esprit.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidatService {
	
	@Autowired
	private CandidatRepository repocandid;
	
	public Candidat addCandidat(Candidat candidat) {
		return repocandid.save(candidat);
	}
	
	public Candidat updateCandidat (int id,Candidat newCandidat) {
		if (repocandid.findById(id).isPresent()) {
			Candidat existingCandidat = repocandid.findById(id).get();
			existingCandidat.setNom(newCandidat.getNom());
			existingCandidat.setPrenom(newCandidat.getPrenom());
			existingCandidat.setEmail(newCandidat.getEmail());
			
			return repocandid.save(existingCandidat);
		}
		
		else return null;
	}
	
	public String deleteCandidat (int id) {
		if (repocandid.findById(id).isPresent()) {
			repocandid.deleteById(id);
			return "Candidat supprime";
		}
		
		else return "Candidat non supprime";
	}

}
