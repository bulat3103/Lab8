package clientModule.forms.VisualizeForm;

import common.data.SpaceMarine;

import java.awt.*;
import java.awt.geom.Point2D;

public class PointWithColor extends Point2D implements Comparable<PointWithColor>{
    public int x;
    public int y;
    public Color color;
    public int radius;
    public String text;
    private SpaceMarine marine;
    private int key;

    public PointWithColor(int x, int y, Color color, int radius, String text, SpaceMarine marine, int key) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.radius = radius;
        this.text = text;
        this.marine = marine;
        this.key = key;
    }

    public String getText() {
        return text;
    }

    public int getKey() {
        return key;
    }

    public SpaceMarine getMarine() {
        return marine;
    }

    public int getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public void setLocation(double x, double y) {
        this.x = (int) Math.floor(x + 0.5);
        this.y = (int) Math.floor(y + 0.5);
    }

    @Override
    public int compareTo(PointWithColor o) {
        return this.marine.compareTo(o.marine);
    }
}
