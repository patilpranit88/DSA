public class printi {

    public static void printnum(int n){
        if(n==1){
            System.out.print(n );
            return;
        }

        printnum(n-1);
        System.out.print(" " +n +" ");
    }

    public static int fact(int n){
        if(n == 0){
            return 1;
        }

        int fnm = fact(n-1);
        int fn = n*fnm;
        return fn;
    }

    public static int sum(int n){
        if(n == 1){
            return 1;
        }

        int snm = sum(n-1);
        int sn = n+snm;
        return sn;
    }

    public static int fib(int  n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int fib1 = fib(n-1);
        int fib2 = fib(n-2);
        int fibn = fib1+fib2;
        return fibn;
    }

    public static boolean  sortarr(int arr[],int i ){
        if(i==arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }

        return sortarr(arr, i+1);

    }
    public static int firstoccurrence(int arr[],int key,int i){
        if(i == arr.length-1){
            return -1;
        }

        if( arr[i] == key){
            return i;
        }

        return firstoccurrence(arr, key, i+1);
    }

    public static int last(int arr[],int key ,int i){
        if(i == arr.length-1){
            return -1;
        }

        int found = last(arr, key, i+1);
        if(found == -1 && arr[i] == key){
            return i;
        }

        return found;
    }
    public static int squre(int x,int n){
        if(n==0){
            return 1;
        }

        return x*squre(x, n-1);
    }

    public static int optipowar(int x,int n){
        if(n==0){
            return 1;
        }

        int half = optipowar(x, n/2);
        int sqhalf = half*half;

        if(n%2 != 0 ){
            sqhalf = x*sqhalf;
        }

        return sqhalf;
    }

    public static int tileprogram(int n){
        if( n==0|| n==1){
            return 1;
        }

        // int fn1 = tileprogram(n-1);
        // int fn2 = tileprogram(n-2);
        // int total = fn1+fn2;
        // return total;

        return tileprogram(n-1)+tileprogram(n-2);
    }
    public static void remove(String str, int ind, StringBuilder newstr, boolean map[]){
        if(ind == str.length()-1){
            System.out.println(newstr);
            return ;
        }
        char  currchar = str.charAt(ind);
        if(map[currchar - 'a'] == true){
            remove(str, ind+1, newstr, map);
        }
        else{
            map[currchar-'a'] = true;
            remove(str, ind+1, newstr.append(currchar), map);
        }

    }

    public static int firendpairing(int n){
        if(n == 1 || n==2){
            return n;
        }

        // int fn1 = firendpairing(n-1);

        // int fn2 = firendpairing(n-2);

        // int pairway = (n-1)*fn2;

        // int total = fn1+pairway;
        return firendpairing(n-1)+(n-1)*firendpairing(n-2);
    }

    public static void BinaryString(int n,int last , String str){
        if(n ==0){
            System.out.println(str);
            return;
        }

        BinaryString(n-1, 1, str+"1");
        if(last == 1){
            BinaryString(n-1, 0, str+"0");
        }
    }
    public static void main(String[] args) {
       
        // String str = "appana";
        
    //    remove(str, 0, new StringBuilder(""), new boolean[26]);
    //  remove(str, 0, new StringBuilder(""), new boolean[26]);
    // System.out.println(firendpairing(3));
    BinaryString(3, 1, "");

    }
}
