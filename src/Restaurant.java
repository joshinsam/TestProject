public class Restaurant implements java.io.Serializable {
    
    private static final long serialVersionUID = 205L ; 
    private String restaurantName;
    private int stars; 
    private String review ; 
    private int priceRange; 
    private String location; 
    private Cuisine cuisine; 



    public  Restaurant(String restaurantName, int stars, String review, int priceRange ,String location, Cuisine cuisine){
            this.restaurantName = restaurantName;
            this.stars = stars;
            this.review = review; 
            this.priceRange = priceRange ; 
            this.location = location;
            this.cuisine = cuisine; 
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String starSymbol() {
		
		String symbol = "*" ;
		
		for (int i = 0 ; i < getStars()- 1 ; ++i) {
			symbol += "*" ;
		}
		
		return symbol ; 
	}

    public int getStars() {
        return stars;
    }

    public int getPriceRange() {
        return priceRange;
    }

    public String getLocation() {
        return location;
    }

    public Cuisine getCuisine() {
        return cuisine;
    }

    public String getReview() {
        return review ;
    }

    public String priceRangeSymbol() { 
		
		String priceRange = "$" ; 
		
		for (int i = 0 ; i < getPriceRange() -1 ; ++i) {
			
			 priceRange += "$" ; 
			
		}
		return priceRange ; 
		
	}

    /**
     * @return
     */
    public String toString() {
		return String.format(restaurantName + " restaurant\n" + starSymbol() + "\t\t" + priceRangeSymbol() + "\n" + cuisine.toString() + "Location: " + location + "\n" + "Review:\t" + review + "\n\n") ; 
	}

}
