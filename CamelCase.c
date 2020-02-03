#include <stdlib.h>
#include <ctype.h>

char *camel_case(char *s)
{
    int j = 0;
    char *ans = malloc(sizeof(char)*strlen(s));
    if(s[0] > 96 && s[0] < 123){
        s[0] = s[0] - 32;
    }
    for(int i = 0; i < strlen(s); i++){
        if(s[i] != ' '){
            ans[j] = s[i];
            j++;
        }else{
            if(s[i+1] > 96 && s[i+1] < 123){
                s[i+1] = s[i+1] - 32;
            }
        } 
        
    }
    ans[j] = '\0';
    return ans;
}