package fr.formation.developers.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.developers.domain.dtos.ProjectCreate;

public class DifferentValuesValidator
	implements ConstraintValidator<DifferentValues, ProjectCreate> {

//	private String firstField;
//	private String secondField;
//	
//	@Override
//    public void initialize(DifferentValues constraintAnnotation) {
//        this.firstField = constraintAnnotation.firstField();
//        this.secondField = constraintAnnotation.secondField();
//    }

    @Override
    public boolean isValid(ProjectCreate value,
	    ConstraintValidatorContext context) {

//        Object firstFieldValue = new BeanWrapperImpl(value)
//          .getPropertyValue(firstField);
//        Object secondFieldValue = new BeanWrapperImpl(value)
//          .getPropertyValue(secondField);
//        
//        if (firstFieldValue == null || secondFieldValue == null) {
//        	return false;
//        }
//        
//		return !firstFieldValue.equals(secondFieldValue);

	return !value.getName().equals(value.getDescription());
    }

}
