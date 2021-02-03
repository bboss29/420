import java.util.ArrayList;

public class AdultPatient extends Person implements Diagnosticable, Employable {
//  TODO
//  Implement the class Adult Patient.
//  An adult patient is a Person that is Diagnosticable and that is Employable.

    double temperature;
    int systolic;
    int diastolic;
    private ArrayList<String> prevJobs;

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

    @Override
    public ArrayList<String> getPreviousJobs() {
        if (this.prevJobs == null)
            this.prevJobs = new ArrayList<String>();
        return this.prevJobs;
    }

    @Override
    public void addJob(String job) {
        if (this.prevJobs == null)
            this.prevJobs = new ArrayList<String>();
        prevJobs.add(job);
    }
}
