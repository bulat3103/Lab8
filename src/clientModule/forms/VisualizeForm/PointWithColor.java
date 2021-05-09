package clientModule.forms.VisualizeForm;

import common.data.SpaceMarine;

import java.awt.*;
import java.awt.geom.Point2D;

public class PointWithColor extends Point2D {
    public int x;
    public int y;
    public Color color;
    public int radius;
    public String text;
    private SpaceMarine marine;

    public PointWithColor(int x, int y, Color color, int radius, String text, SpaceMarine marine) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.radius = radius;
        this.text = text;
        this.marine = marine;
    }

    public String getText() {
        return text;
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

    public void setLocation(int x, int y) {
        move(x, y);
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
