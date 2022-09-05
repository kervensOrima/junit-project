import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RArray {

    private final List<Object> elements ;

    // Initialiser la capacité d'un RArray
    public RArray(int capacity) throws RArrayError {
        if ( capacity <= 0 ){
            //System.err.println("Negative capacity error!");
            throw new RArrayError("<< La taille du tableau doit être strictement positive! >>") ;
        }
        this.elements = new ArrayList<>( capacity ) ;
        //System.out.println("RArray capacity initialized!");
    }

    // Ajouter un objet a un RArray
    public void add(Object element) {
        if (element instanceof  String ) {
            if(element.toString().trim().equalsIgnoreCase("")) {
                throw new RArrayError("La valeur saisi doit être non nulle!") ;
            }
        }
        if ( Objects.isNull(element) ) {
            throw new RArrayError("La valeur saisi doit être non nulle!") ;
        }
        // add the element in the list
        this.elements.add(element) ;
    }


    // supprimer un object spécifique dans RArray
    public boolean remove(Object elementToRemove) {
        if (! this.elements.isEmpty() ) {
            for (Object o: this.elements ) {
                if( o.equals(elementToRemove) ) {
                    this.elements.remove(elementToRemove) ;
                    return true ;
                }
            }
        }
        return false ;
    }


    // Supprimer toutes les occurrences de l'élément passer en argument dans le RArray
    public boolean removeAll(Object elementToRemove) {
        List<Object> array = new ArrayList<>() ;
        if (! this.elements.isEmpty() ){
            for(Object o: this.elements) {
                if( o.equals(elementToRemove) ) {
                    array.add(o) ;
                }
            }
        }
        return this.elements.removeAll(array) ;
    }


    // Vider le RArray
    public void clear() {
        if( !this.elements.isEmpty() )
            this.elements.clear();
        else
            throw new RArrayError("Impossible de vider un tableau vide") ;
    }


    // verifier l'existence d'un element saisi dans le RArray
    public boolean contains(Object element) {
        return this.elements.contains(element);
    }


    // Verifier le nombre occurrence de l'élement passe en paramètre
    public int nbOcc(Object element) {
        int nombreObcc = 0;
        for(Object object: this.elements ){
            if( object.equals(element) ) {
                nombreObcc++;
            }
        }
        return nombreObcc;
    }

    // trouver le size de l'RArray
    public int size() {
        return this.elements.size();
    }


}
