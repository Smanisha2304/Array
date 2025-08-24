class Solution {
     List<List<Integer>> outer = new ArrayList<>();
     
    
    public List<List<Integer>> generate(int numRows) {
        outer.clear();

        if(numRows>=1)
        {
            outer.add(Arrays.asList(1));
        }
        for(int i=1;i<numRows;i++)
        {
            List<Integer> fin = outer.get(i-1);
            List<Integer> fin1 = new ArrayList<>();
            fin1.add(1);
            for(int j = 1 ;j<fin.size();j++)
            {
                fin1.add(fin.get(j-1)+fin.get(j));
            }
            fin1.add(1);
            outer.add(fin1);
        }
        return outer;
    }

}