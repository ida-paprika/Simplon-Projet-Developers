package fr.formation.developers.validation;

import java.time.LocalDate;
import java.time.Period;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MajorityValidator implements ConstraintValidator<Majority, LocalDate> {

	@Override
	public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
		if (value == null) {
			return true;
		}
		
        LocalDate today = LocalDate.now();
        LocalDate majorDate = today.minusYears(18);
        
        return value.isBefore(majorDate);

//        Period period = Period.between(value, today);
//
//        if (period.getYears() < 18) {
//        	return false;
//        }
//        
//		return true;
	}

}
