// sin function

function sin(number) {
   s = Math.sin(number)
   return s
}

// log function 

function log(number) {
  l = Math.log(number) / Math.log(2)
  return l 
}

// cos function

function cos(number) {
  c = Math.cos(number)
  return c
}

// tan function

function tan(number) {
  t = Math.tan(number)
  return t
}

// add function

function add(number1, number2) {
   return number1 + number2
}

// subtraction function

function sub(number1, number2) {
   return number1 - number2
}

// multiplication function

function multiplication(number1, number2) {
   return number1 * number2
}

// division function

function division(number1, number2) {
   return number1 / number2
}

// remainder function

function remainder(number1, number2) {
   return number1 % number2
}

// square root function

function squareRoot(number) {
   return Math.sqrt(number)
}

// square function

function square(number) {
   return number * number
}

//  function

function add(number1, number2) {
   return number1 + number2
}

// PI function

function PI(number) {
   const  PI = 3.141592653589793238
   return number*PI
}

// e function

function e(number) {
   const e = 2.718281828459045
   return number*e
}

// EXP function

function EXP(number) {
   return Math.exp(number)
}

 // acceleration function
	    
function acceleration(initialVelocity, finalVelocity, time) {
	        
  acceleration = (finalVelocity - initialVelocity) / time
	return acceleration;
 }
	    
	// speed function

function speed(distance, time) {
   return distance / time
}

// kinetic function

function kineticEnergy(mass, velocity) {
   return mass * velocity*velocity * 1/2
}

// work function

function work(force, distance) {
  return force*distance
}

// power function

function power(work, time) {
  return work / time
}

// force function 

function force(mass, acceleration) {
  return mass*acceleration
}

// sound's speed

function soundSpeed(wavelength, frequency) {
  return wavelength*frequency
}

module.exports.Calculator = Calculator

