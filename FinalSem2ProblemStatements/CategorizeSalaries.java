public class CategorizeSalaries {
    
    public static double[] findDetails(double[] salaries) {
        double sum = 0;
        for (double salary : salaries) {
            sum += salary;
        }
        
        double average = sum / salaries.length;
        int countGreaterThanAvg = 0;
        int countLessThanAvg = 0;
        
        for (double salary : salaries) {
            if (salary > average) {
                countGreaterThanAvg++;
            } else if (salary < average) {
                countLessThanAvg++;
            }
        }
        
        return new double[]{average, countGreaterThanAvg, countLessThanAvg};
    }
    
    public static void main(String[] args) {
        // Sample input
        double[] salaries = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
        
        // Find details
        double[] details = findDetails(salaries);
        
        // Print results
        System.out.println("Average salary: " + details[0]);
        System.out.println("Number of salaries greater than the average salary: " + details[1]);
        System.out.println("Number of salaries lesser than the average salary: " + details[2]);
    }
}
