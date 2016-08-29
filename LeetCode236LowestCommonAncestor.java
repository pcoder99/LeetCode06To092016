Problem Statement:
  Find the lowest common ancestor of two given nodes of a binary tree
  
Implementation:
  public TreeNode lca(TreeNode root, TreeNode p, TreeNode q){
    if(root == null || root == p || root == q){
      return root;
    }
    
    TreeNode left = lca(root.left, p, q);
    TreeNode right = lca(root.right, p, q);
    return (left == null) ? right :  (right == null ? left : root );
  }

My thought: 
  the last statement is fantastic
