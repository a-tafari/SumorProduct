package SumorProduct;

import java.util.Scanner;

/**
 * Created by abijah on 9/18/16.
 */
public class SumorProduct {
    int number;
    String choice;

    public SumorProduct(){

    }

    public void getInput(){
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();


        System.out.println("Would you like to calculate the sum or product?");
        Scanner operator = new Scanner(System.in);
        choice = operator.next();

    }
    public String getAnswer () {

        if (choice.equalsIgnoreCase("Sum")) {

            return "the sum of your number is: " + sum(number);
        }
        else if( choice.equalsIgnoreCase("Product")){
            return"The product is :" + product(number);
        }
        else{
            return "please try again...";
        }
    }
    public int product(int number){
        int answer=1;
        for (int i=1 ; i <= number; i++){
            answer *= i;
        }
        return answer;
    }
    public int sum(int number){
        int answer=0;
        for (int i= 0; i <= number; i++){
            answer += i;
        }
        return answer;
    }

}