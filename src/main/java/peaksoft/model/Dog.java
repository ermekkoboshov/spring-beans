package peaksoft.model;

import org.springframework.stereotype.Component;
import peaksoft.model.Animal;
@Component

public class Dog extends Animal {

    @Override
    public String toString (){
        return "im a Dog";
    }

}
