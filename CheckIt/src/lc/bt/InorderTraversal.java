package lc.bt;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(list,root);
        return list;
    }
    
    public void preorder(List<Integer> list ,TreeNode root){
        if(root == null) return;
        
        list.add(root.val);
        preorder(list,root.left);
        preorder(list,root.right);
    }
}

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }