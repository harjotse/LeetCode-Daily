class SummaryRanges {
    private Map<Integer,Integer> intervals;

    public SummaryRanges() {
        /*I used tree maps because they are always sorted by key value*/
        intervals = new TreeMap<>();
    }

    public void addNum(int value) {
        //If our map is empty just add that single interval
        if(intervals.isEmpty()){
            intervals.put(value,value);
            return;
        }
        //Call our main function
        validate(value);
    }

    private void validate(int k){
        //Iterate over our map
        for (Map.Entry<Integer,Integer> entry : intervals.entrySet()) {
            Integer value = entry.getValue();
            Integer key = entry.getKey();
            /*If current value is between range of an already 
            exisiting interval just return*/
            if(key<=k && k<=value){
                return;
            }
            /*Example: If our k is 3 and an interval is 4-6 then we add 3-6
            as a new interval and remove the old interval*/
            if(k+1 == key){
                intervals.put(k,value);
                intervals.remove(key);
                return;
            }
            //Example: 1-2 4-5 and k is equal to 3 the first 
            //condition k-1==2 is true so the current map is 1-3 4-5, we then check
            //if the map contains k+1 which is 4, then we merge and the new map is 1-5
            if(k-1 == value){
                intervals.put(key,k);
                if(intervals.containsKey(k+1)){
                    intervals.put(key,intervals.get(k+1));
                    intervals.remove(k+1);
                }
                return;
            }


        }
        //If all the above conidtions fail, that means k is a new interval

        intervals.put(k, k);
    }

    public int[][] getIntervals() {
        if(intervals.size()==0){
            return new int[0][0];
        }

        int[][] res = new int[intervals.size()][2];
        int index=0;
        for (Map.Entry<Integer,Integer> entry : intervals.entrySet()) {
            Integer value = entry.getValue();
            Integer key = entry.getKey();
            res[index][0]=key;
            res[index][1]=value;
            index++;
        }

        return res;
    }
}
//https://leetcode.com/problems/data-stream-as-disjoint-intervals/