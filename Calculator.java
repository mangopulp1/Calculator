package calculator;

public class Calculator {
	
	  // factorial function
    
	   public static int fact(int j) {
	      
			   int d = j;
			   int fact = 1;
			    
		    for(int i = 1; i <= d; i++) {
			        
			      fact *= i;
				    
			   }
			    return fact; 
	    }
	    
	    // Square function
	    
	   public static int square(int j) {
	        
	      int w = j*j;
	       return w;
			   
	    }	   
	    
	    // squareRoot function
	    
	    public static double squareRoot(double j) {
	        
	        double l =  Math.sqrt(j);
	        return l;
	    }
	    
	    // acceleration function
	    
	    public static double acceleration(double initialVelocity, double finalVelocity, double time) {
	        
	         double acceleration = (double) (finalVelocity - initialVelocity) / time;
	         return acceleration;
	    }
	    
	    // Speed function
	    
	    public static double speed(double distance, double time) {
	        
	        double speed =  (double) distance / time;
	        return speed;
	    }

	    
	    // Force function

	     public static int force(int m, int a) {
	         
	         int force = m*a;
	         return force;
	     }


	     // power function
	    
	    public static double power(double work, double time) {
	        
	        double power = (double) work / time;
	        return power;
	    }
		
	     // work function
	    
	    public static double work(double force, double distance) {
	        
	        double work = (double) force*distance;
	        return work;
	    }
	     
	    // Sound's speed function
		 
	     public static double soundSpeed(double wavelength, double frequency) {
	     
	          double soundSpeed = (double)  wavelength*frequency;
	          return soundSpeed;
	     }
	     
	     // Kinetic energy function
		 
	     public static int kineticEnergy(int mass, int velocity) {
	     
	          int K = mass * velocity*velocity * 1/2;
	          return K;
	     }
	    
	    // Addition function
	    
	    public static double addition(double num1, double num2) {
	        
	        double e = num1 + num2;
	        return e;
	    }
	    
	    // Subtraction function
	    
	    public static double subtraction(double num1, double num2) {
	        
	        double a = num1 - num2;
	        return a;
	    }
	    
	    // multiplication function
	    
	    public static double multiplication(double num1, double num2) {
	        
	       double q = num1 * num2;
	        return q;
	    }
	    
	    // Division function
	    
	    public static double division(double num1, double num2) {
	        
	        double k = num1 / num2;
	        return k;
	    }
	    
	    // Remainder function
	    
	    public static double remainder(double num1, double num2) {
	        
	         double l = num1 % num2;
	        return l;
	    }
	    
	    // Tan function
	    
	    public static double tan(double j) {
	        
	        double tan = Math.tan(j);
	        return tan;
	    }
	    
	     // Cos function
	    
	    public static double cos(double j) {
	        
	        double cos = Math.cos(j);
	        return cos;
	    }
	    
	     // Sin function
	    
	    public static double sin(double j) {
	        
	        double sin = Math.sin(j);
	        return sin;
	    }
	    
	    // PI function
	    
	    public static double PI(double j) {
	        
	        double PI = 3.141592653589793238;
	        double val = PI*j;
	        return val;
	    }
	    
	    
	    // log function
	    
	    public static double log(double j) {
	        
	        double log = Math.log(j) / Math.log(2);
	        return log;
	    }
	    
	    // e function
	    
	    public static double e(double j) {
	        
	        double e = 2.718281828459045;
	        double eVal = e*j;
	        return eVal;
	    }
	    
	    // EXP function
	    
	    public static double EXP(double j) {
	        
	        double EXPval = Math.exp(j);
	        return EXPval;
	    }
}
