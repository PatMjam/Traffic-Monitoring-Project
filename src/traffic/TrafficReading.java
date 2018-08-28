package traffic;

/*-----------------------------------------------------------------------------
*  
*  Doubly linked List Manipulation
*/
 class TrafficReading
 {
    private String ReadingTime = new String();
    private String Location = new String();
    private String NumberOfLanes = new String();
    private String TotalNumbersOfVehicles = new String();
    private String AverageNumberOfVehiclePerLane = new String();
    private String AverageVelocity = new String();
    
    // Creating a Class for Traffic Reading
    
    public TrafficReading()
    {
        ReadingTime = "Time";
        Location = "Location";
        NumberOfLanes = "NumberOfLanes";
        TotalNumbersOfVehicles = "TotalNumberOfVehicles";
        AverageNumberOfVehiclePerLane = "AverageNumberOfVehiclesPerLane";
        AverageVelocity = "AverageVelocity";
    }
    /**---------------------------------------------------------------
     * Purpose: Constructor for the class: TrafficReading. when a Traffic record in instantiated
     * and no default entries for the 4 properties
     */
    
    public TrafficReading(String time, String location, String numberoflanes, String totalnumberofvehicles, String averagenumberofvehiclesperlane, String avergaevelocity)
    {
        ReadingTime = time;
        Location = location;
        NumberOfLanes = numberoflanes;
        TotalNumbersOfVehicles = totalnumberofvehicles;
        AverageNumberOfVehiclePerLane = averagenumberofvehiclesperlane;
        AverageVelocity = avergaevelocity;
    }
    /**-------------------------------------------------------------
     * Purpose : A Method that will allow the calling class to set the Time property
     * this method could include code to validate incoming Time data
     */
    
    public void setTime(String time)
    {
        ReadingTime = time;
    }
    /**--------------------------------------------------------------
     * Purpose: A method that will allow calling class to set the Location property
     * This method could include code to validate incoming Location data
     * @param Location
     * @returns nothing (void)
     */
    public void setLocation(String location)
    {
        Location = location;
    }
    /**----------------------------------------------------------------
     * Purpose: A method that will allow the calling class to set the Average Numbers of Vehicles property
     * This method could include code to validate incoming
     * Location Data
     * @param AvVehicle
     * @returns nothing (void)
     * 
     */
    public void setNumberOfLanes(String numberoflanes)
    {
        NumberOfLanes = numberoflanes;
    }
    /**------------------------------------------------------------
     * Purpose: A method that will allow the calling class to set the AvVelocity(average speed of the cars
     * This method could include code to validate incoming data
     * Location Data
     * @param AvVehicle
     * @returns nothing (void)
     */
     public void setTotalNumberOfVehicle(String totalnumberofvehicles)
     {
         TotalNumbersOfVehicles = totalnumberofvehicles;
     }
     public void setAverageNumberOfVehiclePerLane(String averagenumberofvehiclesperlane)
     {
         AverageNumberOfVehiclePerLane = averagenumberofvehiclesperlane;
     }
     public void setAverageVelocity(String averagevelocity)
     {
         AverageVelocity = averagevelocity;
     }
     /*----------------------------------------------------------
     *Purpose: A method that will allow this TrafficReading class too provide
      the calling class with the Time data.
     This method allows this class to manage outgoing 
     Time
     @param None
     @returns Time (String)
     */
     
     public String getTime()
     {
         return ReadingTime;
     }
     /**----------------------------------------------------------
      * Purpose: A method that will allow this Traffic Reading Class to provide the calling
      * class with the Location Data
      * This method allows this class to manage outgoing
      * Location
      * @param None
      * @returns Likes(String)
      */
     public String getLocation()
     {
         return Location;
     }
     /**------------------------------------------------------------------------
      * Purpose: A method that will allow this Traffic Reading class to provide
      * the calling class with the AvVehicle data.
      * This method allows this class to manage outgoing AvVehicles 
      * @para None
      * @returns AvVehicles
      */
     public String getNumberOfLanes()
     {
         return NumberOfLanes;
     }
     /**----------------------------------------------------------------
      * Purpose: A method that will allow this TrafficReading application class
      * to provide the calling class with AvVelocity data
      * This method allows this class to manage outgoing AvVelocity for cars
      * @param none
      * @returns AvVelocity (String)
      */
     public String getTotalNumberOfVehicles()
     {
         return TotalNumbersOfVehicles;
     }
     public String getAverageNumberOfVehiclePerLane()
     {
         return AverageNumberOfVehiclePerLane;
     }
     public String getAverageVelocity()
     {
         return AverageVelocity;
     }
     
 }

