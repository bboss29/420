public class ChildPatient extends Person implements Diagnosticable {
    double temperature;
    int systolic;
    int diastolic;
    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public boolean hasFever() {
        return this.temperature > 100.4;
    }

    @Override
    public int getSystolic() {
        return systolic;
    }

    @Override
    public int getDiastolic() {
        return diastolic;
    }

    @Override
    public void setTemperature(double t) {
        temperature = t;
    }

    @Override
    public void setSystolic(int s) {
        systolic = s;
    }

    @Override
    public void setDiastolic(int d) {
        diastolic = d;
    }
}
