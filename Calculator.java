public class Calculator
{
	private int result;
	
	public void add(int ... params)
	{
		for(int param : params)
		{
			this.result +=param;
		}//for
		
		
	}//add
	
	public int getResult()
		{
			return this.result;
		}//get
		
		public void cleanResult()
		{
			this.result=0;
		}//cleanResult
		
		public void div(int ... args) /*throws IOException */{
		if (args.length > 0) {
			this.result = args[0];
			for (int params : args) {
				if (params == 0) {
					/*throw new IllegalArgumentException("You try to div by 0. Please change arg!");*/
					System.out.println("Вы пытаетесь делить на 0. пжлста измените аргумент!");
				}
				this.result /= params;
			}
		} else {
			/*throw new UserException("You should enter args!");*/
			System.out.println("Вы должны ввести аргумент!");
		}
	}

}//class
