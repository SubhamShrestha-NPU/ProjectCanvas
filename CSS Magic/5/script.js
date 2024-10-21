const Ellipse1 = document.getElementById('Ellipse1');
const preLoad = document.getElementById('preLoad');
const postLoad = document.getElementById('postLoad');
function ctrlBtn() {
    Ellipse1.style.animation = 'toggle 1s linear forwards';
    Ellipse1.style.transition = 'all 1s';
    preLoad.style.animation = 'slideU 2s linear forwards';
    postLoad.style.animation = 'appear 1s linear forwards';
    preLoad.style.transition = 'all 1s'
}

/* const ch1_1opacity = document.getComputedStyle(ch1_1_H).style.opacity;
const ch1_1visiblity = document.getComputedStyle(ch1_1_H).style.visiblit;
if ((ch1_1opacity== 0)||(ch1_1visiblity== 'hidden')) {
    ch1_1.style.opacity = 1;
} */