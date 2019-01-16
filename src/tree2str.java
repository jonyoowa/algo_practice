
public class tree2str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String tree2str(TreeNode t) {
		if (t == null) {
			return "";
		}
		
		StringBuilder sb = new StringBuilder();
		recurse(t, sb);
		return sb.toString();
	}
	
	public static void recurse(TreeNode t, StringBuilder sb) {
		sb.append(t.val);

        if (t.left != null) {
            sb.append("(");
            recurse(t.left,sb);
            sb.append(")");
        }
        
        if (t.left==null && t.right!=null) {
            sb.append("()");
        }
        
        if (t.right != null) {
            sb.append("(");
            recurse(t.right,sb);
            sb.append(")");
        }
	}
}
