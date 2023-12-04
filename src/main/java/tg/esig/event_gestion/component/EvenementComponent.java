package tg.esig.event_gestion.component;

import org.springframework.stereotype.Component;
import tg.esig.event_gestion.dao.EvenementRepository;
import tg.esig.event_gestion.model.Evenement;

import java.util.List;

@Component
public class EvenementComponent {

    private EvenementRepository evenementRepository;


    public EvenementComponent(EvenementRepository evenementRepository) {
        this.evenementRepository = evenementRepository;
    }

    public List<Evenement> afficheEvent(){
        List<Evenement> evenements = evenementRepository.findAll();
        return evenements;
    }

    public Evenement ajoutEvenement(Evenement evenement){
        Evenement evenementSave = evenementRepository.save(evenement);
        return evenementSave;
    }
}
