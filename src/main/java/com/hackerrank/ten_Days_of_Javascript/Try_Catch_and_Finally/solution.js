/*
 * Complete the reverseString function
 * Use console.log() to print to stdout.
 */
function reverseString(s) {
    try{
        let arrays= s.split('');
        arrays.reverse();
        s = arrays.join('');
        console.log(s);
    }catch(e){
        console.log(e.message);
        console.log(s);
    }

}
