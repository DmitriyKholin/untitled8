public class Main {
    public static void main(String[] args) {

        // 1 задача


        System.out.println("1 задача");
//1

        int[] massiv123 = new int[]{1, 2, 3};
//2
        float[] massivDrobn = {1.57f, 7.654f, 9.986f};
//3
        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};

        // 2 задача

        System.out.println("2 задача");
        for (int i=0; i<massiv123.length; i++){
            System.out.print(massiv123[i]);
            if (i<massiv123.length-1) System.out.print(", ");
        }
        System.out.println("");
        for (int y=0; y<massivDrobn.length; y++){
            System.out.print(massivDrobn[y]);
            if (y<massivDrobn.length-1) System.out.print(", ");
        }
        System.out.println("");
        for (int t=0; t<seasons.length; t++){
            System.out.print(seasons[t]);
            if (t<seasons.length-1) System.out.print(", ");
        }
        System.out.println(" ");
        // 3 задача

        System.out.println("3 задача");
        for (int i=massiv123.length-1; i>=0; i--){
            System.out.print(massiv123[i]);
            if (i>0) System.out.print(", ");
        }
        System.out.println("");
        for (int y=massivDrobn.length-1; y>=0; y--){
            System.out.print(massivDrobn[y]);
            if (y>0) System.out.print(", ");
        }
        System.out.println("");
        for (int t=seasons.length-1; t>=0; t--){
            System.out.print(seasons[t]);
            if (t>0) System.out.print(", ");
        }
        System.out.println(" ");
        // 4 задача


        System.out.println("4 задача");
        for (int i=0; i<massiv123.length; i++){
            if (massiv123[i]%2!=0) {massiv123[i]=massiv123[i]+1;}

            System.out.print(massiv123[i]);
            if (i<massiv123.length-1) System.out.print(", ");
        }






    }
}