package uk.ac.mmu.cnt;

public class TestBook {

	public static void main(String[] args) {
		Author jackNoble = new Author("Jack Noble", "jack.noble@stu.mmu.ac.uk", 'm');
		System.out.println(jackNoble);
		
		Book dummyBook = new Book("Hitchhiker's Guide to the Galaxy", jackNoble, 1.99, 24);
		System.out.println(dummyBook);
		
		dummyBook.setPrice(12.99);
		dummyBook.setQty(42);
		System.out.println(dummyBook);
		System.out.println("Name > " + dummyBook.getName());
		System.out.println("Price > £" + dummyBook.getPrice());
		System.out.println("Quantity > " + dummyBook.getQty());
		System.out.println("Author > " + dummyBook.getAuthor());
		System.out.println("Author Email > " + dummyBook.getAuthor().getEmail());
		System.out.println("Author's Gender > " + dummyBook.getAuthor().getGender());
		
		Book moreDummyBook = new Book("A Song of Ice and Fire", 
				new Author("George R.R. Martin", "dunno@grrm.com", 'm'),
				20.00, 7);
		System.out.println(moreDummyBook);

	}

}
