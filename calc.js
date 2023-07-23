// DOM Manipulation
let newdiv = document.createElement('button')
newdiv.className = "item";
newdiv.setAttribute('value','%');
newdiv.append("%");

let main = document.querySelector('.grid-main');
let btn1 = document.querySelector('.btn1');
main.insertBefore(newdiv,btn1);
newdiv.style.color = "rgba(239, 234, 243, 0.943)";
newdiv.style.textShadow = "0.3rem 0.1rem 0.5rem";
newdiv.style.fontSize = "1.5rem";

let newbtn = document.createElement('button')
newbtn.className = "item";
newbtn.setAttribute('value','=');
newbtn.append("=");

let m = document.querySelector('.grid-main');
let bres = document.querySelector('.btnres');
m.insertBefore(newbtn,bres);
newbtn.style.gridColumnStart = "1";
newbtn.style.gridColumnEnd = "4";
newbtn.style.color = "rgba(239, 234, 243, 0.943)";
newbtn.style.textShadow = "0.3rem 0.1rem 0.5rem";
newbtn.style.fontSize = "2rem";

// Functionality for Calculator
const dis = document.querySelector('.dis');
const ar = document.querySelectorAll('.item');

let st = "",st2 = '';
let op='',n1 = 0,n2 = 0,opdis = '';
for(let i = 0;i<ar.length;i++){
    ar[i].addEventListener("click",(e) =>{
        if(e.target.value==='+' || e.target.value==='-'
            || e.target.value==='*' || e.target.value==='/' || e.target.value==='%'){
                opdis = e.target.value;
                st2 = st + opdis;
                dis.innerHTML = st2;
            }
            else if(e.target.textContent === 'C')
            {
                st = 0;
                dis.innerHTML = st;
                st = "";
            }
            else if(!(e.target.value ==='+' || e.target.value ==='-'
            || e.target.value==='*' || e.target.value==='/' || e.target.value==='%' 
            || e.target.textContent === '=')){
                st += e.target.textContent;
                let st3 = '';
                st3 = st + st2.slice(st2.length-1 ,st2.length);
                dis.innerHTML = st3;
            }
            else if(st.length > 0){
            let str1 = st;
            for(let i=0;i<str1.length;i++){
                if(str1.charAt(i) === '+' || str1.charAt(i) === '-'
                || str1.charAt(i) === '*' || str1.charAt(i) === '/'
                || str1.charAt(i) === '%'){
                    op = str1.charAt(i);
                    n1 = parseInt(str1.slice(0,i));
                    n2 = (Number)(str1.slice(i+1,str1.length));
                }
            }}
            if(e.target.textContent === '='){
                console.log(op);
                switch (op) {
                    case '+':
                        dis.innerHTML = n1 + n2;
                        break;
                    case '-':
                        dis.innerHTML = n1 - n2;
                        break;
                    case '*':
                        dis.innerHTML = n1 * n2;
                        break;
                    case '/':
                        dis.innerHTML = n1 / n2;
                        break;
                    case '%':
                        dis.innerHTML = n1 % n2;
                        break;
                    default:
                        dis.innerHTML = 0;
                        break;
                }
            }
        });
}