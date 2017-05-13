package hr.cci;

public class CheckBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	//-------------------------------------------------------
	
	boolean checkBST(Node root) {
        return recursiveCheck(root, -1, 10001);       
    }

    boolean recursiveCheck(Node root, int min, int max){
        
        if(root == null)
            return true;
    
        if(root.data <= min || root.data >= max)
            return false;

        return(recursiveCheck(root.left, min, root.data) && recursiveCheck(root.right, root.data, max));
                

    }
	//------------------------------------------------------
	
	/*boolean checkBST(Node root) {
        //left node < data
        //right node > data
        if(root == null) return true;
       
        return validLeft(root.left,root.data) && validRight(root.right,root.data);
    }

    boolean validLeft(Node n, int data){
        if(n == null) return true;
        else if(n.data >= data) return false;
        return checkBST(n);
    }
   

    boolean validRight(Node n, int data){
        if(n == null) return true;
        else if(n.data <= data) return false;
        return checkBST(n);
    }
*/
}

class Node {
    int data;
    Node left;
    Node right;
 }