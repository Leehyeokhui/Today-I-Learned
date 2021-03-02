<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>통합하기</title>
</head>
<body>
<h3>switch문 이용해서 파일 통합하기</h3>
<hr>
<script src="lib.js"></script>
<script type="text/javascript">
	var x=100; // 전역변수

	var num = prompt("실행할 파일의 번호를 입력하세요", "");
	num = parseInt(num);
	switch(num){
	case 1:
		h1();
		break;
	case 2:
		h2();
		break;
	case 3:
		h3();
		break;
	case 4:
		h4();
		break;
	case 5:
		h5();
		break;
	case 6:
		h6();
		break;
	case 7:
		h7();
		break;
	case 8:
		h8();
		break;
	case 9:
		h9();
		break;
	case 10:
		h10();
		break;
	case 11:
		h11();
		break;
	case 12:
		h12();
		break;
	case 13:
		h13();
		break;
	case 14:
		h14();
		break;
	case 15:
		h15();
		break;
	}
	
	function h1(){
		document.write("<h3>마우스 올려 보세요</h3>");
		document.write("<hr>");
		document.write("<img src=\"apple.png\" alt=\"이미지\" onmouseover=\"this.src='banana.png'\" onmouseout=\"this.src='apple.png'\">");
	}
	
	function h2(){
		function over(obj) {
			obj.src="banana.png";
		}
		function out(obj) {
			obj.src="apple.png";
		}
		
		document.write("<h3>마우스 올려 보세요</h3>");
		document.write("<hr>");
		document.write("<img src=\"apple.png\" alt=\"이미지\" onmouseover=\"over(this)\" onmouseout=\"out(this)\">");
	}
	
	function h3(){
		document.write("<h3>마우스 올려 보세요</h3>");
		document.write("<hr>");
		document.write("<img src=\"apple.png\" alt=\"이미지\" onmouseover=\"over(this)\" onmouseout=\"out(this)\">");
	}
	
	function h4(){
		document.write("<h3>링크의 href에 자바스크립트 작성</h3>")
		document.write("<hr>");
		document.write("<a href=\"javascript:alert('클릭하셨어요?')\">");
		document.write("클릭해보세요</a>");
	}
	
	function h5(){
		documnet.write("<h3>document.write() 활용</h3>");
		document.write("<hr>");
		document.write("<h3>Welcome!</h3>");
		document.write("2 + 5 는 <br>");
		document.write("<mark>7 입니다.</mark>");
	}
	
	function h6(){
		document.wirte("<h3>지역변수와 전역변수</h3>");
		document.write("<hr>");
		
		function f() { // 함수 f() 선언
			var x=1; // 지역변수
			document.write("지역변수 x=" + x);
			document.write("<br>");
			document.write("전역변수 x=" + this.x);
		}
		f(); // 함수 f() 호출
	}
	
	function h7(){
		document.write("<h3>상수</h3>");
		document.write("<hr>");
		var oct = 015; // 015는 8진수. 10진수로 13
		var hex = 0x15; // 0x14는 16진수. 10진수로 21
		var condition = true; // True로 하면 안됨

		document.write("8진수 015는 십진수로 " + oct + "<br>");
		document.write("16진수 0x15는 십진수로 " + hex + "<br>");
		document.write("condition은 " + condition + "<br>");
		document.write('문자열 : 단일인용부호로도 표현' + "<br>");
		document.write("그녀는 \"누구세요\"라고 했습니다.");
	}
	
	function h8(){
		document.write("<h3>산술연산</h3>");
		document.write("<hr>");
		var x=32;
		var total = 100 + x*2/4 - 3; // total은 113
		var div = x / 10; // div는 3.2
		var mod = x % 2; // x를 2로 나눈 나머지, 0

		document.write("x : " + x + "<br><br>");
		document.write("100 + x*2/4 - 3 = " + total + "<br>");
		document.write("x/10 = " + div + "<br>");
		document.write("x%2 = " + mod + "<br>");
	}
	
	function h9(){
		document.write("<h3>대입 연산</h3>");
		document.write("<hr>");
		var x=3, y=3, z=3;
		document.write("x=" + x + ", y=" + y);
		document.write(", z=" + z + "<br><br>");

		x += 3; // x=x+3 -> x=6
		y *= 3; // y=y*3 -> y=9
		z %= 2; // z=z%2 -> z=1

		document.write("x += 3; 실행 후, x=" + x + "<br>");
		document.write("y *= 3; 실행 후, y=" + y + "<br>");
		document.write("z %= 2; 실행 후, z=" + z);
	}
	
	function h10(){
		document.write("<h3>비교 연산</h3>");
		document.write("<hr>");
		var x=13, y=7;
		document.write("x=" + x + ", y=" + y + "<br><br>");
		document.write("x == y : " + (x == y) + "<br>");
		document.write("x != y : " + (x != y) + "<br>");
		document.write("x >= y : " + (x >= y) + "<br>");
		document.write("x > y : " + (x > y) + "<br>");
		document.write("x <= y : " + (x <= y) + "<br>");
		document.write("x < y : " + (x < y) + "<br>");
	}
	
	function h11(){
		document.write("<h3>논리 연산</h3>");
		document.write("<hr>");
		var x=true; y=false;
		document.write("x=" + x + ", y=" + y + "<br><br>");
		document.write("x && y : "+ (x&&y) +"<br>");
		document.write("x || y : "+ (x||y) +"<br>");
		document.write("!x : " + (!x) +"<br>");
		document.write("<hr>");
		document.write("(3>2) && (3<4) : " + ((3>2)&&(3<4)) + "<br>");
		document.write("(3==-2) || (-1<0) : " + ((3==2)||(-1<0)));
	}
	
	function h12(){
		document.write("<h3>조건 연산</h3>");
		document.write("<hr>");
		var a=3, b=5;
		document.write("a=" + a + ", b=" + b + "<br><br>");
		document.write("두수의 차이 : " + ((a>b)?(a-b):(b-a)));
	}
	
	function digit8(v) { // 숫자 v를 8비트 2진수로 변환
		var str="";
		for(i=0; i<8; i++, v<<=1) {
			if((v & 0x80)) str += "1";
			else str += "0";
		}
		return str;
	}
	
	function h13(){
		document.write("<h3>비트 연산</h3>");
		document.write("<hr>");
		var x=10, y=3;
		document.write("<pre>");
		document.write("x=" + x + ", y=" + y + "<br>"); // x, y 값 출력
		document.write("x : 		" + digit8(x) + "<br>"); // x 값 출력
		document.write("y : 		" + digit8(y) + "<br>"); // y 값 출력
		document.write("<hr>");
		document.write("x & y  : 	" + digit8(x&y) + "<br>");
		document.write("x | y  : 	" + digit8(x|y) + "<br>");
		document.write("x ^ y  : 	" + digit8(x^y) + "<br>");
		document.write("~x     : 	" + digit8(~x) + "<br>");
		document.write("<hr>");
		document.write("x << 1 : 	" + digit8(x<<1) + " (" + (x<<1) + ")<br>");
		document.write("x >> 1 : 	" + digit8(x>>1) + " (" + (x>>1) + ")<br>");
		document.write("x >>> 1: 	" + digit8(x>>>1) + " (" + (x>>>1) + ")");
		document.write("</pre>");
	}
	
	function h14(){
		document.write("<h3>문자열 연산</h3>");
		document.write("<hr>");
		document.write("abc" + 23 + "<br>");
		document.write(23 + "abc" + "<br>");
		document.write(23 + "35" + "<br>");
		document.write(23 + 35 + "<br>");
		document.write(23 + 35 + "abc" + "<br>");
		document.write("abc" + 23 + 35 + "<br><hr>");

		var name = "kitae";
		document.write(name == "kitae");
		document.write("<br>");
		document.write(name > "park");
	}
	
	function h15(){
		document.write("<h3>if-else를 이용한 학점 매기기</h3>");
		document.write("<hr>");
		var grade;
		var score = prompt("황기태 님 점수를 입력하세요", 100);
		score = parseInt(score); // 문자열을 숫자로 바꿈
		if(score >= 90) // score가 90 이상
			grade = "A";
		else if(score >= 80) // 80 이상 90 미만
			grade = "B";
		else if(score >= 70) // 70 이상 80 미만
			grade = "C";
		else if(score >= 60) // 60 이상 70 미만
			grade = "D";
		else // 60 미만
			grade = "F";
		document.write(score + "는 " + grade + "입니다.<br>")
	}
	
</script>
</body>
</html>