package nextGreaterElement;

public class Main {

	public static int[] nextGreaterElements(int[] nums) {
        
        int n=nums.length;
        int [] nge=new int[n];
        NStack stack = new NStack();
        int cnt=0;
        int cnt1=0;
        for(int i=2*n-1;i>=0;i--)
        {
        	cnt1++;
        	System.out.println("i:"+i);
        	cnt=0;
            while(!stack.isEmpty() && stack.peek()<=nums[i%n])
            {
                stack.pop();
                cnt++;
            }
            System.out.println("Outer:"+cnt1);
            System.out.println("    Iner:"+cnt);
            if(i<n)
            {
                if(!stack.isEmpty())
                    nge[i]=stack.peek();
                else
                    nge[i]=-1;    
            }
            stack.push(nums[i%n]);
            System.out.println("ele :"+nums[i%n]);
            System.out.println("Stack is:");
            stack.display();
            System.out.println("\n______________");
        }
        
//        System.out.println("cnt:"+cnt);
//        System.out.println("cnt1:"+cnt1);
        return nge;

    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={5,7,1,2,6,0};

        int arr2[] = nextGreaterElements(arr);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
	}

}
