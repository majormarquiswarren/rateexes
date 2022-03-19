package rateexes.webapi.Data.Entities;

import java.time.Instant;
import rateexes.webapi.Data.Enums.Gender;

public class Post
{
	private long id;
	private Instant timestamp;
	
	private String subjectFirstName;
	private String subjectMiddleName;
	private String subjectLastName;
	
	// Convert to date format depending on the quantity of information
	private String subjectDateOfBirh;
	// If no DOB ask user for subjectAge, otherwise convert
	private String subjectAge;
	
	private String subjectCityOfResidence;
	
	private Gender subjectGender;
	
	// Tags
	
	// Social networks information
	
	
	// Convert to date format depending on the quantity of information
	private String relationshipStartDate;
	private boolean isRelationshipCurrent;
	private String relationshipEndDate;
	
	
	
}
