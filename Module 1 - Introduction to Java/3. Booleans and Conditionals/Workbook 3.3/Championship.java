public class Championship {
    public static void main(String[] args) {

        int gryffindor = 400;    //gryffindor points
        int ravenclaw = 495;    //ravenclaw points

        // int margin = amount of points by which gryffindor scored over ravenclaw;
        int margin = gryffindor - ravenclaw;

        //if gryffindor wins by a margin of 300 points:
             //print: Gryffindor takes the house cup!
        if (margin >= 300) {
            System.out.println("Gryffindor takes the house cup!");
        } else if (margin >= 0) {
            System.out.println("In second place, Gryffindor!");
        } else if (margin > -100) {
            System.out.println("In third place, Gryffindor!");
        } else {
            System.out.println("In fourth place, Gryffindor!");
        }
        //if gryffindor wins by a margin of any points: 
            //print: In second place, Gryffindor!

        //if gryffindor loses by a margin of 100 points, they are third:
            //print: In third place, Gryffindor!

        //else:
           //print: In fourth place, Gryffindor! 
        
    }
}