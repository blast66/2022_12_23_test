import javax.imageio.plugins.tiff.FaxTIFFTagSet;

public class test32 {
    public static void main(String[] args){
        int[] a = {7,5,4,9,8,1,2};
        int[] g = {0,0,0,0,0,0,0};
        int midle = 0;
        int max = 0;
        int low = 0;
        int b =0;
        float    midl = 0;
        max = a[0];
        low = a[0];
        for (int c = a.length-1; c >=0 ; c = c-1){
            for(int i = 0; i<a.length; i++){

                if(a[i]>a[c]){
            
                    b = a[i];
                    a[i] = a[c];
                    a[c] = b; 
                }

                
            }
        }
        
        for(int i = 0; i<g.length; i++){
            if(g[i] > max){
                max = g[i];
                System.out.println(max);
            }
            if(g[i] < low){
                low = g[i];
        
            }
            midl = midl + g[i];
        }
            System.out.println("max = " + max );
            System.out.println("low = " + low );
            System.out.println("aaaa = " + (midl/7));
            System.out.println(" midle = " + (a[a.length/2]+1));
        
    }
}