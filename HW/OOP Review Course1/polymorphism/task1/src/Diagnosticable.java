public interface Diagnosticable {
//    Declare a hasFever method that reutrns true is the temperature
//    is greater than 100.4

    double getTemperature();
    void setTemperature(double t);
    boolean hasFever();

    int getSystolic();
    int getDiastolic();

//    Decleare two setters. One for systolic and one for diastolic.
//    Check the getters to infer the parameter types.
    void setSystolic(int s);
    void setDiastolic(int s);
}
