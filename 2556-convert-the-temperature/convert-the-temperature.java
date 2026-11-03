class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans=new double[2];

        double Kelvin=celsius + 273.15;

        ans[0]=Kelvin;

        double fahrenheit=celsius * 1.80 + 32.00;

        ans[1]=fahrenheit;

        return ans;

        
    }
}