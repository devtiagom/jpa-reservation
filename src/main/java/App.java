import dao.ModalityDAO;
import dao.TourGuideDAO;
import dao.TourTypeDAO;
import domain.Modality;
import domain.TourGuide;
import domain.TourType;

import java.util.List;

public class App {

    public static void main(String[] args) {
        ModalityDAO modalityDAO = new ModalityDAO();
        Modality modality = new Modality("Escalada");
        modalityDAO.save(modality);
        System.out.println(modalityDAO.findById(modality));

        TourTypeDAO tourTypeDAO = new TourTypeDAO();
        TourType tourType = new TourType("Em grupo", "Passeio em grupo");
        tourTypeDAO.save(tourType);
        System.out.println(tourTypeDAO.findById(tourType));

        TourGuideDAO tourGuideDAO = new TourGuideDAO();
        TourGuide tourGuide = new TourGuide("Fulano de Tal");
        tourGuideDAO.save(tourGuide);
        System.out.println(tourGuideDAO.findById(tourGuide));

//        List<Modality> modalities = modalityDAO.listarTodos();
//        for (Modality domain : modalities) {
//            System.out.println(domain.getId() + " / " + domain.getNome());
//        }

    }

}
