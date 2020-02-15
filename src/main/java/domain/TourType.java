package domain;

import javax.persistence.*;

@Entity
@Table(name = "tipo_passeio")
public class TourType implements BaseEntity {

    @Id
    @GeneratedValue(generator = "tipo_passeio_seq", strategy = GenerationType.AUTO)
    @Column(name = "id_tipo_passeio")
    private Long id;

    @Column(name = "nome_passeio")
    private String name;

    @Column(name = "descricao_passeio")
    private String description;

    public TourType() {}

    public TourType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public TourType(Long id, String name, String description) {
        this(name, description);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "TourType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
