package uk.ac.mmu.cnt;

public class TestAuthor {
	
	public static void main(String[] args){
		Author jackNoble = new Author("Jack Noble", "jack.noble@stu.mmu.ac.uk", 'm');
		System.out.println(jackNoble);
		
		jackNoble.setEmail("15081579@stu.mmu.ac.uk");
		System.out.println(jackNoble);
		System.out.println("Name is > " + jackNoble.getName());
		System.out.println("Gender is > " + jackNoble.getGender());
		System.out.println("Email is > " + jackNoble.getEmail());
		
	}

}
