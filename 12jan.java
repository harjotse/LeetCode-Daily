class Solution {
    public int[] countSubTrees(int n, int[][] edges, String labels) {

        // creating an adjacency list
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<n; i++){
            adjList.add(new ArrayList<Integer>());
        }
        for(int[] edge: edges){
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        // ans array
        int[] ans = new int[n];

        //calling dfs method
        dfs(adjList, labels, -1, 0, ans);

        return ans;
        
    }
    public int[] dfs(List<List<Integer>> ls, String labels, int parent, int cur, int[] ans){
        // creating a frequency array for storing frequency of labels in a subtree 
        int[] alpha = new int[26];

        for(int i=0; i<ls.get(cur).size(); i++){
            if(ls.get(cur).get(i) == parent) continue;
            
            // temp is the frequency array returned to parent by child
            int temp[] = dfs(ls, labels, cur,ls.get(cur).get(i), ans);

            // updating current nodes frequency list
            for(int j=0; j<26; j++){
                alpha[j] += temp[j];
            }
        }

        // We also have to add the frequency of the label of current node i.e. we have to add 1 at that position 
        alpha[labels.charAt(cur)-97] += 1;

        // updating the ans array
        ans[cur] += alpha[labels.charAt(cur)-97];
        return alpha;

    }
}
// https://leetcode.com/problems/number-of-nodes-in-the-sub-tree-with-the-same-label/