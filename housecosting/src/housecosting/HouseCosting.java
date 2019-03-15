package housecosting;

//Class for calculating the housecosting
public class HouseCosting {
	
	//method taking type of house and Area of the house for calculating 
	public int constructionCost(String type,int squareFeet) {
		
		switch (type) { 
		
		//Cost for  a standard house
        case "standard": 
            return 1200 * squareFeet; 
         
        //Cost for  a above standard house    
        case "above standard": 
        	return 1500 * squareFeet; 
        	
        //Cost for  a high standard house     
        case "high standard": 
        	return 1800 * squareFeet; 
        	
        //Cost for  a high standard and fully automated house    
        case "high standard and fully automated": 
        	return 2500 * squareFeet; 
             
        default:  
            return -1;
	}
		

}
}
