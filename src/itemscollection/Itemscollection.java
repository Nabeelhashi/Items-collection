package itemscollection;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Items
{
	int Itemid;
	String shortDescribtion;
	String Brand;
	int Price;
	
	
	public Items(int itemid, String shortDescribtion, String brand, int price) {
		this.Itemid = itemid;
		this.shortDescribtion = shortDescribtion;
		this.Brand = brand;
		this.Price = price;
	}
	
	public String getBrand() {
		return Brand;
	}
	
	public int getPrice() {
		return Price;
	}
	
	public String toString() {
        return "Items[itemid=" + Itemid + ",shortDescribtion=" + shortDescribtion + ",Brand=" + Brand +",Price=" + Price + "]";
    }
	
}

public class Itemscollection {

	public static void main(String[] args) {
		
		Items item1 = new Items(1,"Paste","Tagore",20);
		Items item2 = new Items(2,"Brush","Colgate",28);
		Items item3 = new Items(3,"Facewash","Himalaya",170);
		Items item4 = new Items(4,"Soap","Tango",50);
		Items item5 = new Items(5,"Scrubber","Lakme",10);
		Items item6 = new Items(6,"Chips","Torrent",30);
		Items item7 = new Items(7,"Mask","One",40);
		Items item8 = new Items(8,"Cooldrinks","Tilo",25);
		Items item9 = new Items(9,"Oil","Kera",100);
		Items item10 = new Items(10,"Biscuit","Todder",15);
		
		ArrayList<Items> itemlist=new ArrayList<Items>();
		
		itemlist.add(item1);
		itemlist.add(item2);
		itemlist.add(item3);
		itemlist.add(item4);
		itemlist.add(item5);
		itemlist.add(item6);
		itemlist.add(item7);
		itemlist.add(item8);
		itemlist.add(item9);
		itemlist.add(item10);
		
		System.out.println("The collection of items before sorting and filtering.");
		System.out.println();
		
		for(Items item : itemlist)
		{
			System.out.println(item);
		}
		
		
		List<Items> finalresult = itemlist.stream()
				                 .filter(item->item.getBrand().startsWith("T"))
								 .sorted(Comparator.comparing(Items::getPrice).reversed())
								 .collect(Collectors.toList());	
		System.out.println();
		System.out.println("The list after filtering and sorting.");
		System.out.println();
		for(Items item : finalresult)
		{
			System.out.println(item);
		}
			
									
		
	}

}
