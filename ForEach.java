/* for-each Loop Statement..! */
class ForEach
{
    public static void main(String[] args) {

        int a[]={10,20,30,40,50};

        for ( int b : a) {
            
            System.out.print(b + " ");
        }

        for (int i=0;i<a.length;i++) {

            System.out.print(a[i]+ " ");
        }
    }
}
