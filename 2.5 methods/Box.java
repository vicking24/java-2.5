import java.util.Scanner;

class Box {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        int w=0, h=0; 
        
        System.out.print ("The Width: ");
        w=sc.nextInt();
        System.out.println("");
        System.out.print ("The Height: ");
        h=sc.nextInt();
        System.out.println ("");
      
        displayBox (w, h);
        
        

        
    }
    public static void displayBox (int width, int height){
        
        for (int k=0; k<height; k++){
            for (int i=0; i<width; i++) {
             System.out.print ("6");
        
        }
        System.out.println ("");
        }
    }

    
}