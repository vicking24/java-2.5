import java.util.Scanner;

class D6 {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int r=0; //numbers
        int tot=0; //total
        int d=0; // #of dies
        int side=6; // #of sides
        boolean again=true;
        String yn;

        while (again){

            System.out.println ("How many D6's? ");
            d= sc.nextInt();

            System.out.println ("How many sides are the dies?");
            side=sc.nextInt();

            System.out.println ("You got: ");

            for (int i=0; i<d; i++){
                r=rollDie (side);
                System.out.print (r + " ");
                tot= tot+r;

            }
            System.out.println("");
            System.out.println ("Total: "+tot);
            System.out.println("");
            System.out.print("Again? (yes or no) ");
            yn= sc.next();
            System.out.println ("");

            if (yn.equals ("yes")) {
                again=true;
                tot=0;
            } else {
                again=false;
                System.out.println ("Bye!");
            }

        }
    }

    public static int rollDie (int s) {
        return (int)(Math.random()*s+1);

    
    }
}