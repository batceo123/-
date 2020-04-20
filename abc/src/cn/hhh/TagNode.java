/**
 * 
 */
package cn.hhh;

/**
 * @author 海小飞
 *递归法实现二叉排序树的查找功能。
 */
public class TagNode {

	    int iKey;            //结点的键值
	    TagNode pLChild;    //左子树的指针
	    TagNode pRChild;     //右子树的指针

	    public static TagNode searchTree1(TagNode pRoot, int iKey) {
	       if (pRoot == null) {      //如果头是空的，那直接返回找不到
	           return null;
	       }
	       if (pRoot.iKey > iKey) {         //在左子树上
	           return searchTree1(pRoot.pLChild, iKey);
	       } else if (pRoot.iKey < iKey) {      //在右子树上。
	           return searchTree1(pRoot.pRChild, iKey);
	       }
	       return pRoot;        //查找成功
	    }
	    
	}


