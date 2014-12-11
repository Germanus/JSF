var i = 100;
var time = 0;
var intervalId;

function start(time2) {
    if(intervalId == null){
	time = parseInt(time2);
	intervalId = setInterval(run, 1000);
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

function stop(){
    clearInterval(intervalId);
    intervalId = null;
    var elem = document.getElementById("form:submitting");
    var elem2 = document.getElementById("form:input_test");
    elem2.value = time;   
    //elem.click();    
}


