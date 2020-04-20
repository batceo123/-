package test;



/**
 * 已知二叉树的前序遍历和中序遍历，重建这棵二叉树
 * @author 海小飞
 *
 */
public class BinaryTree {
	public static void main(String[] args) {
		
	}
	
	
	public TreeNode reConstructBinaryTree(int[] pre,int[] in) {
		int len = pre.length;
		if(len == 0) {
			  return null;
		  }
		TreeNode root = new TreeNode(pre[0]); //前序的第一个数定为根
		//当只有一个数的时候
		if (len == 1) {
			root.left = null;
			root.right = null;
			return root;
		}
		//找到中序中的根位置
		int rootvar = root.val;
		int i = 0;
		for ( i = 0; i < len; i++) {
			if (rootvar == in[i]) {
				break;
			}
		}
		//创建左子树
		if( i>0){
			int[] pr=new int[i];
			int[] ino=new int[i];
			for(int j=0;j<i;j++){
				pr[j]=pre[j+1];
			}
			for(int j=0;j<i;j++){
				ino[j]=in[j];
			}
			root.left=reConstructBinaryTree(pr,ino);
		}else{
			root.left=null;
		}
		//创建右节点
		if (len-i-1>0) {
			int [] pr=new int [len-i-1];
			int [] ino=new int [len-i-1];
			for (int j = i+1; j < len; j++) {
				ino[j-i-1]=in[j];
				pr[j-i-1]=pre[j];	
			}
			root.right=reConstructBinaryTree(pre, ino);
		}else {
			root.left=null;
		}			
		return root;
	}	



}


//二叉树的定义
class TreeNode{
    public char[] value;
	int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
    	val = x;
    	}
}
