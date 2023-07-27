public class Main {
    public static void main(String[] args) {


        for (int i = 1;i<= 12;i++){
            System.out.println("Table of "+i+":");
            for(int j = 1; j <=12; j++){
                System.out.printf(i + " * "+ j + " = "+ (i*j)+ "\t\t");
                if (j == 4 || j ==8 || j ==12){
                    System.out.println();
                }
            }
            System.out.println();
        }











    }









}