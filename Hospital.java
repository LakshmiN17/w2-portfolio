public class Hospital
{	
	String patientName;
	int patientid;
	static String DocName="Dr murthy";
	void sethospital(String pN,int pID)
	{
		patientName=pN;
		patientid=pID;
	}
	String getpatientName()
	{
		return patientName;
	}
	int getpatientid();
	{
		return patientid;		
	}	
}
public class DemoscopeofVariables
{
	public static void main(String args[])
	{
		String hospitalName="apollo hospital";
		hospital patient1=new hospital();
		patient1.sethospital("anatha josheph",101);
		System.out.println("The patient"+ patient1.getpatientName()+"with the id"+ patient1.getpatientid()+ DocName +"at"+hospitlName);
	}
}
