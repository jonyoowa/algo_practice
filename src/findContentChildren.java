import java.util.Arrays;

public class findContentChildren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		
		int g_index = 0;
		
		for (int s_index = 0; g_index < g.length && s_index < s.length; s_index++) {
			if (g[g_index] <= s[s_index]) {
				g_index++;
			}
		}
		
		return g_index;
	}

}
