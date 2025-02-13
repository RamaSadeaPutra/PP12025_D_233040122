package Pertemuan_1;

public class NodeMain {

	public static void main(String[] args) {
		
//		Membuat 2 buah n1 & n2
		Node n1 = new Node (5);
		Node n2 = new Node (7);
//		Membuat 2 buah n3 & n4
		Node n3 = new Node (9);
		Node n4 = new Node (8);
//		membuat 2 buah n5 & n6
		Node n5 = new Node (2);
		Node n6 = new Node (3);
		
//		Membuat relasi Node n1 & n2
		n1.setNext (n2);
//		Membuat relasi Node n2 & n3
		n2.setNext (n3);
//		Membuat relasi Node n3 & n4
		n3.setNext (n4);
//		Membuat relasi Node n5 & n6
		n5.setNext(n6);
//		Membuat relasi Node n6 & n1
		n6.setNext(n1);
		
//		Menampilkan Node dengan Pointer p dan p1
		Node p = n1;
		Node p1 = n5;
		while(p != null)
		{
			System.out.printf("%d ", p.getNilai());
			p = p.getNext();
		}
		System.out.println("");
		while(p1 != n4)
		{
			System.out.printf("%d ", p1.getNilai());
			p1 = p1.getNext();
		}
	}
}
