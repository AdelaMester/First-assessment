import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;


public class DogGenetics {
    public static void main(String[] args){

        //create an ArrayList object
        ArrayList<String> breeds = new ArrayList<String>();
        breeds.add("Akita");
        breeds.add("American Cocker Spaniel");
        breeds.add("American Buldog");
        breeds.add("Ariege Pointer");
        breeds.add("Barbet");
        breeds.add("Basenji");
        breeds.add("Beagle");
        breeds.add("Basset Hound");
        breeds.add("Beagle-Harrier");
        breeds.add("Beauceron");
        breeds.add("Broholmer");
        breeds.add("Bull and Terrier");
        breeds.add("Bully Kuta");
        breeds.add("Carolina Dog");
        breeds.add("Catalan Sheepdog");
        breeds.add("Cesky Terrier");
        breeds.add("Chow Chow");
        breeds.add("Combai");
        breeds.add("German Shepherd");
        breeds.add("French Bulldog");
        breeds.add("Finnish Hound");
        breeds.add("Gordon Setter");

        Scanner dogName = new Scanner(System.in);

        System.out.println("What is your dog's name?");
        String name= dogName.next();

        System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.");

        int totalPercentage = 100;
        Collections.shuffle(breeds);
        for(int i = 0 ; i < 5; i++){
            int randomNum = (int)(Math.floor(Math.random() * totalPercentage) + 1);
            if(i == 4){
                randomNum = totalPercentage;
            }
            totalPercentage = totalPercentage - randomNum;

            System.out.println(randomNum + " % " +  breeds.get(i));

        }
    }

}
