import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;

class SolutionOOP {

    private static class Inputs {
        private String name;
        private String signal;

        private Inputs(String n, String s) {
            this.name = n;
            this.signal = s;
        }
    }

    private static class Outputs {
        private String name;
        private String type; // Operation type - AND OR XOR NAND NOR NXOR
        private String input1;
        private String input2;
        private String signalOutput = "";

        private Outputs(String n, String t, String i1, String i2) {
            this.name = n;
            this.type = t;
            this.input1 = i1;
            this.input2 = i2;
        }

        public void apply(String s1, String s2){
            if(type.equals("AND")){
                for(int i = 0; i < s1.length(); i++){
                    if(s1.charAt(i) == s2.charAt(i)){
                        if(s1.charAt(i) == '-'){
                            this.signalOutput += "-";
                        } else {
                            this.signalOutput += "_";
                        }
                    } else {
                        this.signalOutput += "_";
                    }
                }
            }

            if(type.equals("OR")){
                for(int i = 0; i < s1.length(); i++){
                    if(s1.charAt(i) == s2.charAt(i)){
                        if(s1.charAt(i) == '-'){
                            this.signalOutput += "-";
                        } else {
                            this.signalOutput += "_";
                        }
                    } else {
                        this.signalOutput += "-";
                    }
                }
            }

            if(type.equals("XOR")){
                for(int i = 0; i < s1.length(); i++){
                    if(s1.charAt(i) == s2.charAt(i)){
                        this.signalOutput += "_"; 
                    } else {
                        this.signalOutput += "-";
                    }
                }
            }

            if(type.equals("NAND")){
                for(int i = 0; i < s1.length(); i++){
                    if(s1.charAt(i) == s2.charAt(i)){
                        if(s1.charAt(i) == '-'){
                            this.signalOutput += "_";
                        } else {
                            this.signalOutput += "-";
                        }
                    } else {
                        this.signalOutput += "-";
                    }
                }
            }

            if(type.equals("NOR")){
                for(int i = 0; i < s1.length(); i++){
                    if(s1.charAt(i) == s2.charAt(i)){
                        if(s1.charAt(i) == '-'){
                            this.signalOutput += "_";
                        } else {
                            this.signalOutput += "-";
                        }
                    } else {
                        this.signalOutput += "_";
                    }
                }
            }

            if(type.equals("NXOR")){
                for(int i = 0; i < s1.length(); i++){
                    if(s1.charAt(i) == s2.charAt(i)){
                        this.signalOutput += "-";
                    } else {
                        this.signalOutput += "_";
                    }
                }
            }
        }

        public String printOutput() {
            return name + " " + signalOutput;
        }
    }

    public static void main(String args[]) throws
FileNotFoundException {

        File input = new File("Test Sets/test10.txt");
        Scanner s = new Scanner(input);

        System.out.println();
        System.out.println("The requested outputs are: ");

        int n = s.nextInt();
        int m = s.nextInt();
        Queue <Inputs> inputs = new LinkedList <> ();
        Queue <Outputs> outputs = new LinkedList <> ();

        for (int i = 0; i < n; i++) {
            String in = s.next();
            String is = s.next();
            inputs.add(new Inputs(in, is));
        }

        for (int i = 0; i < m; i++) {
            String on = s.next();
            String t = s.next();
            String in1 = s.next();
            String in2 = s.next();
            outputs.add(new Outputs(on, t, in1, in2));
        }
        s.close();

        for(Outputs o: outputs) {
            String signal1 = "";
            String signal2 = "";
            for(Inputs i: inputs) {
                if(i.name.equals(o.input1)){
                    signal1 = i.signal;
                } if(i.name.equals(o.input2)){
                    signal2 = i.signal;
                }
            }
            o.apply(signal1, signal2);

            System.out.println(o.printOutput());
        }

        System.out.println();
    }
}