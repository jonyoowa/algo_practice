
public class quadTreeNode {
    public boolean val;
    public boolean isLeaf;
    public quadTreeNode topLeft;
    public quadTreeNode topRight;
    public quadTreeNode bottomLeft;
    public quadTreeNode bottomRight;

    public quadTreeNode() {}

    public quadTreeNode(boolean _val,boolean _isLeaf,quadTreeNode _topLeft,quadTreeNode _topRight,quadTreeNode _bottomLeft,quadTreeNode _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
}
