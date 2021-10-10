class TubelightStarter
{
	public static void main(String[] args)
	{
		Tubelight light=new Tubelight();
		String name=light.getName();
		System.out.println("Tube light is"+name);
		light.setWatts(20);
		int wats=light.getWatts();
		System.out.println("Tube light watss is"+wats);
	}
}