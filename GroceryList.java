import java.util.ArrayList;

public class GroceryList {




   ArrayList<String> groceryList = new ArrayList<>();


   public void addItem(String item){
       groceryList.add(item);
       System.out.println(item + " is added to the list");
   }

   public void printList(){
       System.out.println("You have " + groceryList.size() + " items in the list");

       for(int i = 0;i<groceryList.size();i++){
           System.out.println("Item " + (i+1) + " ." + groceryList.get(i));
       }
   }

   public void removeItem(String item){
       groceryList.remove(item);
       System.out.println(item + " is removed from the list");
   }
   public void modifyItem(String oldItem,String newItem){
       int position = searchForItem(oldItem);
       if(position>=0){
           modifyItem(position,newItem);
       }
   }
   private void modifyItem(int oldItem,String newItem){
       groceryList.set(oldItem,newItem);
   }

   public int searchForItem(String searchItem){
      return groceryList.indexOf(searchItem);
   }



    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void findItem(String item){
       int position = searchForItem(item);
       if(position>=0){
           System.out.println("Found " + item + " in the list");
       }else{
           System.out.println(item + " is not in the list");
       }
   }
}
