const n = parseInt(readline());
const m = parseInt(readline());
var inputs = new Map()

for (let i = 0; i < n; i++) {
    var inp = readline().split(' ');
    const in_name = inp[0];
    const in_signal = inp[1];
    inputs.set(in_name, in_signal)
}

for (let i = 0; i < m; i++) {
    var out = readline().split(' ');
    const out_name = out[0];
    const type = out[1];
    const in_name1 = out[2];
    const in_name2 = out[3];
    var out_signal = "";

    if(type == "AND"){
        for(let j = 0; j < inputs.get(in_name1).length; j++) {
            if(inputs.get(in_name1).charAt(j) == inputs.get(in_name2).charAt(j)){
                if(inputs.get(in_name1).charAt(j) == '-') {
                    out_signal += '-';
                } else {
                    out_signal += '_';
                }
            } else {
                out_signal += '_';
            }
        }
    }

    if(type == "OR"){
        for(let j = 0; j < inputs.get(in_name1).length; j++) {
            if(inputs.get(in_name1).charAt(j) == inputs.get(in_name2).charAt(j)){
                if(inputs.get(in_name1).charAt(j) == '-') {
                    out_signal += '-';
                } else {
                    out_signal += '_';
                }
            } else {
                out_signal += '-';
            }
        }
    }

    if(type == "XOR"){
        for(let j = 0; j < inputs.get(in_name1).length; j++) {
            if(inputs.get(in_name1).charAt(j) == inputs.get(in_name2).charAt(j)){
                out_signal += '_'
            } else {
                out_signal += '-';
            }
        }
    }

    if(type == "NAND"){
        for(let j = 0; j < inputs.get(in_name1).length; j++) {
            if(inputs.get(in_name1).charAt(j) == inputs.get(in_name2).charAt(j)){
                if(inputs.get(in_name1).charAt(j) == '-') {
                    out_signal += '_';
                } else {
                    out_signal += '-';
                }
            } else {
                out_signal += '-';
            }
        }
    }

    if(type == "NOR"){
        for(let j = 0; j < inputs.get(in_name1).length; j++) {
            if(inputs.get(in_name1).charAt(j) == inputs.get(in_name2).charAt(j)){
                if(inputs.get(in_name1).charAt(j) == '-') {
                    out_signal += '_';
                } else {
                    out_signal += '-';
                }
            } else {
                out_signal += '_';
            }
        }
    }

    if(type == "NXOR"){
        for(let j = 0; j < inputs.get(in_name1).length; j++) {
            if(inputs.get(in_name1).charAt(j) == inputs.get(in_name2).charAt(j)){
                out_signal += '-';
            } else {
                out_signal += '_';
            }
        }
    }

    console.log(out_name + " " + out_signal);
}
