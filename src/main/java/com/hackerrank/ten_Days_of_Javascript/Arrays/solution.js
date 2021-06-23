/**
 *   Return the second largest number in the array.
 *   @param {Number[]} nums - An array of numbers.
 *   @return {Number} The second largest number in the array.
 **/
function getSecondLargest(nums) {
    // Complete the function
    let max = 0;
    let second_max = 0;
    for(let i=0;i<nums.length;i++){
        if(nums[i]>max){
            second_max = max;
            max = nums[i];
        }else if(nums[i]<max && nums[i]>second_max){
            second_max = nums[i];
        }
    }
    return second_max;
}
