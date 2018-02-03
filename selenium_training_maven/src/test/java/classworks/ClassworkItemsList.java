package classworks;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.HashMap;

public class ClassworkItemsList {

//    Below is the source code of a sample webpage which displays a food item along with its servings.
//
//<html>
//<head>
//<body>
//<div class=”itemContent”>
//
//<span class="title ng-binding" ng-bind="food.name">Apple butter</span>
//<span class="description ng-binding" ng-bind="food._servingDesc">1 Tbsp</span>
//
//<span class="title ng-binding" ng-bind="food.name">Apple(s) fresh</span>
//<span class="description ng-binding" ng-bind="food._servingDesc">1 medium</span>
//
//<span class="title ng-binding" ng-bind="food.name">Applesauce, unsweetened </span>
//<span class="description ng-binding" ng-bind="food._servingDesc">1/2 cup(s)</span>
//
//<span class="title ng-binding" ng-bind="food.name">Apple(s), dried</span>
//<span class="description ng-binding" ng-bind="food._servingDesc">1/4 cup(s)</span>
//
//<span class="title ng-binding" ng-bind="food.name">Juice, Cranberry-apple drink</span>
//<span class="description ng-binding" ng-bind="food._servingDesc">8 fl oz</span>
//
//</div>
//</body>
//</head>
//</html>
//
//    Use your knowledge of WebDriver to fetch the following:
//    a)	Display the third and fifth item from the above list. Your output should be:
//    Applesauce, unsweetened
//    Juice, Cranberry-apple drink
//    b)	Fetch each food name and its servings and store them in a Map.
//    Iterate through all the entries in the Map and print them.





    @Test
    public void printElements() {
      //Gets list of elements by xpath
//    List <WebElement> itemsList = DriverWrapper.getDriver().findElements(By.xpath(".//span[@class=\"title ng-binding\"]//descendant::*"));
//    List <WebElement> descriptionItemsList = DriverWrapper.getDriver().findElements(By.xpath(".//span[@class=\"description ng-binding\"]//descendant::*"));

          //Test arrays for showing result
        ArrayList<String> titleList = new ArrayList<>();
        ArrayList<String> titleDescription = new ArrayList<>();
        titleList.add(0, "Apple butter");
        titleList.add(1, "Apple(s) fresh");
        titleList.add(2, "Applesauce, unsweetened");
        titleList.add(3, "Apple(s), dried");
        titleList.add(4, "Juice, Cranberry-apple drink");

        titleDescription.add(0, "1 Tbsp");
        titleDescription.add(1, "1 medium");
        titleDescription.add(2, "1/2 cup(s)");
        titleDescription.add(3, "1/4 cup(s)");
        titleDescription.add(4, "8 fl oz");

        // Prints elements from web List of web element
//        System.out.println(itemsList.get(2).getText());
//        System.out.println(itemsList.get(4).getText());

        System.out.println(titleList.get(2));
        System.out.println(titleList.get(4));
        System.out.println("------------------------------");

        //Instance of hashMap collection
        HashMap<String, String> itemsToHashMap = new HashMap<>();

        //Goes through lists and adds the key, value to hashMap
//    for (int i=0; i<itemsList.size();i++) {
//        String resultValue= itemsList.get(i).getText();
//        String resultKey = descriptionItemsList.get(i).getText();
//        itemsToHashMap.put(resultKey,resultValue);
//    }


        //Example test
        for (int i=0; i<titleList.size();i++){
        itemsToHashMap.put(titleList.get(i),titleDescription.get(i));

}
     //Goes trough each element in the hashMap and print it key and value
    for (HashMap.Entry<String,String> getItem : itemsToHashMap.entrySet()) {
        String key = getItem.getKey();
        String value = getItem.getValue();
        System.out.println("Key = "+ key + ": " + " "+ value);
    }
}
}





