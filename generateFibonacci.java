function generateFibonacci(num)
{
	var arr = [ ];
	var sum = 0;
	if (num == 0)
	{
		num = 0;
	}
	else if (num == 1)
	{
		num = 1;
	}
	else
	{
		for (var i = 2; i <= num; i++)
		{
			arr[i] = (i-2) + (i-1);
		}
		for (var i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}
	}
	return sum;
}
