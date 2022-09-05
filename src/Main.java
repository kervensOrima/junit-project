

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Main {


//    @Test
//    public void test() {
//        Assert.assertEquals(10 , 10);
//    }


    public static void main(String[] args) {

        RArray array = new RArray(2) ;
        array.add("First element");
        array.add("First element");
        array.add("First element");
        array.add("Last element");
        array.add("Third element");
        String result = array.remove("First element") ? "Exist" : "Not exist" ;
        //System.out.println( result );

        String results = array.removeAll("First ") ? "Exist" : "Not exist" ;
        System.out.println( results );

        array.clear();

        array.add("Petrol");
        array.add("Petrol");
        array.add("Petrol");
        array.add("Petrol");
        array.add("Petrol");
        array.add("Riz");
        array.add("Mais");
        array.add("Patate");

        System.out.println(array.contains("Petrol") );

        System.out.println(array.nbOcc("Petrol") );



    }

}
