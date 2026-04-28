import java.util.*;
class Flight
{
	private int flightId;
	private String flightName;
	private double distance;
	private double cost;
	
	Flight(int flightId,String flightName, double distance, double cost)
	{
		this.flightId=flightId;
		this.flightName=flightName;
		this.distance=distance;
		this.cost=cost;
	}
	
	public int getFlightId()
	{
		return flightId;
	}
	
	public void setFlightId(int flightId)
	{
		this.flightId=flightId;
	}
	
	public String getFlightName()
	{
		return flightName;
	}
	
	public void setFlightId(String flightName)
	{
		this.flightName=flightName;
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void setDistance(double distance)
	{
		this.distance=distance;
	}
	
	public double getCost()
	{
		return cost;
	}
	
	public void getCost(double cost)
	{
		this.cost=cost;
	}
}

class Airlines
{

	private int airLineId;
	private String airLineName;
	private int noOfFlight;
	private List<Flight> flight;

	Airlines(int airLineId,String airLineName,int noOfFlight,List<Flight> flight)
	{
		this.airLineId=airLineId;
		this.airLineName=airLineName;
		this.noOfFlight=noOfFlight;
		this.flight=flight;
	}
	public int getAirLineId()
	{
		return airLineId;
	}
	public void setAirLineId(int airLineId)
	{
		this.airLineId=airLineId;
	}
	public String getAirLineName()
	{
		return airLineName;
	}
	public void setAirLineName(String airLineName)
	{
		this.airLineName=airLineName;
	}
	public int getNoOfFlight()
	{
		return noOfFlight;
	}
	public void setNoOfFlight(int noOfFlight)
	{
		this.noOfFlight=noOfFlight;
	}
	public List<Flight> getFlights()
	{
		return flight;
	}
	public void setFlights(List<Flight> flight)
	{
		this.flight=flight;
	}
}
class Encapsulation
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();sc.nextLine();

		List<Airlines> air= new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			int airLineId=sc.nextInt();sc.nextLine();
			String airLineName=sc.nextLine();
			int noOfFlight=sc.nextInt();sc.nextLine();
			List<Flight> flight= new ArrayList<>();
			for(int j=0;j<noOfFlight;j++)
			{
				int flightId=sc.nextInt();sc.nextLine();
				String flightName=sc.nextLine();
				double distance=sc.nextDouble();sc.nextLine();
				double cost=sc.nextDouble();sc.nextLine();

				flight.add(new Flight(flightId,flightName,distance,cost));
			}
			air.add(new Airlines(airLineId,airLineName,noOfFlight,flight));
		}
		String airLineName=sc.nextLine();
		calculateAverageDistance(air,airLineName);
		getMaxDistance(air);

	}

	public static void calculateAverageDistance(List<Airlines> air, String airLineName)
	{
		int noOfFlight1=0;
		double sum=0;
		for(Airlines ai: air)
		{
			for(Flight flight:ai.getFlights())
			{
				if(ai.getAirLineName().toLowerCase().equals(airLineName.toLowerCase()))
				{
					sum+=flight.getDistance();
					noOfFlight1++;
				}
			}
		}
		double avgDistance=sum/noOfFlight1;
		System.out.println(avgDistance);
	}
	public static void getMaxDistance(List<Airlines> air)
	{
		double maxCost=0;
		Flight air2=null;
		for(Airlines ai:air)
		{
			for(Flight flight:ai.getFlights())
			{
				if(maxCost<flight.getCost())
				{
					maxCost=flight.getCost();
					air2=flight;
				}
			}
		}
		
		System.out.println("Flight Name : " +air2.getFlightName());
		System.out.println("Flight Cost : " +maxCost);
	}
}



/*

Input :

2
101
Indigo
2
1
IndigoA1
500.5
4500
2
IndigoA2
600.0
5000
102
AirIndia
1
3
AI101
700.0
6000
Indigo

*/