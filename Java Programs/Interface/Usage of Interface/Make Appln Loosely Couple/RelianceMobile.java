class RelianceMobile
{
	private Sim r = new RelianceSim();

	public RelianceMobile()
	{
		startMobile();
		r.startSim();
	}

	private void startMobile()
	{
		System.out.println("Welcome to Reliance Mobile.");
	}
}