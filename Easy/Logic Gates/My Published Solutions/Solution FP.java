import java.util.*;

class Solution {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Number of inputs
        int m = in.nextInt(); // Number of outputs
        Map <String, String> inputs = new HashMap<String, String>(); // Hashmap for the input (name, signal)

        for (int i = 0; i < n; i++) { // Put the values of the input in the Hashmap
            String inName = in.next();
            String inSignal = in.next();
            inputs.put(inName, inSignal);
        }

        for (int i = 0; i < m; i++) { // Create a different output per loop iteration
            String outName = in.next();
            String type = in.next();
            String inName1 = in.next();
            String inName2 = in.next();
            String outSignal = "";

            if (type.equals("AND")) {
                for (int j = 0; j < inputs.get(inName1).length(); j++) {
                    if (inputs.get(inName1).charAt(j) == inputs.get(inName2).charAt(j)) {
                        if (inputs.get(inName1).charAt(j) == '-') {
                            outSignal += "-";
                        } else {
                            outSignal += "_";
                        }
                    } else {
                        outSignal += "_";
                    }
                }
            }

            if (type.equals("OR")) {
                for (int j = 0; j < inputs.get(inName1).length(); j++) {
                    if (inputs.get(inName1).charAt(j) == inputs.get(inName2).charAt(j)) {
                        if (inputs.get(inName1).charAt(j) == '-') {
                            outSignal += "-";
                        } else {
                            outSignal += "_";
                        }
                    } else {
                        outSignal += "-";
                    }
                }
            }

            if (type.equals("XOR")) {
                for (int j = 0; j < inputs.get(inName1).length(); j++) {
                    if (inputs.get(inName1).charAt(j) == inputs.get(inName2).charAt(j)) {
                        outSignal += "_";
                    } else {
                        outSignal += "-";
                    }
                }
            }

            if (type.equals("NAND")) {
                for (int j = 0; j < inputs.get(inName1).length(); j++) {
                    if (inputs.get(inName1).charAt(j) == inputs.get(inName2).charAt(j)) {
                        if (inputs.get(inName1).charAt(j) == '-') {
                            outSignal += "_";
                        } else {
                            outSignal += "-";
                        }
                    } else {
                        outSignal += "-";
                    }
                }
            }

            if (type.equals("NOR")) {
                for (int j = 0; j < inputs.get(inName1).length(); j++) {
                    if (inputs.get(inName1).charAt(j) == inputs.get(inName2).charAt(j)) {
                        if (inputs.get(inName1).charAt(j) == '-') {
                            outSignal += "_";
                        } else {
                            outSignal += "-";
                        }
                    } else {
                        outSignal += "_";
                    }
                }
            }

            if (type.equals("NXOR")) {
                for (int j = 0; j < inputs.get(inName1).length(); j++) {
                    if (inputs.get(inName1).charAt(j) == inputs.get(inName2).charAt(j)) {
                        outSignal += "-";
                    } else {
                        outSignal += "_";
                    }
                }
            }

            System.out.println(outName + " " + outSignal);
        }
    }
}