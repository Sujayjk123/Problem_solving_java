public class Enums {
     

      
        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }
    
        
        enum TrafficLight {
            RED, YELLOW, GREEN
        }
    
        
        enum Season {
            WINTER, SPRING, SUMMER, FALL
        }
    
        
        enum Planet {
            MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE
        }
    
        
        enum Direction {
            NORTH, EAST, SOUTH, WEST
        }
    
        
        enum EducationLevel {
            HIGH_SCHOOL, BACHELORS, MASTERS, PHD
        }
    
        
        enum OrderStatus {
            PENDING, SHIPPED, DELIVERED, CANCELLED
        }
    
        
        enum Currency {
            USD, EUR, GBP, INR, JPY
        }
    

        enum TransportMode {
            CAR, BUS, TRAIN, PLANE, SHIP
        }
    
        
        enum GameLevel {
            EASY, MEDIUM, HARD, EXPERT
        }
    
        public static void main(String[] args) {

            Day today = Day.MONDAY;
            System.out.println("Today is: " + today);
    
           
            TrafficLight currentLight = TrafficLight.RED;
            System.out.println("Current traffic light: " + currentLight);
    
           
            Season currentSeason = Season.SUMMER;
            System.out.println("Current season: " + currentSeason);
    
            
            Planet homePlanet = Planet.EARTH;
            System.out.println("Home planet: " + homePlanet);
    
            
            Direction currentDirection = Direction.NORTH;
            System.out.println("Current direction: " + currentDirection);
    
           
            EducationLevel education = EducationLevel.BACHELORS;
            System.out.println("Education level: " + education);
    
            
            OrderStatus orderStatus = OrderStatus.SHIPPED;
            System.out.println("Order status: " + orderStatus);
    
    
            Currency currency = Currency.USD;
            System.out.println("Currency: " + currency);
    
        
            TransportMode transport = TransportMode.PLANE;
            System.out.println("Transport mode: " + transport);
    
           
            GameLevel gameLevel = GameLevel.MEDIUM;
            System.out.println("Game level: " + gameLevel);
        }
    }
    
    

