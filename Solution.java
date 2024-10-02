import java.util.ArrayList;

import javax.swing.tree.TreeNode;

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        ArrayList<TreeNode> bfs = new ArrayList<>();
        bfs.add(root);
        int sum = 0;

        while(!bfs.isEmpty()){
            TreeNode curr = bfs.getFirst();
            bfs.removeFirst();
            
            if(curr.left != null)   bfs.add(curr.left);
            if(curr.right!= null)   bfs.add(curr.right);

            //add if node is left leaf
            if(curr.left != null){
                if(curr.left.left == null && curr.left.right == null)
                sum += curr.left.val;
            }
            
        }
        return sum;
    }
}