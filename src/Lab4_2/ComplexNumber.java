package Lab4_2;

public class ComplexNumber {
    private double deystv; 
    private double mnim;   

    public ComplexNumber() {
        deystv = 0;
        mnim = 0;
    }

    public ComplexNumber(double deystv, double mnim) {
        this.deystv = deystv;
        this.mnim = mnim;
    }

    public double getDeystv() {
        return deystv;
    }

    public void setDeystv(double deystv) {
        this.deystv = deystv;
    }

    public double getMnim() {
        return mnim;
    }

    public void setMnim(double mnim) {
        this.mnim = mnim;
    }

    
    public static ComplexNumber fromPolar(double r, double phi) {
        double a = r * Math.cos(phi);
        double b = r * Math.sin(phi);
        return new ComplexNumber(a, b);
    }

    public String toString() {
        if (mnim >= 0) {
            return deystv + " + " + mnim + "i";
        } else {
            return deystv + " - " + (-mnim) + "i";
        }
    }

    public static void main(String[] args) {
        double r = 5;
        double phi = Math.PI / 6;

        ComplexNumber z = ComplexNumber.fromPolar(r, phi);
        System.out.println(z);
    }
}

