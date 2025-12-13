class Solution {
    public double[] convertTemperature(double c) {
        Double k=c+273.15;
        Double f=c*1.80+32.00;
       return new double[]{k, f};
    }
}