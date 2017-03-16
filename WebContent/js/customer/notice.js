/**
 * 
 */

	window.addEventListener("load",function(){
		var btnPrint = document.getElementById("btn-print");
		btnPrint.onclick = printResult;
		
		function printResult(){
			var x, y;
			x=prompt("x의 값을 입력하세요",0);
			y=prompt("y의 값을 입력하세요",0);
			x=parseInt(x);
			y=parseInt(y);
			btnPrint.value=x+y;
		}
	});