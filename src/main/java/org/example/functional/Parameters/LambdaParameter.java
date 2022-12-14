package org.example.functional.Parameters;

import lombok.NonNull;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaParameter {
    public static void main(String[] args){
        List<String> status = Arrays.asList("Close", "Open", "Stop");
        String result = status
                .stream()
                .map((@NonNull var x) -> ("Market status: ".concat(x)))
                .collect(Collectors.joining("\n"));
        System.out.println(result);
    }
}
