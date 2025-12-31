// Last updated: 1/1/2026, 2:20:10 AM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int m=nums1.length;
4        int n= nums2.length;
5        int a[]=new int[m+n];
6        int i=0,j=0,k=0;
7        while(i<m && j<n){
8            if(nums1[i]<=nums2[j]){
9                a[k]=nums1[i];
10                i++;
11
12            }
13            else{
14                a[k]=nums2[j];
15                j++;
16            }
17            k++;
18         
19        }
20        while(i<m){
21            a[k]=nums1[i];
22            i++;
23            k++;
24        }
25         while(j<n){
26            a[k]=nums2[j];
27            j++;
28            k++;
29        }
30        if((m+n)%2!=0){
31            return a[(m+n)/2];
32        }
33        else{
34            int x=(m+n)/2;
35            double p=a[x];
36            double q=a[x-1];
37            return (p+q)/2;
38        }
39        
40    }
41}