package org.example.functional.Syntax;

@FunctionalInterface
interface NoParameters {
    void print();
}

@FunctionalInterface
interface OneParameter {
    void print(String s);
}

@FunctionalInterface
interface MultipleParameters {
    void print(String one, String two);
}
public class ImplementSyntax {
    public static void main(String[] args){
        NoParameters noParameters = () -> System.out.println("No Parameters");
        OneParameter oneParameter = (String s) -> System.out.printf("One Parameter: %s\n", s);
        MultipleParameters multipleParameters = (String one, String two) -> System.out.printf("Multiple Parameters: %s, %s\n", one, two);
        noParameters.print();
        oneParameter.print("One");
        multipleParameters.print("One", "Two");
    }
}
