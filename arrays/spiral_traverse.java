/**
Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example:

Given the following matrix:

[
    [ 1, 2, 3 ],
    [ 4, 5, 6 ],
    [ 7, 8, 9 ]
]
You should return

[1, 2, 3, 6, 9, 8, 7, 4, 5]
**/

public class ArraysPractice {
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> result = new ArrayList();
        int T=0; //First row
        int B=A.size()-1; //Last row
        int L=0; //First column 
        int R=A.get(0).size()-1; // Last column
        int dir=0; //Direction sign: 0-Left to Right, 1 - Top to Bottom, 2 - Right to Left, 3 - Bottom to Top
        while (T<=B && L<=R){
            List<Integer> row = A.get(T);
            if (dir==0){
                for (int i=L; i<=R; i++){
                    result.add(A.get(T).get(i));
                }
                T++;
                //dir=1;
            }
            else if (dir==1){
                for(int i=T;i<=B;i++){
                    result.add(A.get(i).get(R));
                }
                R--;
                //dir=2;
            }
            else if (dir==2){
                for (int i=R; i>=L; i--){
                    result.add(A.get(B).get(i));
                }
                B--;
                //dir=3;
            }
            else if (dir==3){
                for (int i=B; i>=T; i--){
                    result.add(A.get(i).get(L));
                }
                L++;
                //dir=0;
            }
            dir=(dir+1)%4; //4 - total number of directions
        }
        return result;
    }
}
