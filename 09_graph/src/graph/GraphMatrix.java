package graph;

import java.util.Scanner;

import queue.Queue;

public class GraphMatrix {
	int nov;
	int [][]a;
	
	public GraphMatrix(int v)
	{
		nov=v;
		a=new int[nov][nov];
	}
	
	public void createGraph()
	{
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<nov;++i)
		{
			for(int j=0;j<nov;++j)
			{
				System.out.print("("+i+")---("+j+") :");
				a[i][j]=sc.nextInt();
				System.out.println();
			}
		}
	}
	
	public void displayMatrix()
	{
//		System.out.println();
		for(int i=0;i<nov;++i)
		{
			System.out.print("| ");
			for(int j=0;j<nov;++j)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("|");
		}
	}
	
	public void DFS()
	{
		int []v=new int[nov];
		int start=3;
		System.out.println(start);
		v[3]=1;
		
		for(int i=0;i<nov;i++)
		{
			for(int j=0;j<nov;)
			{
				if(a[start][j]==1 && v[j]==0)
				{
					System.out.println(j);
					v[j]=1;
					start=j;
					
				}else
					j++;
			}
		}
	}
	
	public void BFS()
	{
		int start=0;
		Queue q=new Queue();
		q.enqueue(start);
		int []v=new int[nov];
		v[0]=1;
		while(!q.isEmpty())
		{
			int it=q.dequeue();
			System.out.println(it);
			for(int j=0;j<nov;++j)
			{
				if(a[it][j]==1 && v[j]==0)
				{
					q.enqueue(j);
					v[j]=1;
				}  
			}
			
			
		}
		
	}

}
