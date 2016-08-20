Problem Statement:
You are climbing a stair case. It takes n steps to reach to the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Thinking
to step 0/1, you have one way; 
to step 2, you have two ways -> 1+1, 2

Code

my first thought is to use array
public int ClimbStairs(int n){

  if(n == 0 || n == 1)
    return 1;
    int[] ways = new int[n+1];
    ways[0] = 1;
    ways[1] = 1;
  
  for(int i = 2; i <= n + 1; i++){
    ways[i] = ways[i - 1] + ways[i - 2];
  }
  
  return ways[n];
}
