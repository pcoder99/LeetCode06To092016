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

Note: n element, the index is from 0 to n - 1, while we need the element 0, 1, ..., n
totally, it would be n + 1 elements in the array.

So, a better coding is to use variable instead of an array.
If you draw a picture, it would be much easy to understand the idea

0 -> 1
1 -> 1  (one_step_before)
2 -> 2  (two_step_before)
3 -> 3

public int func(int n){
  if(n == 0 || n == 1){
    return 1;
  }
  if(n == 2){
    return 2;
  }
  
  int one_step_before = 1;
  int two_steps_before = 2;
  int all_ways = 0;
  for(int i = 3; i < n + 1; i++){
    all_ways = one_step_before + two_steps_before;
    one_step_before = two_steps_before;
    two_steps_before = all_ways;
  }
  return all_ways;
}
}
