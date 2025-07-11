/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {

  return {
    toBe:function (m){

        if(m == val)  return  true;

        return throw new Error("Not Equal");

    },
    notToBe:function (n){

        if(n != val) return  true;

        return throw new Error("Not Equal")



    }
  }  
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */