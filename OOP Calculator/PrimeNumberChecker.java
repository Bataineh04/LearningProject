package final_assignment_codes;

public class PrimeNumberChecker {

	boolean primeChecker(int checkIfPrime) {
		if (checkIfPrime < 2) {
			return false;
		}

		for (int i = 2; i < checkIfPrime; i++) {
			if (checkIfPrime % i == 0) {
				return false;
			}
		}
		return true;
	}
	// writen by student yanal bataineh
	// instructor : Dania Al Said
	// HTU university
	// prigramming course section 10
}
