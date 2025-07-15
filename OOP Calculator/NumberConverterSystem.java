package final_assignment_codes;

public class NumberConverterSystem {
	
	
	String numConverter(int NumYouWantToConvert, int convertor, String result) {
		switch(convertor)
		{
		case 1:
		{
		result =Integer.toBinaryString(NumYouWantToConvert);
		break;
		}
		case 2:
		{
		result =Integer.toOctalString(NumYouWantToConvert);		
		break;
		}
		case 3:
		{
		result =Integer.toHexString(NumYouWantToConvert);	
		break;
		}
		}
		System.out.println(result);
		return result;
		
	}
	//writen by student yanal bataineh
		//instructor : Dania Al Said
		//HTU university
		//prigramming course section 10 
}



