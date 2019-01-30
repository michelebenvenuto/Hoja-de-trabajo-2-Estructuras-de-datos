import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        StackVector<Integer> stack = new StackVector<Integer>();
        ArrayList operation = new ArrayList();
        int operator = 0;
        int operand = 0;
        try {
            Stream<String> lines = Files.lines(
                    Paths.get("C:\\Users\\HP\\Desktop\\datos.txt"),
                    StandardCharsets.UTF_8
            );
            lines.forEach(s ->{
                    operation.add(s);
            });
        }catch (IOException exception){
            System.out.println("Error");
        }


        String operationToDo= (String) operation.get(0);
        for (int i =0; i<operationToDo.length();i++){
            String currentString=operationToDo.substring(i,i+1);

            try {
                int currentNumber = Integer.parseInt(currentString);
                stack.push(currentNumber);
            }catch(NumberFormatException nfe){
                if (!currentString.equals(" ")){
                    if (currentString.equals("+")){
                        operand=stack.pop();
                        operator= stack.pop();
                        stack.push(calculator.calculate(operand,operator,"+"));
                    }
                    else if (currentString.equals("*")){
                        operand=stack.pop();
                        operator=stack.pop();
                        stack.push(calculator.calculate(operand,operator,"*"));
                    }
                    else if (currentString.equals("-")){
                        operator=stack.pop();
                        operand= stack.pop();
                        stack.push(calculator.calculate(operand,operator,"-"));
                    }
                    else if (currentString.equals("/")){
                        operator=stack.pop();
                        operand= stack.pop();
                        stack.push(calculator.calculate(operand,operator,"/"));
                    }
                }
            }
        }
        System.out.println(stack.peek());
    }
}
