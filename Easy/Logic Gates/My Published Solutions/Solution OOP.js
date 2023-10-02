class Inputs {
    constructor(n, s) {
        this.name = n
        this.signal = s
    }
}

class Outputs {
    constructor(n, t, i1, i2) {
        this.name = n
        this.type = t
        this.input1 = i1
        this.input2 = i2
        this.signalOutput = ""
    }

    apply(s1, s2) {
        if (this.type == "AND") {
            for(let i = 0; i < s1.length; i++) {
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

        if (this.type == "OR") {
            for(let i = 0; i < s1.length; i++) {
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

        if (this.type == "XOR") {
            for(let i = 0; i < s1.length; i++) {
                if(s1.charAt(i) == s2.charAt(i)){
                    this.signalOutput += "_"; 
                } else {
                    this.signalOutput += "-";
                }
            }
        }

        if (this.type == "NAND") {
            for(let i = 0; i < s1.length; i++) {
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

        if (this.type == "NOR") {
            for(let i = 0; i < s1.length; i++) {
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

        if (this.type == "NXOR") {
            for(let i = 0; i < s1.length; i++) {
                if(s1.charAt(i) == s2.charAt(i)){
                    this.signalOutput += "-";
                } else {
                    this.signalOutput += "_";
                }
            }
        }
    }

    printOutput() {
        return this.name + " " + this.signalOutput
    }
}

const n = parseInt(readline());
const m = parseInt(readline());
var inputs = []
var outputs = []

for (let i = 0; i < n; i++) {
    var inp = readline().split(' ');
    const in_names = inp[0];
    const in_signals = inp[1];
    inputs.push(new Inputs(in_names, in_signals))
}

for (let i = 0; i < m; i++) {
    var out = readline().split(' ');
    const out_names = out[0];
    const t = out[1];
    const in1 = out[2];
    const in2 = out[3];
    outputs.push(new Outputs(out_names, t, in1, in2))
}

for(let i = 0; i < outputs.length; i++) {
    var signal1 = ""
    var signal2 = ""
    for(let j = 0; j < inputs.length; j++) {
        if(inputs[j].name == outputs[i].input1) {
            signal1 = inputs[j].signal
        } if(inputs[j].name == outputs[i].input2){
            signal2 = inputs[j].signal
        }
    }

    outputs[i].apply(signal1, signal2)

    console.log(outputs[i].printOutput())
}
