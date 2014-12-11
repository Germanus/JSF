var i = 100;
var time = 100;

function start(e) {
    if (e.status == 'success') {
	setInterval(alert('ff'), 1000);
    }
}

function run() {
    var elem = document.getElementById("inner");
    elem.style.width = i + '%';
    i--;
    time--;
    if (i < 95) {
	elem.style.background = 'yellow';
    }
    elem.innerHTML = (Math.floor(time / 60)) + 'm : ' + (time % 60) + 's';
} 