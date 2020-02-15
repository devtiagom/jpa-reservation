package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "modalidade")
public class Modality implements BaseEntity {

    @Id()
    @GeneratedValue(generator = "modalidade_seq", strategy = GenerationType.AUTO)
    @Column(name = "id_modalidade")
    private Long id;

    @Column(name = "nome")
    private String name;

    @OneToMany(mappedBy = "modality")
    private List<GuideModality> guideModalityList;

    public Modality() {}

    public Modality(String nome) {
        this.name = nome;
    }

    public Modality(Long id, String name) {
        this(name);
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GuideModality> getGuideModalityList() {
        return guideModalityList;
    }

    public void setGuideModalityList(List<GuideModality> guideModalityList) {
        this.guideModalityList = guideModalityList;
    }
}
