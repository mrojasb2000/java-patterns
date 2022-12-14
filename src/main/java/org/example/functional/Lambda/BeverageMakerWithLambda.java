package org.example.functional.Lambda;

public class BeverageMakerWithLambda {

    public void makeBeverage(MakeBeverage makeBeverage){
        makeBeverage.make();
    }
    public static void main(String[] args) {
        BeverageMakerWithLambda beverageMakerWithLambda = new BeverageMakerWithLambda();
        MakeBeverage action = () -> System.out.println("Make whatever beverage you want!");
        beverageMakerWithLambda.makeBeverage(action);
        MakeBeverage makeCoffee = () -> System.out.println("Make coffee!");
        beverageMakerWithLambda.makeBeverage(makeCoffee);
        MakeBeverage makeTea = () -> System.out.println("Make Tea!");
        beverageMakerWithLambda.makeBeverage(makeTea);
    }
}
