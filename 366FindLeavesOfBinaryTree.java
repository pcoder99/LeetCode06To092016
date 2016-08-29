Problem Statement
  Given a binary tree, collect a tree's nodes as if you are doing this : collect and remove leaves, repeat until 
the tree is empty

Idea:
  Correlate node level with list node index. This is the coolest part of the idea

  The key is "group leaves according to its height". Here is the definition of the height of a node
  "number of edges from the node to the deepest leave"

Implementation:

  public List<List<Integer>> findLeaves(TreeNode root){
    List<List<Integer> res = new LinkedList<>();
    helper(root, res);
    return res;
  }

  public int height(TreeNode root, List<List<Integer>> res){
    if(root == null) return -1;
    int level = 1 + Math.max(height(root.left, res), height(root.right, res));
    if(res.size() < (level + 1)) res.add(new ArrayList<>());
    res.get(level).add(root.val);
    return level;
    
  }

  
