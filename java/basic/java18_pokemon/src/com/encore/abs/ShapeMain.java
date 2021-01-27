package com.encore.abs;

class Point{
	private int x;
	private int y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {//객체 설명 메소드 . 타입(클래스풀네임)@참조값
		return "(" + x + ", " + y + ")";
	}
}

abstract class Shape{
	protected Point[] pts; //배열의 이름만 선언, 아직 배열을 만들지 않음
	
	public abstract void draw();
}

class Circle extends Shape{
	private int r;
	
	public Circle(int r, Point p) {//중심점 좌표
		this.r = r;
		pts = new Point[1];
		pts[0] = p;
	}
	
	@Override
	public void draw() {
		System.out.println("중심점 : " + pts[0] + ", 반지름 : " + r + "에 원 그림");
	}
}

class Triangle extends Shape{
	
	public Triangle(Point p, Point t, Point s) {// 포인트 각각 받아오기
		pts = new Point[3];
		pts[0] = p;
		pts[1] = t;
		pts[2] = s;
	}
	
	public Triangle(Point[] arr) { // 배열 형태로 받아오기
		pts = arr;
	}
	
	@Override
	public void draw() {
		System.out.println("밑 변이 " + pts[0] + "에서 " + pts[1] + "이고 꼭지점 좌표가 " + pts[2] + "인 삼각형 그림");	
	}
}

class Rectangel extends Shape{
	private int h;
	
	public Rectangel(int h, Point p, Point t) {
		this.h = h;
		pts = new Point[2];
		pts[0] = p;
		pts[1] = t;
	}
	
	@Override
	public void draw() {
		System.out.println("밑 변이 "+pts[0]+"에서 "+pts[1]+"이고 높이가 "+h+"인 사각형 그림");
	}
}

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] arr = {new Circle(10, new Point(100,100)), 
				new Triangle(new Point(1,2),new Point(3,4),new Point(5,6)),
				new Rectangel(10, new Point(7,8), new Point(100,100))};
		
		for(Shape s : arr) {
			s.draw();
		}
	}	
}
