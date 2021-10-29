import static org.mockito.Mockito.*;
public class StudentCheckTester {
StudentCheck check;
public StudentService service;
public static void main(String[] args) {
	StudentCheckTester test = new StudentCheckTester(); 
	test.initialise();
	test.testcasel();
}
public void initialise() {
	check = new StudentCheck();
	service = mock(StudentService.class);
	check.setService(service);
}
public void testcasel() {
	Student s = new Student("keerthana",24);
	check.setStudent(s);
	when(service.display(s)).thenReturn("keerthana");
}
}
