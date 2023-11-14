package composite;

public class DemoComposite {

	public static void main(String[] args) {
	
		
		File f1 = new File("test0", "txt", 13.5);
		File f2 = new File("test2", "csv", 1.5);
		File f3 = new File("test3", "dat", 1.00);
		File f4 = new File("test4", "dat", 10.00);
		Folder ff = new Folder("TestComposite");
		Folder ff2 = new Folder("TestComposite2");
		Folder ff3 = new Folder("TestComposite3");
		
		
		ff2.addFile(f2);
		ff2.addFolder(ff3);
		ff2.addFile(f1);
		
		ff.addFile(f3);
		ff.addFile(f4);
		ff.addFolder(ff2);
		
		ff2.removeFolder(ff3);
		
		System.out.println(ff);	
		
		System.out.println(ff2);
		
		System.out.println(ff3);
		
	}
}
