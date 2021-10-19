package HasRelation;

public class HasARelationshipDemo {
		public static void main(String[] args) {
			Student student = new Student();
			
			Library library = new Library();
			
			library.name = "Sharada";
			library.noOfBooks = 100;
			library.location = "Bangalore";
			library.student = student;
		    library.student.name= "Krithi";
		    library.student.dob= "01/01/1999";
		    library.student.id = "1";
		    
		    System.out.println("library name : "+ library.name);
		    System.out.println("library noOfBooks : "+ library.noOfBooks);
		    System.out.println("library location : "+ library.location);
		    System.out.println("student name : " +library.student.name);
		    System.out.println("student dob : " +library.student.dob);
		    System.out.println("student id : " +library.student.id);
			
		}
		}



