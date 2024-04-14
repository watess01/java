package prep.modules.Ancestor;

public class Ancestor {

    /*
     * Find the first (lowest) common ancestor of two nodes in a binary tree without allocating any tree data structure in memory.

The first common ancestor of two nodes v and w is the lowest (i.e. deepest) node that has both v and w as descendants.

Consider the binary tree's indexes starting from 1 in the root, increasing from the leftmost node to the right at each level. (Standard tree node indexing from left to right)
     */

	public static int run(int index1, int index2) {

        
		
		int index_common_ancestor = 0;
		int index1_parent = index1 / 2;
		int index2_parent = index2 / 2;
		while (index1_parent != index2_parent) {
			if (index1_parent > index2_parent) {
				index1_parent = index1_parent / 2;
			} else {
				index2_parent = index2_parent / 2;
			}
		}
		index_common_ancestor = index1_parent;
		
		return index_common_ancestor;
	}
}
