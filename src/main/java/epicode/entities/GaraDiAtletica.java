package epicode.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Set;

@Entity
@DiscriminatorValue("Gara di Atletica")
public class GaraDiAtletica extends Event{

    /* ATTRIBUTI*/
    private Set<Person> listaAtleti;
    private Person vincitore;

    /*COSTRUTTORI*/

    public GaraDiAtletica() {
    }

    public GaraDiAtletica(Set<Person> listaAtleti, Person vincitore) {
        this.listaAtleti = listaAtleti;
        this.vincitore = vincitore;
    }
    /*METODI*/

    public Set<Person> getListaAtleti() {
        return listaAtleti;
    }

    public void setListaAtleti(Set<Person> listaAtleti) {
        this.listaAtleti = listaAtleti;
    }

    public Person getVincitore() {
        return vincitore;
    }

    public void setVincitore(Person vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "listaAtleti=" + listaAtleti +
                ", vincitore=" + vincitore +
                '}';
    }
}
