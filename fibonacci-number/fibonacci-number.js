/**
 * @param {number} n
 * @return {number}
 */
var fib = function(n, memo={}) {
    if(n in memo) return memo[n]; // already memoized value found? then return it
    if(n == 1 || n == 2 ) { // base case
        return 1;
    }
    if(n == 0) {
        return 0;
    }
    memo[n] = fib(n-1, memo) + fib(n-2, memo); // if not memoized, then memoize it and store in object
    return memo[n];
};