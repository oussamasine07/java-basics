import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("hey there, what is your name? ");
//        String name = scanner.nextLine();
//        System.out.println("how old are you? ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("what is your favorate food?");
//        String food = scanner.nextLine();


//        System.out.println("hey there your name is "+ name);
//        System.out.println("you are " + age);
//        System.out.println("and you like "+food);
//        int num1 = 4;
//        int num2 = 3;
//        double result = (double) num1 / num2; // casting in order to devide 2 ints you need to use (datatype) this is incapsulation
//        System.out.println(result);

//        String[][] cars = new String[2][3];
//        cars[0][0] = "mercides";
//        cars[0][1] = "camaro";
//        cars[0][2] = "bently";
//        cars[1][0] = "renault";
//        cars[1][1] = "r4";
//        cars[1][2] = "clio";


        //System.out.println(cars[0][2]);

        String words = "bghina nbadlo had ljoumla";

        //boolean result = words.equals("oussama");
        //boolean result = words.equalsIgnoreCase("oussama");
        //int result = words.length();
        //String result = words.toUpperCase();
        //String result = words.toLowerCase();
        //int result = words.indexOf("a");
        //char result = words.charAt(4);
//        String result = words.replace("b", "kh");
//        String result2 = result.replace("j", "kh");
//        System.out.println(result2);

//        ArrayList<String> studends = new ArrayList<String>();
//        studends.add("oussama");
//        studends.add("yassin");
//        studends.add("youssef");
//        studends.remove(1);
//        studends.add("smail");
//        System.out.println(studends.get(2));

//        ArrayList<ArrayList<String>> groceryList = new ArrayList();
//        ArrayList<String> backeryList = new ArrayList();
//        backeryList.add("k3ak3");
//        backeryList.add("khbiz");
//        backeryList.add("9richlat");
//
//        ArrayList<String> vigitablsList = new ArrayList();
//        vigitablsList.add("khizo");
//        vigitablsList.add("lgar3a");
//        vigitablsList.add("btata");
//
//        ArrayList<String> fruitsList = new ArrayList();
//        fruitsList.add("lbanan");
//        fruitsList.add("dala7");
//        fruitsList.add("batikh");
//
//        groceryList.add(backeryList);
//        groceryList.add(vigitablsList);
//        groceryList.add(fruitsList);
//
//        System.out.println(groceryList);

        // String[] animals = {"dog", "rate", "cat"};
//        ArrayList<String> animals = new ArrayList<>();
//        animals.add("dog");
//        animals.add("rat");
//        animals.add("cat");
//        // for each loop
//        for (String animal : animals) {
//            System.out.println(animal);
//        }



    }


    // factorial functionality
    static int factorial ( int n ) {
        int result = n;
        for ( int i = n - 1 ; i > 0; i--) {
            result = result* i;
        }
        return result;
    }


}