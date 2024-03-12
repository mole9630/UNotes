int zdgys(int m,int n)
{
	int r;
	r = m % n;
	while(r!=0)
	{
		m = n;
		n = r;
		r = m % n;
	}
	return n;
}

int zxgbs(int m,int n)
{
	return m * n / zdgys(m,n);
}
