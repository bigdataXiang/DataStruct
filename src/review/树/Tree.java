package review.树;

/**
 * Created by bigdataxiang on 16-11-16.
 */
public class Tree {
    Node root;//树根

    //插入子节点
    public void insert(int iData ,float fData)
    {
        Node newNode = new Node(iData,fData) ;

        if(root == null)
            root = newNode ;
        else
        {
            Node current = root ;
            Node parent ;
            while(true)//寻找插入的位置
            {
                parent = current ;
                if(iData<current.iData)
                {
                    current = current.left ;
                    if(current == null)
                    {
                        parent.left = newNode ;
                        return ;
                        //程序返回，不再执行下面的代码，结束当前的方法，直接返回
                    }
                }
                else
                {
                    current =current.right ;
                    if(current == null)
                    {
                        parent.right = newNode ;
                        return ;
                    }
                }
            }
        }
    }


}
