<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�����ϱ�</title>
</head>
<body>
<h3>switch�� �̿��ؼ� ���� �����ϱ�</h3>
<hr>
<script src="lib.js"></script>
<script type="text/javascript">
	var x=100; // ��������

	var num = prompt("������ ������ ��ȣ�� �Է��ϼ���", "");
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
		document.write("<h3>���콺 �÷� ������</h3>");
		document.write("<hr>");
		document.write("<img src=\"apple.png\" alt=\"�̹���\" onmouseover=\"this.src='banana.png'\" onmouseout=\"this.src='apple.png'\">");
	}
	
	function h2(){
		function over(obj) {
			obj.src="banana.png";
		}
		function out(obj) {
			obj.src="apple.png";
		}
		
		document.write("<h3>���콺 �÷� ������</h3>");
		document.write("<hr>");
		document.write("<img src=\"apple.png\" alt=\"�̹���\" onmouseover=\"over(this)\" onmouseout=\"out(this)\">");
	}
	
	function h3(){
		document.write("<h3>���콺 �÷� ������</h3>");
		document.write("<hr>");
		document.write("<img src=\"apple.png\" alt=\"�̹���\" onmouseover=\"over(this)\" onmouseout=\"out(this)\">");
	}
	
	function h4(){
		document.write("<h3>��ũ�� href�� �ڹٽ�ũ��Ʈ �ۼ�</h3>")
		document.write("<hr>");
		document.write("<a href=\"javascript:alert('Ŭ���ϼ̾��?')\">");
		document.write("Ŭ���غ�����</a>");
	}
	
	function h5(){
		documnet.write("<h3>document.write() Ȱ��</h3>");
		document.write("<hr>");
		document.write("<h3>Welcome!</h3>");
		document.write("2 + 5 �� <br>");
		document.write("<mark>7 �Դϴ�.</mark>");
	}
	
	function h6(){
		document.wirte("<h3>���������� ��������</h3>");
		document.write("<hr>");
		
		function f() { // �Լ� f() ����
			var x=1; // ��������
			document.write("�������� x=" + x);
			document.write("<br>");
			document.write("�������� x=" + this.x);
		}
		f(); // �Լ� f() ȣ��
	}
	
	function h7(){
		document.write("<h3>���</h3>");
		document.write("<hr>");
		var oct = 015; // 015�� 8����. 10������ 13
		var hex = 0x15; // 0x14�� 16����. 10������ 21
		var condition = true; // True�� �ϸ� �ȵ�

		document.write("8���� 015�� �������� " + oct + "<br>");
		document.write("16���� 0x15�� �������� " + hex + "<br>");
		document.write("condition�� " + condition + "<br>");
		document.write('���ڿ� : �����ο��ȣ�ε� ǥ��' + "<br>");
		document.write("�׳�� \"��������\"��� �߽��ϴ�.");
	}
	
	function h8(){
		document.write("<h3>�������</h3>");
		document.write("<hr>");
		var x=32;
		var total = 100 + x*2/4 - 3; // total�� 113
		var div = x / 10; // div�� 3.2
		var mod = x % 2; // x�� 2�� ���� ������, 0

		document.write("x : " + x + "<br><br>");
		document.write("100 + x*2/4 - 3 = " + total + "<br>");
		document.write("x/10 = " + div + "<br>");
		document.write("x%2 = " + mod + "<br>");
	}
	
	function h9(){
		document.write("<h3>���� ����</h3>");
		document.write("<hr>");
		var x=3, y=3, z=3;
		document.write("x=" + x + ", y=" + y);
		document.write(", z=" + z + "<br><br>");

		x += 3; // x=x+3 -> x=6
		y *= 3; // y=y*3 -> y=9
		z %= 2; // z=z%2 -> z=1

		document.write("x += 3; ���� ��, x=" + x + "<br>");
		document.write("y *= 3; ���� ��, y=" + y + "<br>");
		document.write("z %= 2; ���� ��, z=" + z);
	}
	
	function h10(){
		document.write("<h3>�� ����</h3>");
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
		document.write("<h3>�� ����</h3>");
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
		document.write("<h3>���� ����</h3>");
		document.write("<hr>");
		var a=3, b=5;
		document.write("a=" + a + ", b=" + b + "<br><br>");
		document.write("�μ��� ���� : " + ((a>b)?(a-b):(b-a)));
	}
	
	function digit8(v) { // ���� v�� 8��Ʈ 2������ ��ȯ
		var str="";
		for(i=0; i<8; i++, v<<=1) {
			if((v & 0x80)) str += "1";
			else str += "0";
		}
		return str;
	}
	
	function h13(){
		document.write("<h3>��Ʈ ����</h3>");
		document.write("<hr>");
		var x=10, y=3;
		document.write("<pre>");
		document.write("x=" + x + ", y=" + y + "<br>"); // x, y �� ���
		document.write("x : 		" + digit8(x) + "<br>"); // x �� ���
		document.write("y : 		" + digit8(y) + "<br>"); // y �� ���
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
		document.write("<h3>���ڿ� ����</h3>");
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
		document.write("<h3>if-else�� �̿��� ���� �ű��</h3>");
		document.write("<hr>");
		var grade;
		var score = prompt("Ȳ���� �� ������ �Է��ϼ���", 100);
		score = parseInt(score); // ���ڿ��� ���ڷ� �ٲ�
		if(score >= 90) // score�� 90 �̻�
			grade = "A";
		else if(score >= 80) // 80 �̻� 90 �̸�
			grade = "B";
		else if(score >= 70) // 70 �̻� 80 �̸�
			grade = "C";
		else if(score >= 60) // 60 �̻� 70 �̸�
			grade = "D";
		else // 60 �̸�
			grade = "F";
		document.write(score + "�� " + grade + "�Դϴ�.<br>")
	}
	
</script>
</body>
</html>