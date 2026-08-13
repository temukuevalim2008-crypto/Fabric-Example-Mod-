package com.example;

public class SmoothAnimation {
    private double current = 0.0;
    private double target = 0.0;

    public void run(double targetValue, float speed) {
        this.target = targetValue;
        double diff = this.target - this.current;
        this.current += diff * speed;
        if (Math.abs(this.current - this.target) < 0.001) {
            this.current = this.target;
        }
    }

    public float get() {
        return (float) this.current;
    }

    public void set(double value) {
        this.current = value;
        this.target = value;
    }
}

