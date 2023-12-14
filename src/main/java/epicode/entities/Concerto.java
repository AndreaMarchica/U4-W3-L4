package epicode.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("Concerto")
public class Concerto extends Event{
   /* ATTRIBUTI*/
   @Enumerated(EnumType.STRING)
   private TipoEvento tipoEvento;
   private boolean inStreaming;
   /*COSTRUTTORI*/
    /*METODI*/
}
