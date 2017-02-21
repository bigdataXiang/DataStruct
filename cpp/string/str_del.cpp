void str_del(char *src,char c)
{
    int n=0,i=0;
    while(src[i]){
        if(src[i]!=c){
            src[n++]=src[i];
        }
        i++;
    }
}
int main(){
    char*  hl= "ABCDEAFDWEAAFWEFAEFAWFAWFAWEFWGAWBVDVCDAGWECEDVWEGBAAWEFAWEBWAE";
    str_del(hl,'A');
    printf(h1);
}