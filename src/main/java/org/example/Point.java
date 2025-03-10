package org.example;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double distance() {
        return Math.sqrt((x - 0)* (x - 0) + (y - 0) * (y - 0));
    }
    public double distance(Point point) {
        return Math.sqrt((x - point.getX()) * (x - point.getX()) + (y - point.getY()) * (y - point.getY()));
    }
    public double distance(int a, int b){
        return Math.sqrt((x - a) * (x - a) + (y - b) * (y - b));
    }
}
