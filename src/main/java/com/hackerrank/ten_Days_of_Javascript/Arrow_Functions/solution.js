/*
 * Modify and return the array so that all even elements are doubled and all odd elements are tripled.
 *
 * Parameter(s):
 * nums: An array of numbers.
 */
function modifyArray(nums) {
    nums.forEach((o,i,a)=>{
        if(a[i] % 2 == 0){
            a[i] = a[i] * 2;
        }else{
            a[i] = a[i] * 3;
        }
    });
    return nums;
}
