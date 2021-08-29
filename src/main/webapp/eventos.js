var scc = document.getElementsByClassName('scc');

function validar(){
	var x = document.getElementById("sec-menu");
	var x2 = document.getElementById("contenido");
	if (x.style.display === "block" && x2.style.display === "block") {
		console.log("deshabilitar");
	} else {

		console.log("este es");
		x.style.display = "block";
		x2.style.display = "block";
		seccion(0);
	}
  /*  var jh=document.getElementById("url").value;
    console.log(jh);
    var jh2=document.getElementById("analizar").value;
    console.log(jh2);*/

}

function seccion(num)
{
	if(num==0){
		console.log("definido");
		for(i = 0; i < scc.length; i++)
		{
			scc[i].classList.add("close");

		}
	}else{


		for(i = 0; i < scc.length; i++)
		{
			scc[i].classList.remove("sky");
			if (num == 1) {
				scc[i].classList.add("close");
				scc[0].classList.remove("close");
				scc[0].classList.add("sky");
			}
			if (num == 2) {
				scc[i].classList.add("close");
				scc[1].classList.remove("close");
				scc[1].classList.add("sky");
			}
			if (num == 3) {
				scc[i].classList.add("close");
				scc[2].classList.remove("close");
				scc[2].classList.add("sky");
			}
			if (num == 4) {
				scc[i].classList.add("close");
				scc[3].classList.remove("close");
				scc[3].classList.add("sky");
			}
			if (num == 5) {
				scc[i].classList.add("close");
				scc[4].classList.remove("close");
				scc[4].classList.add("sky");
			}
			if (num == 6) {
				scc[i].classList.add("close");
				scc[5].classList.remove("close");
				scc[5].classList.add("sky");
			}
			if (num == 7) {
				scc[i].classList.add("close");
				scc[6].classList.remove("close");
				scc[6].classList.add("sky");
			}
		}
	}
}

