class Solution {
    //o(6n)
public:
    string longestCommonPrefix(vector<string>& strs) {
        string prefix = "";
        if(strs.size()==0) return prefix;
        
        /* check char by char, for each char, check all the string word */
        for(int i=0; i<strs[0].size(); ++i){
            int j = 1;
            for(; j< strs.size() && i < strs[j].size(); ++j){
                if(strs[0][i] != strs[j][i]){
                    return prefix;
                }
                
            }
            if(j==strs.size()) prefix+=strs[0][i];
        }
        return prefix;
    }
};
